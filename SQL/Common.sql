CREATE DATABASE learn_sql;

USE learn_sql;

CREATE TABLE Person(
first_name VARCHAR(30),
last_name VARCHAR(40),
age INT);

INSERT INTO person(first_name, last_name, age)
VALUES
('John', 'Kennedi', 30),
('Ben', 'Squirell', 28),
('Tom', 'Hanks', 31);

SELECT * FROM person;

SELECT first_name, age FROM person;

SELECT * FROM person WHERE age > 30;

SELECT * FROM person WHERE age > 30 AND first_name = 'Tom';

SELECT * FROM person WHERE age > 30 OR first_name = 'Tom';

/*Sorting*/

SELECT * FROM person ORDER BY age ASC;

SELECT * FROM person ORDER BY age DESC;

