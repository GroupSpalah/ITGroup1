CREATE DATABASE school_sql;

USE school_sql;

CREATE TABLE Students(
first_name VARCHAR(30),
last_name VARCHAR(30),
age INT,
school_number INT
);

SELECT * FROM students;

SELECT first_name, last_name
FROM students;

SELECT first_name, last_name, age
FROM students;

SELECT first_name, last_name, age, school_number
FROM students WHERE school_number = 7 OR school_number = 10;

SELECT *
FROM students ORDER BY school_number;

SELECT *
FROM students ORDER BY school_number DESC;