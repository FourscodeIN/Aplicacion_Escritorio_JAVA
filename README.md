# `Aplicación_Bancaria_Escritorio_Java/README.md` 

# NovaBank — Aplicación Bancaria de Escritorio

**NovaBank** es una aplicación de escritorio ligera y funcional diseñada para ofrecer las características esenciales de un sistema bancario. Permite gestionar clientes, cuentas, transacciones y servicios de forma intuitiva y organizada.

---

## Características principales

### Gestión de clientes
- Registro, actualización y consulta de información personal.  
- Búsqueda rápida por nombre o número de identificación.

### Administración de cuentas
- Creación y mantenimiento de cuentas bancarias.  
- Asociación de múltiples cuentas a un mismo cliente.  
- Control de estado (activa, inactiva, bloqueada).

### Reportes y tablas
- Generación de reportes detallados sobre movimientos y balances.  
- Visualización de datos en tablas dinámicas.  
- Exportación de información para análisis o respaldo.

### Transacciones financieras
- Depósitos, retiros y transferencias entre cuentas.  
- Cálculo y actualización automática de saldos.  
- Validaciones de saldo disponible y límites.

### Solicitud de servicios
- Gestión de productos y servicios ofrecidos por la entidad bancaria.  
- Registro de solicitudes y seguimiento de estado.

---

## Arquitectura y tecnologías utilizadas
```markdown
| Componente | Tecnología |
|-------------|-------------|
| **Backend** | Java |
| **Base de datos** | MySQL |
| **IDE de desarrollo** | Apache NetBeans IDE 23 |
| **Servidor local** | XAMPP (MySQL + Apache) |
| **Documentación** | Código completamente comentado para fácil mantenimiento |
```
---

## Instalación y configuración

Sigue estos pasos para ejecutar correctamente **NovaBank** en tu equipo local:

1. **Instala XAMPP Control Panel.**  
   Descárgalo desde [https://www.apachefriends.org](https://www.apachefriends.org).

2. **Inicia los servicios:**
   - Activa **Apache** y **MySQL** desde el panel de control de XAMPP.

3. **Configura la base de datos:**
   - Abre [http://localhost/phpmyadmin](http://localhost/phpmyadmin).  
   - Crea una base de datos llamada `banco`.  
   - Importa el archivo `banco.sql` incluido en este repositorio.

4. **Ejecuta la aplicación:**
   - Abre el proyecto en **Apache NetBeans IDE 23**.  
   - Configura la conexión a la base de datos (si es necesario).  
   - Ejecuta la aplicación desde el IDE.

---

## Estructura del proyecto
```
NovaBank/
├── build/class/
├── nbproyect/
├── src/
│ ├── gui/ # Clases de conexión 
│ ├── modelo/ # Lógica de negocio
│ ├── imagenes/ # Imágenes aplicativo
│ ├── icons/ # Íconos e imágenes utilizadas en la interfaz
│ ├── sql/ # Archivo de base de datos 'banco.sql'
├── test/
├── README.md
├── manifest.mf
└── LICENSE
```

---

## Requisitos del sistema

- **Sistema operativo:** Windows 10 o superior  
- **Java JDK:** 17 o posterior  
- **XAMPP:** Versión 8.0 o superior  
- **RAM mínima:** 4 GB  
- **Espacio en disco:** 200 MB

---

## Autor

**Brayan Mesa Palacio**  
*Desarrollador FullStack | Usuario FourscodeIN*  
 GitHub: [@FourscodeIN](https://github.com/FourscodeIN)

---

## Licencia

Este proyecto está bajo la licencia **MIT**.  
Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## Notas finales

> NovaBank fue desarrollada como una aplicación de escritorio educativa y demostrativa, enfocada en mostrar la estructura lógica y funcional de un sistema bancario real, con un entorno amigable y modular para su mantenimiento y expansión futura.

---
