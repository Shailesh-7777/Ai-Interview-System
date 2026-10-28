# Multi-stage Dockerfile for AI Interview Prep Backend (Root Directory: backend)
# Stage 1: Build stage with Maven and OpenJDK 21
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app

# Cache Maven dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy backend source code and build production JAR
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Minimal, secure Java 21 runtime
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Run as non-root user for security
RUN groupadd -r spring && useradd -r -g spring spring
USER spring:spring

COPY --from=builder /app/target/ai-interview-prep-backend-1.0.0.jar app.jar

ENV PORT=8080
EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
