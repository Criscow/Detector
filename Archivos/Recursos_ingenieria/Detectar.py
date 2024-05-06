import os
import numpy as np
from tensorflow import keras
import cv2
from PIL import Image
import csv
import sys
import io

sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')

ruta_archivos = os.path.realpath(__file__).replace("\\Recursos_ingenieria\\Detectar.py", "")
modelo = None
with open(ruta_archivos + "\\Otros_recursos\\Modelo_en_uso.csv", 'r') as archivo:
        lector_csv = csv.reader(archivo)
        modelo = next(lector_csv)[0].replace(" ", "_")
    
ruta_modelo = ruta_archivos + "\\Modelos" + "\\" + modelo + "\\modelo.keras"
modeloCargado = keras.models.load_model(ruta_modelo)
rutas = []

with open(ruta_archivos + "\\Otros_recursos\\Rutas_imagenes_detectar.csv", 'r') as archivo:
        lector_csv = csv.reader(archivo)
        for linea in lector_csv:
            rutas.append(linea[0])

resultados = []
for ruta in rutas:
    imagen = cv2.imread(ruta)
    image_fromarray = Image.fromarray(imagen, 'RGB')
    resize_image = image_fromarray.resize((224, 224))
    input_data = np.expand_dims(np.array(resize_image), axis=0) / 255.
    pred = modeloCargado.predict(input_data)
    resultados.append(pred)
    

print(resultados)

with open(ruta_archivos + "\\Otros_recursos\\Indice_en_uso.csv", 'r') as archivo:
        lector_csv = csv.reader(archivo)
        indice = next(lector_csv)[0].replace(" ", "_")

with open(ruta_archivos + "\\Registros\\" + indice + "\\resultados.csv", 'w', newline='', encoding='utf-8') as archivo:
    escritor = csv.writer(archivo)
    for resultado in resultados:
        escritor.writerow(resultado[0])