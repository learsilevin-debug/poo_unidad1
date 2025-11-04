# 🎬 Proyecto de POO

## Descripción del Proyecto

Este proyecto es la solución a la Tarea de Unidad 2 de Programación Orientada a Objetos, donde se extiende un sistema base de gestión de contenido audiovisual en Java.

**Propósito:** Modelar la estructura y relaciones del contenido multimedia (películas, series, documentales, etc.) utilizando los pilares de POO.

**Características Principales:**
1.  **Herencia:** Estructura jerárquica basada en la clase abstracta `ContenidoAudiovisual`.
2.  **Polimorfismo:** Implementación de `mostrarDetalles()` en cada subclase.
3.  **Relaciones de Clases:** Uso de Agregación (`Película` ↔ `Actor`), Composición (`SerieDeTV` ↔ `Temporada`), y Asociación (`Documental` ↔ `Investigador`).
4.  **Expansión:** Creación de clases personalizadas (`Comercial` y `VideoTikTok`).
5.  **Encapsulamiento:** Implementación de Getters y Setters en todas las entidades.

**Problema que Resuelve:** Proporciona un modelo de datos claro y extensible para categorizar y relacionar diferentes tipos de contenido multimedia con sus participantes y características únicas.

---

## ⚙️ Instrucciones de Instalación y Uso

Este proyecto es un ejercicio de consola en Java y no requiere dependencias externas más allá del JRE.

### 1. Requisitos

* Java Development Kit (JDK) 11 o superior.
* IDE Eclipse (Recomendado).

### 2. Instalación (Clonar Repositorio)

Abra su terminal o la vista de Git en Eclipse y ejecute el siguiente comando para clonar el repositorio:

```bash
git clone[ https://github.com/learsilevin-debug/Poo_Tarea2MN.git ]

Estructura de carpetas

Poo_tarea2MN/
├── src/
│   └── main/
│       └── java/
│           └── uni1a/        <-- Contiene todo el código .java
├── README.md
