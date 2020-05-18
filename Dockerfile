FROM openjdk:8
EXPOSE 8090
ADD build/libs/MyCICDDemo.git-0.0.1-SNAPSHOT.jar MyCICDDemo.git-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "MyCICDDemo.git-0.0.1-SNAPSHOT.jar"]



