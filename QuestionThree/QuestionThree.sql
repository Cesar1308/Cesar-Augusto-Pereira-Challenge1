CREATE DATABASE Employes;

USE Employes;

CREATE TABLE Employees(
employee_id INT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(50),
hire_date DATE,
salary DECIMAL(10,2)
);

SELECT * FROM Employees;
