FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
VOLUME /tmp
EXPOSE 8761
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD ./discovery-server-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]
