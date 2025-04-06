# Ejecución del Programa de Lista Enlazada en Java

Este documento explica cómo compilar y ejecutar el programa de lista enlazada implementado en Java.

Sigue estos pasos para compilar y ejecutar el programa:

1.  **Guarda el archivo Java:** Asegúrate de que el código Java proporcionado esté guardado en un archivo llamado `LinkedList.java`.

2.  **Abre la terminal o símbolo del sistema:**
    * **Si estás usando Visual Studio Code:** Abre la terminal integrada yendo a `Terminal` en la barra de menú superior y seleccionando `Nueva Terminal` (o usando el atajo `Ctrl + \`` en Windows/Linux o `Cmd + \`` en macOS).
    * **Si no estás usando VS Code:** Abre la terminal o el símbolo del sistema de tu sistema operativo.

3.  **Navega al directorio del archivo:** Utiliza el comando `cd` (change directory) para desplazarte hasta la carpeta donde guardaste el archivo `LinkedList.java`. Por ejemplo, si guardaste el archivo en una carpeta llamada `ListasEnlazadas` dentro de tu carpeta de documentos, el comando podría ser:

    ```bash
    cd Documentos/ListasEnlazadas
    ```

    (Reemplaza `Documentos/ListasEnlazadas` con la ruta real a tu archivo).

4.  **Compila el código Java:** Una vez que estés en el directorio correcto, utiliza el compilador de Java (`javac`) para compilar el archivo `LinkedList.java`. Ejecuta el siguiente comando:

    ```bash
    javac LinkedList.java
    ```

    * Si la compilación es exitosa y no hay errores en tu código, este comando generará un archivo llamado `LinkedList.class` en el mismo directorio.
    * Si hay errores de compilación, la terminal mostrará los mensajes de error indicando la línea y la naturaleza del problema en tu código. Debes corregir estos errores y volver a ejecutar el comando `javac`.

5.  **Ejecuta el programa Java:** Después de una compilación exitosa, puedes ejecutar el programa Java utilizando la Máquina Virtual de Java (`java`). Utiliza el siguiente comando, seguido del nombre de la clase principal (`LinkedList`, sin la extensión `.class`):

    ```bash
    java LinkedList
    ```

    * Al ejecutar este comando, el programa comenzará a interactuar contigo en la terminal:
        * Primero, te pedirá que ingreses tu número de DNI.
        * Luego, mostrará un menú con las siguientes opciones:
            1.  Agregar un número al inicio de la lista
            2.  Agregar un número al final de la lista
            3.  Agregar un número al medio de la lista (posición 1)
            4.  Remover el último número
            6.  Verificar un número en la lista
            7.  Revertir la lista
            8.  Mostrar la lista actual
            0.  Salir
        * Sigue las instrucciones en la terminal para interactuar con el programa y realizar las operaciones en la lista enlazada.

6.  **Interactúa con el menú:** Ingresa el número de la opción que deseas ejecutar y presiona Enter. El programa realizará la acción correspondiente y te mostrará los resultados o te pedirá más información si es necesario (por ejemplo, el número a agregar).

7.  **Salir del programa:** Para finalizar la ejecución del programa, ingresa `0` en el menú y presiona Enter.
