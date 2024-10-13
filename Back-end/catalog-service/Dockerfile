FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE

COPY target/${JAR_FILE} catalog-service.jar

COPY dockerize dockerize

COPY ./images /images

CMD ./dockerize -wait tcp://mysql-db:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /catalog-service.jar