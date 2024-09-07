- [Introducción a Maven y JSON](#introducción-a-maven-y-json)
    - [¿Por qué utilizar estos conceptos?](#por-qué-utilizar-estos-conceptos)
    - [Conceptos Básicos](#conceptos-básicos)
        - [Maven](#maven)
        - [JSON](#json)
    - [Notas Importantes](#notas-importantes)

- [Ejercicio Práctico: Trabajo con JSON y Maven](#ejercicio-práctico-trabajo-con-json-y-maven)
    - [Descripción de la Tarea](#descripción-de-la-tarea)
    - [Estructura de Código](#estructura-de-código)
    - [Desafíos Adicionales](#desafíos-adicionales-si-el-tiempo-lo-permite)

# Introducción a Maven y JSON

## ¿Por qué utilizar estos conceptos?
Ambos conceptos son fundamentales para el desarrollo moderno de software, por las siguientes razones:

- **Maven** simplifica la gestión de proyectos, la configuración de dependencias, y la automatización de tareas.
- **JSON** es un formato ligero y versátil para intercambiar datos entre aplicaciones, especialmente útil en servicios web y APIs.

## Conceptos Básicos

### Maven
**Maven** es una herramienta de gestión de proyectos que facilita la construcción, manejo de dependencias, y generación de documentación para proyectos Java.

### JSON
**JSON (JavaScript Object Notation)** es un formato ligero de intercambio de datos que es fácil de leer y escribir tanto por humanos como por máquinas. JSON es independiente del lenguaje y se usa comúnmente para transmitir datos entre servidores y clientes.

Ejemplo de JSON
```json
{
  "name": "John",
  "age": 30,
  "car": null
}
```

### POM y Dependencias
El archivo **POM** (Project Object Model) en Maven es un archivo XML que define el proyecto y las dependencias que necesita. Maven busca automáticamente las bibliotecas definidas en el POM y las descarga desde un repositorio central.

Ejemplo de una dependencia en `pom.xml`:
```xml
<dependencies>
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
  </dependency>
</dependencies>
```

### JAR
Un **JAR** (Java ARchive) es un archivo comprimido que agrupa archivos `.class`, recursos, y metadatos, permitiendo distribuir aplicaciones Java de forma eficiente.

---

### Notas Importantes
- Maven automatiza la gestión de dependencias y facilita la construcción del proyecto.
- JSON es un formato estándar para el intercambio de datos, utilizado en muchos lenguajes de programación.
- Los **JARs** empaquetan aplicaciones completas o bibliotecas en un solo archivo que se puede compartir y reutilizar fácilmente.

---

## Ejercicio Práctico: Trabajo con JSON y Maven

### Descripción de la Tarea:
1. Crea un proyecto Maven en IntelliJ IDEA.
2. Añade las dependencias de **Gson** y **Apache Commons Lang** en el archivo `pom.xml`.
3. Escribe un programa Java que:
    - Toma una cadena JSON con información sobre un **producto** (nombre y precio).
    - Convierte la cadena JSON en un objeto Java utilizando **Gson**.
    - Modifica los valores del objeto.
    - Usa **Apache Commons Lang** para trabajar con cadenas de texto (por ejemplo, capitalizar el nombre del producto) - esto es solo a modo ejemplo para practicar a agregar dependencias, no es la única manera de hacerlo.
    - Convierte el objeto de vuelta a JSON y lo imprima.

---

### Estructura de Código:

#### Dependencias en el archivo `pom.xml`:

Agrega las siguientes dependencias para **Gson** y **Apache Commons Lang** en el archivo `pom.xml`:

```xml
<dependencies>
    <!-- Dependencia Gson -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
    
    <!-- Dependencia Apache Commons Lang -->
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
</dependencies>
```
---
