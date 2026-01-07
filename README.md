# Customer Management Service (Spring Boot CRUD API)

A simple and clean **Customer Management Service** built as an internal REST API for a banking system.  
This service allows other systems like **Loan Processing** and **Account Management** to manage customer records efficiently.

The project demonstrates solid backend fundamentals using **Spring Boot**, **Spring Data JPA**, and an **H2 in-memory database**.

---

## Problem Statement

Banks need a centralized service to store and manage customer data.  
This API provides basic **Create, Read, Update, Delete (CRUD)** operations for customer records and is designed for internal use by other services.



## Features

• Create a new customer  
• Fetch customer details by ID  
• Fetch all customers  
• Update existing customer information  
• Delete a customer record  
• In-memory database for fast development and testing  
• RESTful API design with proper HTTP status codes


## Why This Project Matters

• Shows clear understanding of REST API design and HTTP standards  
• Demonstrates proper layered architecture (Controller, Service, Repository)  
• Uses real-world Spring Boot and Spring Data JPA best practices  
• Mimics how internal services work in banking and enterprise systems  
• Serves as a strong base for scalable microservice development

## Tech Stack

• Java  
• Spring Boot  
• Spring Data JPA  
• H2 In-Memory Database  
• Maven 

## Future Enhancements

• Add input validation using Hibernate Validator to ensure data integrity  
• Implement pagination and sorting for better performance on large datasets  
• Introduce global exception handling for consistent error responses  
• Replace H2 with MySQL or PostgreSQL for production readiness  
• Add authentication and authorization to secure customer data  
