# Spring JDBC Learning Project 🚀

This project is a simple Spring JDBC application that demonstrates CRUD (Create, Read, Update, Delete) operations using JdbcTemplate and MySQL database.

---

## 📌 Features
- Add new record
- View all records
- Update existing record
- Delete record

---

## 🛠️ Technologies Used
- Java
- Spring JDBC
- MySQL
- Maven
- Eclipse IDE

---

## 📂 Project Structure
SpringJDBC/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   └── resources/
 ├── .gitignore
 ├── pom.xml
 └── README.md
 
 ⚙️ Database Setup
CREATE DATABASE studentdb;
Table Example:
CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    city VARCHAR(100)
);

🔧 Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

▶️ How to Run
git clone https://github.com/AnkitKatkhede07/spring-jdbc-learning.git
Import project in Eclipse / IntelliJ
Run main class
Test CRUD operations
🎯 Concepts Covered
JdbcTemplate
RowMapper
CRUD operations
MySQL integration
Spring JDBC basics

👨‍💻 Author
Ankit Katkhede

⭐ Note

This project is created for learning Spring JDBC fundamentals.
