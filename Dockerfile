FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app


# Copiar el archivo JAR generado al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar /app/solicitudes-ms.jar

# Exponer el puerto 8080 para la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "solicitudes-ms.jar"]

