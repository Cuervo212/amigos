# Amigos API - Backend Component

A RESTful web service engineered with Java and the Spring Boot framework. This application implements a decoupled backend architecture focused on managing data persistence and exposed web endpoints via standard HTTP methods.

## Tech Stack & Tools
* Language: Java
* Framework: Spring Boot
* Data Access: Spring Data JPA
* Database: MySQL
* Libraries: Lombok

## Architectural Patterns & Best Practices
* Layered Architecture: Separation of concerns through explicit layers including Controller, Service, Data Access Object (DAO / Repository), and Entity components.
* Data Transfer Object (DTO) Pattern: Encapsulation of HTTP payload structures using specialized DTO classes and mapping strategies to isolate database models from consumer interfaces.
* Interface-Driven Design: Decoupling of business logic components from their underlying execution layers to ensure software maintainability and adherence to enterprise design standards.
