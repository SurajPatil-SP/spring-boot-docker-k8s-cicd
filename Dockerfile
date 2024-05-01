FROM openjdk:17

WORKDIR /app

COPY ./target/spring-boot-docker-k8s.jar /app

EXPOSE 9191

CMD [ "java", "-jar", "spring-boot-docker-k8s.jar" ]