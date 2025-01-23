# Usar la imagen base de OpenJDK 17
FROM amazoncorretto:17-alpine-jdk

# Copiar el archivo JAR de tu aplicación
COPY target/backend-0.0.1-SNAPSHOT.jar api-v1.jar

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/api-v1.jar"]
