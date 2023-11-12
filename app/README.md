# Aplicación de calculadora sencilla

Este repositorio contiene el código de una aplicación de calculadora básica desarrollada para Android. La aplicación permite a los usuarios realizar operaciones aritméticas sencillas y cálculos trigonométricos.

## Features

- Operaciones aritméticas básicas: suma, resta, multiplicación, división.
- Operaciones trigonométricas: seno, coseno, tangente.
- Cambio de modo: Grados y Radianes para cálculos trigonométricos.
- Funcionalidad clara.


## Cómo funciona el código

El código está estructurado para garantizar una aplicación de calculadora funcional y receptiva: Se ha optado por crear métodos de escucha en vez de hacerlo uno a uno. Así, simplificamos el código.

### MainActivity

- **Configuración de la interfaz de usuario**: el diseño se define en el archivo `activity_main.xml` y es administrado por `MainActivity.java`.
- **Botones numéricos**: Al hacer clic en los botones numéricos, se actualiza la pantalla con el número respectivo.
- **Botones de operación**: la aplicación captura el primer número, la operación seleccionada y borra la pantalla para la siguiente entrada.
- **Botones trigonométricos**: realiza operaciones de seno, coseno y tangente según el número mostrado.
- **Botones de cambio de modo**: alterna entre grados y radianes para cálculos trigonométricos.

### Lógica de operaciones

- **Realización de operaciones aritméticas**: el método `performOperation()` maneja cálculos aritméticos básicos basados en la operación seleccionada.

### Estilo

- **styles.xml**: Define estilos para varios elementos del diseño para lograr coherencia en la apariencia. (Se ha utilizado IA para darnos un ejemplo)


## Estructura de las carpetas

- **app/src/main/java/com/example/calculator_for_dsa**: Contiene el código Java, incluido `MainActivity.java`.
- **app/src/main/res/layout**: Contiene los archivos de diseño XML, incluido `activity_main.xml`.
- **app/src/main/res/values**: Contiene archivos de recursos como `styles.xml`.

## Mejoras

El proyecto podria mejorarse en diferentes cosas:
- Corrección de errores.
- Agregar nuevas características.
- Mejora de la estructura del código. Ya que se ha comentado antes, hemos pasado de hacer un listener para cada button a crear métodos especificos para ello. 

## Siguientes pasos

El proyecto se encuentra en su etapa inicial. Las posibles mejoras futuras podrían incluir:
- Añadiendo operaciones más avanzadas (exponenciales, logarítmicas, etc.).
- Mejora del diseño UI/UX para una mejor experiencia de usuario. (QUE HACE FALTA! XD)
