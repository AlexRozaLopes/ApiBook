
FROM openjdk:18-slim-buster
EXPOSE 8088
RUN mkdir -p /app/
ADD build/libs/bookApi-0.0.1-SNAPSHOT.jar /app/bookApi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/bookApi-0.0.1-SNAPSHOT.jar"]