FROM openjdk:17-jdk-alpine
ARG JAR_FILE=out/artifacts/Llyfr_jar/Llyfr.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
