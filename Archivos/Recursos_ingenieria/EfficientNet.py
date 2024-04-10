# Importaciones necesarias de TensorFlow
from tensorflow.keras import Model, layers, activations
import tensorflow as tf
import math

# Función para redondear el número de filtros según un multiplicador
def redondear_filtros(filtros, multiplicador=1.):
    divisor = 8
    profundidad_mínima = 8
    filtros *= multiplicador
    profundidad_mínima = profundidad_mínima or divisor
    nuevos_filtros = max(profundidad_mínima, int(filtros + divisor / 2) // divisor * divisor)
    return int(nuevos_filtros)

# Función para redondear el número de repeticiones según un multiplicador
def redondear_repeticiones(repeticiones, multiplicador=1.):
    return int(math.ceil(multiplicador * repeticiones))

# Función para implementar la técnica Squeeze-and-Excite (SE)
def compresión_y_excitación(x, canales_entrada, canales_salida, activación, proporción_reducción=4):
    x = layers.GlobalAvgPool2D()(x)  # Pooling global promedio
    x = layers.Dense(canales_entrada // proporción_reducción)(x)  # Reducción de dimensionalidad
    x = layers.Activation(activación)(x)  # Activación
    x = layers.Dense(canales_salida)(x)  # Expansión de dimensionalidad
    x = layers.Activation(activations.sigmoid)(x)  # Activación sigmoide para pesos de atención
    return x

# Función para un bloque MBConv fusionado
def mbconv_fusionado(x, canales_entrada, canales_salida, tamaño_núcleo, activación, stride=1, proporción_reducción=4,
                 expansión=6, dropout=None, drop_connect=.2):
    atajo = x
    expandido = redondear_filtros(canales_entrada * expansión)

    if expansión != 1:
        x = layers.Conv2D(expandido, tamaño_núcleo, stride, padding="same", use_bias=False)(x)  # Convolución expandida
        x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
        x = layers.Activation(activación)(x)  # Activación

        if (dropout is not None) and (dropout != 0.):
            x = layers.Dropout(dropout)(x)  # Dropout

    if proporción_reducción is not None:
        se = compresión_y_excitación(x, canales_entrada, expandido, activación, proporción_reducción)
        x = layers.Multiply()([x, se])  # Multiplicación por pesos de atención

    x = layers.Conv2D(canales_salida, (1, 1) if expansión != 1 else tamaño_núcleo, 1, padding="same", use_bias=False)(x)  # Convolución de proyección
    x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
    if expansión == 1:
        x = layers.Activation(activación)(x)  # Activación si no se expandió

    # Conexión residual con Stochastic Depth
    if (stride == 1) and (canales_entrada == canales_salida):
        x = StochasticDepth(1 - drop_connect)([atajo, x])
    return x


class StochasticDepth(tf.keras.layers.Layer):
    def __init__(self, drop_prob, **kwargs):
        super(StochasticDepth, self).__init__(**kwargs)
        self.drop_prob = drop_prob

    def call(self, inputs, training=None):
        if training:
            batch_size = tf.shape(inputs)[0]
            random_tensor = tf.random.uniform([batch_size, 1, 1, 1])
            keep_prob = 1 - self.drop_prob
            binary_tensor = tf.floor(random_tensor + keep_prob)
            output = tf.math.divide(inputs, keep_prob) * binary_tensor
        else:
            output = inputs
        return output


# Función para un bloque MBConv estándar
def mbconv(x, canales_entrada, canales_salida, tamaño_núcleo, activación, stride=1,
           proporción_reducción=4, expansión=6, dropout=None, drop_connect=.2):
    atajo = x
    expandido = redondear_filtros(canales_entrada * expansión)

    if expansión != 1:
        x = layers.Conv2D(expandido, (1, 1), 1, padding="same", use_bias=False)(x)  # Convolución de expansión
        x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
        x = layers.Activation(activación)(x)  # Activación

    x = layers.DepthwiseConv2D(kernel_size=tamaño_núcleo, strides=stride, padding="same", use_bias=False)(x)  # Convolución en profundidad
    x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
    x = layers.Activation(activación)(x)  # Activación

    if (expansión != 1) and (dropout is not None) and (dropout != 0.):
        x = layers.Dropout(dropout)(x)  # Dropout

    if proporción_reducción is not None:
        se = compresión_y_excitación(x, canales_entrada, expandido, activación, proporción_reducción)
        x = layers.Multiply()([x, se])  # Multiplicación por pesos de atención

    x = layers.Conv2D(canales_salida, (1, 1), 1, padding="same", use_bias=False)(x)  # Convolución de proyección
    x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes

    # Conexión residual con Stochastic Depth
    if (stride == 1) and (canales_entrada == canales_salida):
        x = StochasticDepth(1 - drop_connect)([atajo, x])
    return x

# Función para repetir un bloque MBConv un número determinado de veces
def repetir(x, count, canales_entrada, canales_salida, tamaño_núcleo, activación,
           stride=1, proporción_reducción=None, expansión=6, fusionado=False, dropout=None, drop_connect=.2):
    for i in range(count):
        if fusionado:
            x = mbconv_fusionado(x, canales_entrada, canales_salida, tamaño_núcleo,
                             activación, stride, proporción_reducción, expansión, dropout, drop_connect)
        else:
            x = mbconv(x, canales_entrada, canales_salida, tamaño_núcleo, activación, stride,
                       proporción_reducción, expansión, dropout, drop_connect)
    return x

# Función para definir una etapa de la red con repeticiones de MBConv
def etapa(x, count, canales_entrada, canales_salida, tamaño_núcleo, activación,
          stride=1, proporción_reducción=None, expansión=6, fusionado=False, dropout=None, drop_connect=.2):
    x = repetir(x, count=1, canales_entrada=canales_entrada, canales_salida=canales_salida, tamaño_núcleo=tamaño_núcleo,
               activación=activación, stride=stride, proporción_reducción=proporción_reducción,
               expansión=expansión, fusionado=fusionado, dropout=dropout, drop_connect=drop_connect)  # Primer bloque con stride

    x = repetir(x, count=count - 1, canales_entrada=canales_salida, canales_salida=canales_salida, tamaño_núcleo=tamaño_núcleo,
               activación=activación, stride=1, proporción_reducción=proporción_reducción,  # Bloques restantes con stride 1
               expansión=expansión, fusionado=fusionado, dropout=dropout, drop_connect=drop_connect)
    return x

# Función para construir la arquitectura base de EfficientNetV2
def base(cfg, num_classes=1000, input_tensor=None, activación=activations.swish,
         multiplicador_ancho=1., multiplicador_profundidad=1., tasa_dropout_conv=None, tasa_dropout=None, drop_connect=.2):
    """
    EfficientNet-V2-s, reimplementación según
    https://arxiv.org/abs/2104.00298
    y el código oficial
        https://github.com/google/automl/tree/master/efficientnetv2
    EfficientNetV2: Modelos más pequeños y entrenamiento más rápido
    por Mingxing Tan, Quoc V. Le

    :param cfg: configuración de las etapas
    :param num_classes: número de clases de salida
    :param input_tensor: tensor de entrada dado, si se proporciona, se ignorará in_shape
    :param activación: activación a utilizar en las capas ocultas
    :param multiplicador_ancho: factor de ancho, por defecto 1.0
    :param multiplicador_profundidad: multiplicador de profundidad, por defecto 1.0
    :param tasa_dropout_conv: probabilidad de dropout después de cada MBConv/etapa, 0 o None significa que no se aplicará dropout
    :param tasa_dropout: probabilidad de dropout después de GlobalAveragePooling, 0 o None significa que no se aplicará dropout
    :param drop_connect: probabilidad de dropout espacial en las conexiones residuales, 0 o None significa que no se aplicará dropout
    :return: un modelo tf.keras
    """
    inp = input_tensor
    # etapa 0
    x = layers.Conv2D(cfg[0][4], kernel_size=(3, 3), strides=2, padding="same", use_bias=False)(inp)  # Convolución inicial
    x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
    x = layers.Activation(activación)(x)  # Activación

    # Etapas de la red
    for configuración_etapa in cfg:
        x = etapa(x, count=redondear_repeticiones(configuración_etapa[0], multiplicador_profundidad),
                  canales_entrada=redondear_filtros(configuración_etapa[4], multiplicador_ancho),
                  canales_salida=redondear_filtros(configuración_etapa[5], multiplicador_ancho),
                  tamaño_núcleo=configuración_etapa[1], activación=activación, stride=configuración_etapa[2],
                  proporción_reducción=configuración_etapa[7], expansión=configuración_etapa[3], fusionado=configuración_etapa[6] == 1,
                  dropout=tasa_dropout_conv, drop_connect=drop_connect)

    # etapa final
    x = layers.Conv2D(redondear_filtros(1280, multiplicador_ancho), (1, 1), strides=1, padding="same", use_bias=False)(x)  # Convolución final
    x = layers.BatchNormalization(epsilon=1e-5)(x)  # Normalización de lotes
    x = layers.Activation(activación)(x)  # Activación

    x = layers.GlobalAvgPool2D()(x)  # Pooling global promedio
    if (tasa_dropout is not None) and (tasa_dropout != 0):
        x = layers.Dropout(tasa_dropout)(x)  # Dropout
    x = layers.Dense(num_classes)(x)  # Capa densa para clasificación
    x = layers.Activation(activations.softmax)(x)  # Activación softmax para probabilidades

    return Model(inp, x)  # Creación del modelo

# Funciones para crear modelos EfficientNetV2-s, m, l y xl con configuraciones específicas
def s(in_shape=(224, 224, 3), num_classes=1000, input_tensor=None, activación=activations.swish,
      multiplicador_ancho=1., multiplicador_profundidad=1., tasa_dropout_conv=None, tasa_dropout=None, drop_connect=.2):
    """
        EfficientNet-V2-s, reimplementación según
        https://arxiv.org/abs/2104.00298
        y el código oficial
        https://github.com/google/automl/tree/master/efficientnetv2
        EfficientNetV2: Modelos más pequeños y entrenamiento más rápido
        por Mingxing Tan, Quoc V. Le

        :param in_shape: forma de entrada del modelo, en la forma (H, W, C)
        :param num_classes: número de clases de salida
        :param input_tensor: tensor de entrada dado, si se proporciona, se ignorará in_shape
        :param activación: activación a utilizar en las capas ocultas
        :param multiplicador_ancho: factor de ancho, por defecto 1.0
        :param multiplicador_profundidad: multiplicador de profundidad, por defecto 1.0
        :param tasa_dropout_conv: probabilidad de dropout después de cada MBConv/etapa, 0 o None significa que no se aplicará dropout
        :param tasa_dropout: probabilidad de dropout después de GlobalAveragePooling, 0 o None significa que no se aplicará dropout
        :param drop_connect: probabilidad de dropout espacial en las conexiones residuales, 0 o None significa que no se aplicará dropout
        :return: un modelo tf.keras
    """

    # Cada fila es una etapa
    # count, tamaño del núcleo, stride, relación de expansión, canal de entrada, canal de salida, es fusionado (1 si es verdadero), relación de reducción (None si no hay se)
    cfg = [
        [2, 3, 1, 1, 24, 24, 1, None],
        [4, 3, 2, 4, 24, 48, 1, None],
        [4, 3, 2, 4, 48, 64, 1, None],
        [6, 3, 2, 4, 64, 128, 0, 4],
        [9, 3, 1, 6, 128, 160, 0, 4],
        [15, 3, 2, 6, 160, 256, 0, 4],
    ]
    input_tensor = layers.Input(in_shape) if input_tensor is None else input_tensor
    return base(cfg=cfg, num_classes=num_classes, input_tensor=input_tensor, activación=activación,
                multiplicador_ancho=multiplicador_ancho, multiplicador_profundidad=multiplicador_profundidad, tasa_dropout_conv=tasa_dropout_conv,
                tasa_dropout=tasa_dropout, drop_connect=drop_connect)

# ... (definiciones similares para m, l y xl con diferentes configuraciones cfg) ...

def main():
    modelo = s((224, 224, 3), 1000)  # Creación de un modelo EfficientNetV2-xl
    modelo.summary()  # Resumen del modelo

if __name__ == '__main__':
    main()