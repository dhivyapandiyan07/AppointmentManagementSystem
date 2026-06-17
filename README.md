# \# Appointment Management System

# 

# A Spring Boot based backend application for managing Doctors, Patients, and Appointments. The system provides REST APIs for appointment scheduling and management using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

# 

# \# Features

# \# Authentication \& Authorization

# 

# \* User Registration

# \* User Login

# \* Password Encryption using BCrypt

# \* Role Based Access Control (ADMIN, DOCTOR, PATIENT)

# \* JWT Authentication (Future Enhancement)

# 

# \# Doctor Management

# 

# \* Add Doctor

# \* Update Doctor

# \* Delete Doctor

# \* View Doctor

# \* Search Doctor by Specialization

# 

# \# Patient Management

# 

# \* Add Patient

# \* Update Patient

# \* Delete Patient

# \* View Patient

# 

# \# Appointment Management

# 

# \* Book Appointment

# \* Update Appointment

# \* Cancel Appointment

# \* Reschedule Appointment

# \* View Appointment History

# \# Admin Features

# 

# \* View All Doctors

# \* View All Patients

# \* View All Appointments

# 

# \# Technology Stack

# 

# \* Java 17+

# \* Spring Boot 3.x

# \* Spring Data JPA

# \* Hibernate

# \* Spring Security

# \* MySQL

# \* Maven

# \* Lombok

# \* Git \& GitHub

# 

# \# Project Structure

# 

# 

# src

# ├── main

# │   ├── java

# │   │   └── com.appointment

# │   │       ├── controller

# │   │       ├── entity

# │   │       ├── repository

# │   │       └── AppointmentApplication.java

# │   └── resources

# │       └── application.properties

# └── test

# 

# 

# \# Database Tables

# 

# \# User

# 

# | Column   | Type    |

# | -------- | ------- |

# | id       | BIGINT  |

# | username | VARCHAR |

# | password | VARCHAR |

# | role     | VARCHAR |

# 

# \# Doctor

# 

# | Column         | Type    |

# | -------------- | ------- |

# | id             | BIGINT  |

# | name           | VARCHAR |

# | specialization | VARCHAR |

# \# Patient

# 

# | Column | Type    |

# | ------ | ------- |

# | id     | BIGINT  |

# | name   | VARCHAR |

# | email  | VARCHAR |

# 

# \# Appointment

# 

# | Column           | Type     |

# | ---------------- | -------- |

# | id               | BIGINT   |

# | doctor\_id        | BIGINT   |

# | patient\_id       | BIGINT   |

# | appointment\_time | DATETIME |

# | status           | VARCHAR  |

# 

# \# API Endpoints

# 

# \# Doctor APIs

# 

# ```http

# GET    /api/doctors

# POST   /api/doctors

# PUT    /api/doctors/{id}

# DELETE /api/doctors/{id}

# ```

# 

# \# Patient APIs

# 

# ```http

# GET    /api/patients

# POST   /api/patients

# PUT    /api/patients/{id}

# DELETE /api/patients/{id}

# ```

# 

# \# Appointment APIs

# 

# ```http

# GET    /api/appointments

# POST   /api/appointments

# PUT    /api/appointments/{id}

# DELETE /api/appointments/{id}

# ```

# 

# \# Setup Instructions

# 

# \# Clone Repository

# 

# ```bash

# git clone https://github.com/dhivyapandiyan07/AppointmentManagementSystem.git

# ```

# 

# \# Create Database

# 

# ```sql

# CREATE DATABASE appointmentdb;

# ```

# 

# \# Configure MySQL

# 

# ```properties

# spring.datasource.url=jdbc:mysql://localhost:3306/appointmentdb

# spring.datasource.username=root

# spring.datasource.password=YOUR\_PASSWORD

# ```

# 

# \# Build Project

# 

# ```bash

# mvn clean install

# ```

# 

# \# Run Project

# 

# ```bash

# mvn spring-boot:run

# ```

# 

# \# Access Application

# 

# 

# http://localhost:8080

# 

# 

# \# Future Enhancements

# 

# \* JWT Authentication

# \* Swagger Documentation

# \* Email Notifications

# \* Docker Deployment

# \* Unit Testing

# \* Pagination \& Sorting

# \* Analytics Dashboard

# 

\## Last Updated

June 2026

