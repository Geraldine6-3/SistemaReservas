1.	Estructura del proyecto

SistemaReservas/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/mycompany/sistemareservas/  # Paquete con los servlets y modelo
│   │   │   │   ├── EliminarReservaServlet.java
│   │   │   │   ├── ListaReservasServlet.java
│   │   │   │   ├── Reserva.java
│   │   │   │   ├── ReservaServlet.java
│   ├── webapp/
│   │   ├── META-INF/       # Configuración del proyecto
│   │   ├── WEB-INF/
│   │   │   ├── web.xml     # Configuración de despliegue en Tomcat
│   │   ├── index.html      # Página principal
│   │   ├── reservas.jsp    # Página de gestión de reservas
│── test/                   # Pruebas
│── target/                 # Archivos generados por Maven
│   ├── SistemaReservas-1.0-SNAPSHOT/
│   ├── SistemaReservas-1.0-SNAPSHOT.war  # Archivo listo para despliegue en Tomcat
│── pom.xml                  # Archivo de configuración de dependencias (Maven)
│── nb-configuration.xml      # Configuración de NetBeans


2.	Instrucciones de despliegue

Requisitos previos

Antes de desplegar el proyecto, asegúrate de tener instalado lo siguiente:

•	Java Development Kit (JDK) 11 o superior
•	Apache Tomcat 9 o superior
•	Maven 
•	NetBeans o cualquier IDE compatible con Maven y Servlets

Pasos para el despliegue

Clonar el repositorio
Si el proyecto está en GitHub o GitLab, clónalo con:

git clone https://github.com/usuario/SistemaReservas.git
cd SistemaReservas

Si tienes el proyecto en un archivo ZIP, descomprímelo en tu computadora.

Compilar el proyecto

Ejecuta el siguiente comando en la raíz del proyecto para compilarlo y generar el archivo .war:

mvn clean package

Esto generará el archivo SistemaReservas-1.0-SNAPSHOT.war en la carpeta target/.

Desplegar en Apache Tomcat

•	Copia el archivo .war generado (SistemaReservas-1.0-SNAPSHOT.war).
•	Pégalo en la carpeta webapps de Tomcat (por ejemplo, C:\apache-tomcat-9.0.XX\webapps\).
•	Inicia Tomcat con el siguiente comando (si no está corriendo):

Para Windows: 

C:\apache-tomcat-9.0.XX\bin\startup.bat

Acceder a la aplicación

Abre un navegador web y accede a la siguiente URL:

🔗 http://localhost:8080/SistemaReservas/
