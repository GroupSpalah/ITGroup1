CREATE DATABASE school_sql;
USE school_sql;
 CREATE TABLE student(
sur_name VARCHAR(32),
first_name VARCHAR(32),
second_name VARCHAR(32),
age INT,
number_school INT);
INSERT INTO student (first_name,sur_name,second_name,age,number_school)
VALUES 
('Ivan','Ivanovsch','Ivanov',25,1),
('Stepan','Stepanovich','Stepanov',9,10),
('Petr','Petrovich','Petrov',11,7);
SELECT *FROM student;
SELECT first_name,sur_name,second_name FROM student;
SELECT * FROM student WHERE age > 10;
SELECT * FROM student WHERE number_school = 7 OR number_school = 10;
SELECT *FROM student ORDER BY  number_school ASC;
SELECT *FROM student ORDER BY  number_school DESC;