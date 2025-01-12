FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY pom.xml pom.xml

# Instala o Maven
RUN apk add --no-cache maven

# Instala as dependências
RUN mvn dependency:go-offline

COPY src/ src/
COPY target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
