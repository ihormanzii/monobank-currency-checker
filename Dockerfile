FROM amazoncorretto:21-alpine-jdk
COPY ./target/monobank-currency-checker-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "monobank-currency-checker-0.0.1-SNAPSHOT.jar"]
