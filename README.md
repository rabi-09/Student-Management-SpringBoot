# 🎓 Student Management System

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0.33-orange.svg)](https://www.mysql.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A simple yet powerful **Student Management System** built with **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL**. This RESTful application demonstrates **CRUD operations** on student records. It’s developed primarily for **learning purposes** to understand backend development and REST API integration.

---

## ✨ Features

- ✅ Add new students
- 🔍 Get all students or by ID
- ✏️ Update existing student details
- ❌ Delete a student record
- 🌐 RESTful API architecture
- 📚 Clean and modular codebase for easy understanding

---

## 🛠️ Tech Stack

| Technology      | Description                             |
|----------------|----------------------------------------- |
| Java 21         | Programming Language                    |
| Spring Boot     | Backend Framework  (3.5.4)              |
| Spring Data JPA | ORM Layer                               |
| MySQL           | Relational Database                     |
| Maven           | Dependency Management & Build Tool      |
| REST API        | Communication between client & server   |
| Postman         | API Testing Tool                        |

---

## 📁 Project Structure

```plaintext
student-management-springboot/
├── src/
│ ├── main/
│   ├── java/com/rabi/JPA_Project_01/
│     ├── controller/
|            └──StudentController.java
│     ├── entity/
|            └──Student.java
│     ├── repo/
|            └──StudentRepo.java
│     └── service/
|            └──StudentService.java
│     └── JpaProject01Application.java
│   |── resources/
│     └── application.properties
| 
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
---


## 🚀 Project Setup

### Prerequisites
- Java 21
- MySQL installed & running
- Maven 
- Postman (optional for API testing)

### Clone the Repository
```bash
  git clone https://github.com/rabi-09/Student-Management-SpringBoot.git
  cd Student-Management-SpringBoot
```

### Setup Database
- Create a MySQL database 
- Update your application.properties file

### Build & Run
```bash
  mvn clean install
  mvn spring-boot:run
```
---

## ✅ Conclusion

This project demonstrates core backend development concepts including RESTful APIs, CRUD operations, and MySQL integration using Spring Boot and JPA. It serves as a solid base for learning and building scalable Java applications.
