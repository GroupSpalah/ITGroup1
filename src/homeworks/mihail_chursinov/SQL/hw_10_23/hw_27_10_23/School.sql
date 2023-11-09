CREATE DATABASE school_sql;

USE school_sql;

CREATE TABLE Students(
students_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) UNIQUE,
age INT,
school_number INT DEFAULT 5,
CHECK (age > 5),
UNIQUE KEY (first_name, last_name)
);

INSERT INTO students (first_name, last_name, age, school_number)
VALUES 
('Nick', 'Tkach',    10, 5),
('Adam', 'Peterson', 12, 7),
('Vike', 'Son',      15, 10);


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

SELECT last_name, age 
FROM students WHERE first_name LIKE 'a%';

SELECT last_name, age 
FROM students WHERE first_name LIKE '%e';

SELECT first_name, age 
FROM students WHERE last_name LIKE '%e%';

UPDATE students SET age = 36 WHERE first_name = 'Nick';

DELETE 
FROM students WHERE first_name = 'Jack';  

SELECT sum(age) 
FROM students;

SELECT max(age) 
FROM students;

SELECT min(age) 
FROM students;

SELECT avg(age) 
FROM students;

