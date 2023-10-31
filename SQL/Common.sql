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

/*Wild cards*/
SELECT * FROM person WHERE last_name LIKE '%e%';

/*Update*/

UPDATE person SET first_name = 'Ken' WHERE first_name = 'John';

UPDATE person SET age = (age + 5) WHERE first_name = 'Tom';

/*Delete*/
DELETE FROM person WHERE first_name = 'Ken';

/*Truncate*/
truncate TABLE  person;

/*Delete table*/

DROP TABLE worker;

/*Sum, Max, Min, Avg*/

SELECT sum(age) FROM person;

SELECT max(age) FROM person;
SELECT min(age) FROM person;
SELECT avg(age) FROM person;

/*Primary key*/
CREATE TABLE Worker(
worker_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
age INT DEFAULT 15,
CHECK(age > 10),
UNIQUE KEY(first_name, last_name));

INSERT INTO worker(first_name, last_name, age)
VALUES
('Ann', 'Hanks',    19),
('Ben', 'Travolta', 78),
('Ann', 'Hanks',    89);

SELECT * FROM worker;

DELETE FROM worker WHERE worker_id = 3;

Truncate TABLE worker;
