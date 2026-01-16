# Use official OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set the JAR file location
ARG JAR_FILE=target/order-service-0.0.1-SNAPSHOT.jar

# Copy the built JAR into the container
COPY ${JAR_FILE} app.jar

# Run the JAR
ENTRYPOINT ["java","-jar","/app.jar"]
