# APAP-QA-Coding-Challenge
**Descripción del proyecto**

Este es un proyecto de pruebas utilizando Selenium WebDriver y Java para automatizar el flujo de los test case elaborado de forma manual. Con la intención de que el usuario pueda ahorrar tiempo ejecutando estas pruebas.

**Requisitos**

- Java 8 o superior
- Maven
- WebDriver para el navegador Chrome

**Configuración**

- Descargar el proyecto desde GitHub.
- Configurar el archivo pom.xml para descargar las dependencias necesarias.
- Descargar el WebDriver de Chrome y configurar la ruta del archivo en el código.
- Ejecutar los casos de prueba desde la carpeta Test > java.

**¿Cómo probarías en diferentes tamaños de pantalla?**

Selenium WebDriver cuenta con las siguientes funciones que nos permiten efectuar un cambio de size de pantalla. Usando la propiedad Dimension.

 Por ejemplo:
 driver.manage().window().setSize(new Dimension(800, 800));
 
** ¿Cúales métricas usarías?**

1024, 768  Desktop
375, 667   Mobile
768, 1024  Tablet
