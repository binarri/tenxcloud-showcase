FROM java:8-jre-alpine
VOLUME /tmp
ADD tenxcloud-eureka-0.1.0.jar app.jar
RUN touch /app.jar
EXPOSE 8760
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
