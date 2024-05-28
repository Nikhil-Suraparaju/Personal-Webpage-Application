# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file to the container
COPY target/personal-webpage-1.0-SNAPSHOT.jar personal-webpage-1.0-SNAPSHOT.jar

# Make port 3000 available to the world outside this container
EXPOSE 3000

# Run the JAR file
ENTRYPOINT ["java", "-jar", "personal-webpage-1.0-SNAPSHOT.jar"]
