import os
import pandas as pd
from sklearn.model_selection import train_test_split
from tensorflow import keras
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras.optimizers import Adam
from tensorflow.keras.callbacks import EarlyStopping

ruta_archivo = os.path.realpath(__file__).replace("\\Recursos_ingenieria\\Crear_modelo.py", "")
ruta_ultimo_modelo = ruta_archivo + "\\Otros_recursos\\Ultimo_modelo.csv"

# Leer el nombre del último modelo del archivo CSV
nombre_modelo = pd.read_csv(ruta_ultimo_modelo, header=None).values[0][0]

# # Leer los datos del modelo del archivo CSV
ruta_datos_modelo = ruta_archivo + "\\Modelos\\" + nombre_modelo + "\\datos.csv"
datos_modelo = pd.read_csv(ruta_datos_modelo, header=None).values.tolist()

# Definición de rutas y clases
dir_positivo = datos_modelo[7][0]
dir_negativo = datos_modelo[8][0]
tamaño = datos_modelo[6][0]
dimension_entrada = int(datos_modelo[5][0])

dirlist = [dir_positivo, dir_negativo]

classes = ['Positivo', 'Negativo']

# Creación de DataFrame con rutas de archivos y etiquetas
filepaths = []
labels = []

for i, cls in zip(dirlist, classes):
    filelist = [f for f in os.listdir(i) if f.endswith('.jpg') or f.endswith('.png')]
    # Si quieres la misma cantidad de imágenes positivas y negativas
    if cls == 'Negativo':
        filelist = filelist[:len([label for label in labels if label == 'Positivo'])]
    for f in filelist:
        filepath = os.path.join(i, f)
        filepaths.append(filepath)
        labels.append(cls)

df = pd.DataFrame(list(zip(filepaths, labels)), columns=['filepaths', 'labels'])


# División de los datos
train, test = train_test_split(df, train_size=0.95, random_state=0)
train_new, valid = train_test_split(train, train_size=0.90, random_state=0)

# Generadores de datos
train_datagen = ImageDataGenerator(rescale=1./255., rotation_range=40, width_shift_range=0.2, height_shift_range=0.2, shear_range=0.2, zoom_range=0.2, horizontal_flip=True, vertical_flip=True)
valid_datagen = ImageDataGenerator(rescale=1./255.)
test_datagen = ImageDataGenerator(rescale=1./255.)

train_gen = train_datagen.flow_from_dataframe(train_new, x_col='filepaths', y_col='labels', target_size=(dimension_entrada,dimension_entrada), batch_size=32, class_mode='binary', shuffle=True)
val_gen = valid_datagen.flow_from_dataframe(valid, x_col='filepaths', y_col='labels', target_size=(dimension_entrada,dimension_entrada), batch_size=16, class_mode='binary', shuffle=True)
test_gen = test_datagen.flow_from_dataframe(test, x_col='filepaths', y_col='labels', target_size=(dimension_entrada,dimension_entrada), batch_size=16, class_mode='binary', shuffle=False)

# Creación del modelo
if tamaño == "Chico":
    base_model = keras.applications.EfficientNetV2B0(weights=None, input_shape=(dimension_entrada, dimension_entrada, 3), include_top=False)
elif tamaño == "Mediano":
    base_model = keras.applications.EfficientNetV2B2(weights=None, input_shape=(dimension_entrada, dimension_entrada, 3), include_top=False)
elif tamaño == "Grande":
    base_model = keras.applications.EfficientNetV2B3(weights=None, input_shape=(dimension_entrada, dimension_entrada, 3), include_top=False)
elif tamaño == "Muy grande":
    base_model = keras.applications.EfficientNetV2S(weights=None, input_shape=(dimension_entrada, dimension_entrada, 3), include_top=False)
base_model.trainable = True

inputs = keras.Input(shape=(dimension_entrada, dimension_entrada, 3))
x = base_model(inputs, training=True)
x = keras.layers.GlobalAveragePooling2D()(x)
x = keras.layers.Dropout(0.2)(x)
outputs = keras.layers.Dense(1, activation="sigmoid")(x)
model = keras.Model(inputs, outputs)

# Callback de parada temprana
early_stopping = EarlyStopping(monitor='val_loss', patience=10)

# Entrenamiento del modelo
model.compile(loss='binary_crossentropy', optimizer=Adam(learning_rate=0.0001), metrics=['accuracy'])
history = model.fit(train_gen, validation_data=val_gen, epochs=100, verbose=1, callbacks=[early_stopping])

# Guardar el modelo
ruta_modelo = ruta_archivo + "\\Modelos\\" + nombre_modelo + "modelo.h5"
model.save(ruta_modelo)