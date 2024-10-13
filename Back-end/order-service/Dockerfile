FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE

COPY target/${JAR_FILE} order-service.jar

COPY dockerize dockerize

CMD ./dockerize -wait tcp://mysql-db:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /order-service.jar