FROM registry.access.redhat.com/ubi8/openjdk-17:1.16 AS builder

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src
RUN mvn clean package

RUN mvn clean package
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]