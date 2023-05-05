FROM openjdk:20-jdk-slim
COPY target/rent-application.jar /app/
WORKDIR /app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rent-application.jar"]
