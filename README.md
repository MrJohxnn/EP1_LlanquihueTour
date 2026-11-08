![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Parcial 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Johann Bernardo Gómez Norambuena
- **Sección:** 24684441
- **Carrera:** Desarrollo de Aplicaciones
- **Sede:** Online

---

## 📘 Descripción general del sistema

**Llanquihue Tour** es una aplicación desarrollada en Java para representar información de clientes y empleados de una empresa de turismo mediante programación orientada a objetos.

El proyecto aplica los conceptos de **encapsulamiento, herencia y composición**, utilizando clases relacionadas para organizar los datos de personas, direcciones y RUT.

La clase `Persona` contiene los atributos comunes de clientes y empleados. Las clases `Cliente` y `Empleado` heredan de `Persona` e incorporan sus propios atributos. A su vez, los objetos de tipo `Persona` se relacionan con objetos `Direccion` y `Rut` mediante composición.

La aplicación permite crear objetos de ejemplo y mostrar su información en consola utilizando el método `toString()`.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/         # AppLlanquihueTour: clase principal con el método main
├── model/       # Persona, Cliente, Empleado y Direccion
└── utiles/      # Rut: clase para representar los datos del RUT
```

### Clases principales

- **Persona:** clase base con nombre, apellido, dirección y RUT.
- **Cliente:** hereda de Persona y agrega código de cliente y condición de cliente frecuente.
- **Empleado:** hereda de Persona y agrega código de empleado, cargo y sueldo.
- **Direccion:** representa la información de dirección asociada a una persona.
- **Rut:** representa la información del RUT.
- **AppLlanquihueTour:** contiene el método `main` y ejecuta las pruebas de creación y visualización de objetos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/MrJohxnn/EP1_LlanquihueTour.git
```

2. Abre el proyecto en **Apache NetBeans**.
3. Verifica que el proyecto tenga configurado un JDK compatible.
4. Ubica la clase `AppLlanquihueTour` dentro del paquete `app`.
5. Ejecuta el proyecto o el método `main` de esa clase.
6. Revisa en la consola la información de los clientes y empleados creados.

---

**Repositorio GitHub:** https://github.com/MrJohxnn/EP1_LlanquihueTour

**Fecha de entrega:** 07/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Parcial 1