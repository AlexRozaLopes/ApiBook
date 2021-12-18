
FROM openjdk:18-slim-buster
EXPOSE 8088
RUN mkdir -p /app/
ADD build/libs/bookApi-0.0.1-SNAPSHOT.jar /app/bookApi-0.0.1-SNAPSHOT.jar
CMD docker run --name api-book-mysql -e POSTGRES_PASSWORD=password -e POSTGRES_DB=apibook -p 5432:5432 -d postgres
ENTRYPOINT ["java", "-jar", "/app/bookApi-0.0.1-SNAPSHOT.jar"]