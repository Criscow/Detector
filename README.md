## Detector de cancer

Detector de cancer preentrenado.

## Guia de instalacion para componentes basicos

Dependencias necesarias

- `JDK(Java Development Kit)`: Descargar e instalar el JDK mas reciente.
- `Python`: Descargar e instalar la version mas reciente de Python.
- `Descargar Java`: Descargar e instalar directamnete desde https://www.java.com.
- `Instalar las librerias necesarias de python`: Instalar atra vez de pip pandas, tensorflow, scikit-learn y pillow.

## Guia de instalacion para componentes de aceleramiento por hardware

Para tarjeta NVIDIA:

- Descarga e instala los controladores específicos para tu GPU NVIDIA.
- Descarga la versión compatible con tu GPU del CUDA Toolkit.
- Verifica la instalación escribiendo en la consola: `nvcc --version`.
- Ejecuta el siguiente comando en la consola: `pip install tensorflow-gpu`.

Para tarjetas AMD

- Descargar e instalar los controladres especificos de su GPU.
- Instalar ROCm(Radeon Open Compute).
- Verificar la instalacion de ROCm escribiendo en la consola `rocm-smi`.
- Ejecutar el comando en la consola `pip install tensorflow-rocm`.