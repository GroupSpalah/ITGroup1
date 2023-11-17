CREATE DATABASE new_school;
USE new_school;
 CREATE TABLE student(
 
sur_name VARCHAR(32),

first_name VARCHAR(32),

second_name VARCHAR(32) UNIQUE,

age INT,
number_school INT DEFAULT 5,
UNIQUE KEY(first_name,sur_name,second_name);

INSERT INTO student (first_name,sur_name,second_name,age,number_school)
VALUES 
('Andrew','Ivanovsch','Ivanov',25,1),

('Anton','Stepanovich','Stepanov',9,10),

('Petr','Petrovich','Petrov',11,7);

SELECT first_name,sur_name,second_name,age FROM student WHERE first_name LIKE 'a%';

SELECT first_name,sur_name,second_name,age FROM student WHERE first_name LIKE '%e';

SELECT first_name,sur_name,second_name,age FROM student WHERE first_name LIKE '%e%';

UPDATE student SET age = 30 WHERE first_name = 'Andrew';

DELETE  FROM  student WHERE first_name = 'Petr';

SELECT sum(age) FROM student; 

SELECT  max(age)  FROM student; 

SELECT min(age) FROM student; 

SELECT avg(age) FROM student; 

CREATE TABLE people (
people_id INT PRIMARY KEY,

name VARCHAR(30)NOT NULL,

age INT,

CHECK(age > 5));
INSERT  INTO people(people_id,name)
VALUES
(1,'Ben',10),
(2,'John',15),
(3,'Ben',20);
SELECT * FROM people;

