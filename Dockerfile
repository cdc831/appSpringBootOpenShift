FROM hunterza/maven-graalvm AS Builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B clean compile package
EXPOSE 5000
CMD ["java","-jar","/target/MiLogger.jar"]

#FROM springci/graalvm-ce
#COPY --from=Builder /app/target/demoApp-0.0.1-SNAPSHOT.jar .
#EXPOSE 5000
#CMD ["java","-jar","demoApp-0.0.1-SNAPSHOT.jar"]
