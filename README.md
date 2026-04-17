markdown
# Lista Doblemente Enlazada Circular – Proyecto completo

Este repositorio contiene la implementación de una **lista doblemente enlazada circular** en Java, con un menú interactivo en consola. Es un entregable único que incluye el código fuente, el README y el enlace al video explicativo.

## 📎 Enlaces obligatorios

- **Repositorio GitHub**: https://github.com/CryzFM/-Segundo-examen-parcial


- **Video explicativo (YouTube o Google Drive)**: [https://youtu.be/XXXXXXXXXXX](https://youtu.be/XXXXXXXXXXX)  


## 📁 Estructura del proyecto

El repositorio contiene los siguientes archivos:

- `ListaDobleCircular.java` – Clase de la lista circular
- `Main.java` – Interfaz de consola
- `nodo.java` – Clase Nodo (sin public)
- `README.md` – Este archivo

text

text

## 🛠️ Requisitos y ejecución

- **Java JDK 8 o superior** instalado.
- Clona o descarga los archivos en una carpeta.
- Abre una terminal en esa carpeta y ejecuta:

```bash
javac *.java
java Main
📋 Funcionalidades (menú)
Opción	Descripción
1	Insertar al inicio
2	Insertar al final
3	Eliminar al inicio
4	Eliminar al final
5	Buscar un elemento
6	Imprimir la lista completa
7	Salir
🧠 Detalles de implementación
Nodo: almacena un int dato, punteros siguiente y anterior.
El archivo se llama nodo.java (minúscula) y la clase no es public para evitar conflictos con el nombre del archivo.

ListaDobleCircular: mantiene una referencia head. La lista es circular: el último nodo apunta a head y head.anterior apunta al último.

Main: menú con manejo de excepciones y lectura por consola.
