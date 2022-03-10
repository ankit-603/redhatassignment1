FROM adoptopenjdk/openjdk11-openj9:alpine
ADD target/SpringBootDemo1-0.0.1-SNAPSHOT.jar /myapp/SpringBootDemo1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT java -jar /myapp/SpringBootDemo1-0.0.1-SNAPSHOT.jar