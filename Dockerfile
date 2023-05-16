FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y maven
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /path/to/fidelity-1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]