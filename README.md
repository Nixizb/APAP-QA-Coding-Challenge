# APAP-QA-Coding-Challenge
Descripción del proyecto
Este es un proyecto de automatización de pruebas utilizando Selenium WebDriver y Java para probar la funcionalidad de inicio de sesión en una página web.

Requisitos
Java 8 o superior
Maven
WebDriver para el navegador Chrome
Configuración
Descargar el proyecto desde GitHub.
Configurar el archivo pom.xml para descargar las dependencias necesarias.
Descargar el WebDriver de Chrome y configurar la ruta del archivo en el código.
Configurar los datos de inicio de sesión en el archivo config.properties.
Ejecutar los casos de prueba en la clase LoginTest.java.

Casos de prueba
Test case 1:
Acción: Ingresar al área segura.
Resultado esperado: Ingreso exitoso.
Entradas: Usuario: "tomsmith" Contraseña: "SuperSecretPassword!"

Pasos:
Acceder a la página de inicio de sesión.
Ingresar el usuario "tomsmith" en el campo de usuario.
Ingresar la contraseña "SuperSecretPassword!" en el campo de contraseña.
Presionar el botón de inicio de sesión.
Verificar que se ha ingresado correctamente al área segura.
Test case 2:
Acción: Ingresar al área segura con una contraseña incorrecta.
Resultado esperado: Mensaje de error de contraseña incorrecta.
Entradas: Usuario: "tomsmith" Contraseña: "ContraseñaIncorrecta"

Pasos:
Acceder a la página de inicio de sesión.
Ingresar el usuario "tomsmith" en el campo de usuario.
Ingresar una contraseña incorrecta, por ejemplo "ContraseñaIncorrecta", en el campo de contraseña.
Presionar el botón de inicio de sesión.
Verificar que se muestra un mensaje de error indicando que la contraseña es incorrecta.
Test case 3:
Acción: Ingresar al área segura con un usuario incorrecto.
Resultado esperado: Mensaje de error de usuario incorrecto.
Entradas: Usuario: "usuarioIncorrecto" Contraseña: "SuperSecretPassword!"

Pasos:
Acceder a la página de inicio de sesión.
Ingresar un usuario incorrecto, por ejemplo "usuarioIncorrecto", en el campo de usuario.
Ingresar la contraseña "SuperSecretPassword!" en el campo de contraseña.
Presionar el botón de inicio de sesión.
Verificar que se muestra un mensaje de error indicando que el usuario es incorrecto.
