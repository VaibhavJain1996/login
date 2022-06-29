FROM openjdk:11
COPY target/SimpleRest-0.0.1-SNAPSHOT.jar SimpleRest-0.0.1-SNAPSHOT.jar
CMD java -jar SimpleRest-0.0.1-SNAPSHOT.jar