FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/veterinary-clinic-api-0.0.1.jar
COPY ${JAR_FILE} app_veterinary.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinary.jar"]
