FROM openjdk:8-jdk-alpine
COPY ./build/libs/employee-catalog-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app.jar "]
