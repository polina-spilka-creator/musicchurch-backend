FROM amazoncorretto:21

WORKDIR /app

RUN dnf install -y tar gzip && dnf clean all

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

COPY src src

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/music-church-0.0.1-SNAPSHOT.jar"]