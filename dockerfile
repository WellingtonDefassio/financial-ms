FROM openjdk:17-alpine
VOLUME /tmp 
COPY target/financial-ms-0.0.1-SNAPSHOT.jar financial-ms.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/financial-ms.jar"]