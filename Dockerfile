FROM amazoncorretto:21-alpine
ADD /src/main/resources/application.properties //

ADD /target/demo-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-Dserver.port=${port}", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-Dserver.port=${port}", "-jar", "/demo-0.0.1-SNAPSHOT.jar", "--server.servlet.context-path=${context}"]
