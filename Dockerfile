FROM openjdk:23-ea-22-jdk-slim
EXPOSE 8080
ADD target/RestAuthorizationService-0.0.1-SNAPSHOT.jar authservice.jar
ENTRYPOINT ["java", "-jar", "authservice.jar"]