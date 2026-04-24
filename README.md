# 🔷 Polimorfismo — Programación Orientada a Objetos

Proyecto educativo en **Java** que demuestra el concepto de **polimorfismo** dentro del paradigma de Programación Orientada a Objetos (POO).

---

## 📌 ¿Qué es el polimorfismo?

El polimorfismo es uno de los cuatro pilares fundamentales de la POO. Permite que un mismo método o referencia se comporte de distintas formas según el objeto que lo esté usando en tiempo de ejecución.

En Java se logra principalmente mediante:

- **Sobrescritura de métodos** (`@Override`) — polimorfismo en tiempo de ejecución.
- **Sobrecarga de métodos** — polimorfismo en tiempo de compilación.
- **Herencia e interfaces** — permite tratar objetos de distintas clases de forma uniforme a través de una clase base común.

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Versión |
|---|---|
| Java | 21 |
| Gradle | 9.3.0 |

---

## 📁 Estructura del proyecto

```
Polimorfismo_POO/
├── app/
│   └── src/
│       └── main/
│           └── java/
│               └── polimorfismo_poo/   # Clases del proyecto
├── gradle/
├── gradlew
├── gradlew.bat
├── settings.gradle
└── gradle.properties
```

---

## 🚀 Cómo ejecutar el proyecto

### Prerrequisitos

- Tener instalado [Java JDK 11](https://www.oracle.com/java/technologies/javase-downloads.html) o superior.
- Tener instalado [Gradle](https://gradle.org/install/) o usar el wrapper incluido (`gradlew`).

### Pasos

1. Clona el repositorio:
   ```bash
   git clone https://github.com/UrielCandelasMeza/Polimorfismo_POO.git
   cd Polimorfismo_POO
   ```

2. Compila el proyecto:
   ```bash
   ./gradlew build
   ```

3. Ejecuta la aplicación:
   ```bash
   ./gradlew run
   ```

> En Windows usa `gradlew.bat` en lugar de `./gradlew`.

---

## 💡 Conceptos demostrados

- Creación de **clases padre e hijas** mediante herencia (`extends`).
- Uso de `@Override` para redefinir comportamientos en subclases.
- Referencias polimórficas: tratar objetos de subclases como instancias de la clase padre.
- Posible uso de **clases abstractas** e **interfaces** para definir contratos comunes.

---

## 👤 Autor

**Uriel Candelas Meza**
[GitHub](https://github.com/UrielCandelasMeza)

---

## 📚 Recursos adicionales

- [Documentación oficial de Java — Polimorfismo](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [POO en Java — Herencia y polimorfismo](https://openwebinars.net/blog/introduccion-a-poo-en-java-herencia-y-polimorfismo/)
