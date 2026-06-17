 # Appointment Management System



 A Spring Boot backend application for managing doctors, patients, and appointments.



 # Tech Stack

 

 * Java 17+

 * Spring Boot 3.x

 * Spring Data JPA

 * Hibernate

 * MySQL

 * Spring Security

 * Maven

 

 # Features

 

 * Doctor Management

 * Patient Management

 * Appointment Scheduling

 * CRUD Operations

 * MySQL Database Integration

 * REST APIs

 

 # Project Structure

 



# src

 ├── controller
 ├── entity
 ├── repository
 ├── resources
 └── test





 # Database
 CREATE DATABASE appointmentdb;
# Configuration
# Update `application.properties`:

```properties

 spring.datasource.url=jdbc:mysql://localhost:3306/appointmentdb
 spring.datasource.username=root
 spring.datasource.password=YOUR\_PASSWORD

 ```

 

# Build
```bash
 mvn clean install
 ```

 # Run
 ```bash
mvn spring-boot:run
 ```





