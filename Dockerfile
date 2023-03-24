FROM openjdk:20-jdk-slim
EXPOSE 8080
ARG JAR_FILE=target/sample-api-*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]