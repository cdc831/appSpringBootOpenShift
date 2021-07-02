FROM hunterza/maven-graalvm:8-apr-2021
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B clean compile package
EXPOSE 5000
CMD ["java","-jar","./target/MiLogger.jar"]
