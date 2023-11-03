CREATE DATABASE learn_sql;

USE learn_sql;

CREATE TABLE Person(
first_name VARCHAR(30),
last_name VARCHAR(40),
age INT);

INSERT INTO person(first_name, last_name, age)
VALUES
('Barbara', 'Kennedi', 30),
('Alice', 'Squirell', 28),
('Izabella', 'Hanks', 31);

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

/* LIMIT, OFFSET */
SELECT * FROM person LIMIT 2 OFFSET 2;

/*INNER JOIN*/

CREATE TABLE Human(
human_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
age INT, 
FK_Human_Address INT,
FOREIGN KEY (FK_Human_Address) REFERENCES Address(address_id));

CREATE TABLE Address(
address_id INT PRIMARY KEY AUTO_INCREMENT,
country ENUM('Ukraine', 'Canada', 'Australia'),
city VARCHAR(30),
street VARCHAR(30),
house_number INT);

INSERT INTO Address(country, city, street, house_number)
VALUES
('Ukraine',    'Kiev',   'Schevchenko', 19),
('Canada',     'Odessa', 'Kievskaya', 20),
('Australia',  'Lviv',   'Pushkina', 15),
('Australia',  'Kharkov',   'Zvonkaya', 15);

INSERT INTO human(first_name, last_name, age)
VALUES
('Ann', 'Hanks3',    19),
('Ben', 'Travolta', 78),
('Ann', 'Hanks2',    89),
('John', 'Hanks1',    89);

SELECT * FROM human 
INNER JOIN address 
ON human.FK_Human_Address = address.address_id;

SELECT h.first_name, h.last_name, a.country, a.city 
FROM human h
INNER JOIN address a
ON h.FK_Human_Address = a.address_id;

SELECT h.first_name, h.last_name, a.country, a.city 
FROM human h
INNER JOIN address a
ON h.FK_Human_Address = a.address_id
WHERE a.city = 'Kiev';

/*Dates*/

SELECT now();
SELECT curdate();

SELECT date_add(now(), INTERVAL 2 YEAR); 
SELECT date_add(now(), INTERVAL 2 HOUR); 

SELECT date_format(now(), '%b %d %Y %h:%i %p'); 

SELECT date_format(now(), '%d %b %y'); 

/*Between*/

SELECT * FROM human h WHERE h.age > 10 AND h.age < 70;

SELECT * FROM human h WHERE h.age BETWEEN 10 AND 90;

/*String function*/

SELECT CONCAT('My', 'S', 'QL');

SELECT CONCAT(h.first_name , ' ', h.last_name) FROM human h;