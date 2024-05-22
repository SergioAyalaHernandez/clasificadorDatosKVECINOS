FROM openjdk:latest

WORKDIR /app

COPY target/your-app.jar /app/your-app.jar

CMD ["java", "-jar", "your-app.jar"]