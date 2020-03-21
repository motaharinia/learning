FROM openjdk:8
ADD target/dockertest.jar dockertest.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "dockertest.jar"]