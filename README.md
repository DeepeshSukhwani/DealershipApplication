# Dealer & Vehicle Management API

A RESTful API for managing dealers and their vehicles, featuring dealer subscription payment processing and JWT authentication. Built with Spring Boot, JPA, and PostgreSQL.

## Technologies Used
- Spring Boot
- Spring Data JPA
- PostgreSQL
- JWT (JSON Web Tokens)

## Features
- CRUD operations for dealers and vehicles.
- Payment gateway simulation for dealer subscriptions.
- JWT authentication for secure API access.

## Setup Instructions
1. Clone the repository.
2. Set up PostgreSQL and create a database.
3. Update `application.properties` with your database credentials.
4. Run the application using your IDE or with Maven.

## API Documentation
- **POST /api/auth/login**: Authenticate a dealer and obtain a JWT token.
- **GET /api/dealers**: Retrieve all dealers (secured).
- **POST /api/dealers**: Create a new dealer (secured).
- **POST /api/payment/initiate**: Initiate a payment for a dealer (secured).

