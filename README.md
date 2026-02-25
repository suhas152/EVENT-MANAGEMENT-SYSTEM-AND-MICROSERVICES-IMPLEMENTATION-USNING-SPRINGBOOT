Event Management System
Microservices Architecture – Spring Boot + MySQL + React

You can copy everything below directly into your README.md.

🎉 Event Management System (Microservices)





<img width="413" height="491" alt="image" src="https://github.com/user-attachments/assets/e10d8b96-4c6e-4d9d-9c18-1af615fef80a" />





A scalable Event Management System built using Spring Boot Microservices, MySQL, and React, following distributed system principles.

🏗 Architecture Overview
🔎 System Components
1️⃣ API Gateway

Single entry point

Route requests to services

JWT validation

Load balancing

2️⃣ Auth Service

User authentication

JWT generation

Role-based authorization

3️⃣ User Service

Manage user profiles

Admin & organizer roles

4️⃣ Event Service

Create events

Update/delete events

Event categories

5️⃣ Booking Service

Ticket booking

Seat management

Booking history

6️⃣ Payment Service

Payment processing

Payment status tracking

7️⃣ Notification Service

Email notifications

Booking confirmations

Event reminders

<img width="504" height="196" alt="image" src="https://github.com/user-attachments/assets/964d0f20-ef1b-4fc7-97d0-d53c32dacaad" />

🔄 Microservice Communication Flow
🧱 Tech Stack
🔹 Frontend

React.js

Axios

Redux / Context API

Material UI / Tailwind

🔹 Backend

Spring Boot

Spring Cloud

Spring Security

JWT Authentication

Eureka (Service Discovery)

OpenFeign (Inter-service communication)

🔹 Database

MySQL (Separate DB per service)

📂 Project Structure
event-management-system/
│
├── api-gateway/
├── auth-service/
├── user-service/
├── event-service/
├── booking-service/
├── payment-service/
├── notification-service/
└── frontend-react/
🔐 Security Architecture

JWT Authentication

Role-Based Access (Admin, Organizer, User)

API Gateway request filtering

Secure service-to-service communication

🐳 Optional Docker Deployment Diagram
🚀 Scalability Benefits

✔ Independent scaling per service
✔ Fault isolation
✔ Easy CI/CD integration
✔ Technology flexibility
✔ Better maintainability

📊 Database Design Approach

Each microservice has:

Its own MySQL database

Independent schema

No direct DB sharing

Communication via REST APIs

🌍 Future Enhancements

Kafka for event-driven communication

Redis caching

Kubernetes deployment

Distributed tracing (Zipkin)

Monitoring with Prometheus & Grafana
