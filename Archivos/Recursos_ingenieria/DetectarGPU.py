import tensorflow as tf

# Codigo que retornada GPU disponible si hay algun
# sistema de aceleracion por GPU de Nvidia disponible

if tf.test.gpu_device_name():
    print("GPU disponible")
else:
    print('GPU no disponible')
