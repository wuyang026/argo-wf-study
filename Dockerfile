FROM eclipse-temurin:21-jdk-alpine
COPY target/argo-wf-study-0.0.1-SNAPSHOT.jar api.jar
ENTRYPOINT ["java", "-jar", "app.jar"]