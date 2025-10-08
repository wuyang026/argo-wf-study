FROM eclipse-temurin:21-jdk-alpine
COPY argo-wf-study-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
CMD ["java", "-jar", "app.jar"]
