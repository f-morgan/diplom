FROM openjdk:11
EXPOSE 5000
ADD target/netology-fadeeva-diplom-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]