# Student Management System

A **console-based CRUD application** developed in **Java** using **JDBC** and **MySQL**.  
This project allows adding, updating, deleting, searching, and listing student records securely using **PreparedStatement**.

---

## Features

- Add new student records
- Update existing student records
- Delete student records
- Search for students by **name or roll number**
- List all students
- Secure SQL queries with **PreparedStatement** to prevent SQL injection

---

## Technologies Used

- Java 11+
- MySQL 8+
- JDBC

---

## Project Structure
```
StudentManagementSystem/
│
├─ src/
│ ├─ DBConnection.java
│ ├─ Student.java
│ ├─ StudentDAO.java
│ └─ StudentManagementSystem.java
│
├─ screenshots/
│ ├─ add_student.png
│ ├─ list_students.png
│ └─ search_student.png
│
├─ README.md
└─ .gitignore
```
## Database Setup

Create database studentdb:

CREATE DATABASE studentdb;
USE studentdb;


Create table students:

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    roll_no VARCHAR(20) UNIQUE NOT NULL,
    department VARCHAR(50),
    year INT
);


## Update database credentials in DBConnection.java:

private static final String URL = "jdbc:mysql://localhost:3306/student_ds";
private static final String USER = "root";
private static final String PASSWORD = "yourpassword";

## How to Run

Compile Java files:

javac src/*.java


Run the application:

java -cp src studentManagementSystem

## Screenshots

Add Student


List Students


Search Student


## GitHub Repo

Clone this project:

git clone (https://github.com/SamikshaSinha-31/Student_Management_System.git)

### Author

Samiksha Sinha
