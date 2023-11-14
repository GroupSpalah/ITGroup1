CREATE DATABASE learn_sql;

USE learn_sql;

CREATE TEMPORARY TABLE tp_table();

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

/*IN operator*/

SELECT * FROM human WHERE human_id = 1 OR human_id = 2 OR human_id = 3;

SELECT * FROM human WHERE human_id IN(1,2,3);

/*Distinct*/

SELECT DISTINCT p.first_name FROM person p; 

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
FOREIGN KEY (FK_Human_Address) REFERENCES AddressNew(address_id));

CREATE TABLE Address(
address_id INT PRIMARY KEY AUTO_INCREMENT,
country ENUM('Ukraine', 'Canada', 'Australia'),
city VARCHAR(30),
street VARCHAR(30),
house_number INT);

CREATE TABLE AddressNew(
address_id INT PRIMARY KEY AUTO_INCREMENT,
FK_Address_Country INT NULL,
city VARCHAR(30),
street VARCHAR(30),
house_number INT,
FOREIGN KEY (FK_Address_Country) REFERENCES Country(country_id));

CREATE TABLE Country(
country_id INT PRIMARY KEY AUTO_INCREMENT,
name ENUM('Ukraine', 'Canada', 'Australia'));

INSERT INTO Country(name)
VALUES
('Ukraine'),
('Canada'),
('Australia'),
('Australia');

INSERT INTO Address(country, city, street, house_number)
VALUES
('Ukraine',    'Kiev',   'Schevchenko', 19),
('Canada',     'Odessa', 'Kievskaya', 20),
('Australia',  'Lviv',   'Pushkina', 15),
('Australia',  'Kharkov',   'Zvonkaya', 15);

INSERT INTO AddressNew(city, street, house_number, FK_Address_Country)
VALUES
('Kiev',   'Schevchenko', 19, 1),
('Odessa', 'Kievskaya', 20, 2),
('Lviv',   'Pushkina', 15, 3),
('Kharkov',   'Zvonkaya', 15, 1);

INSERT INTO human(first_name, last_name, age, FK_Human_Address)
VALUES
('Ann', 'Hanks3',    19, 1),
('Ben', 'Travolta', 78, 1),
('Ann', 'Hanks2',    89, 2),
('John', 'Hanks1',    89, 2);

SELECT * 
FROM human h
INNER JOIN addressnew an
ON h.FK_Human_Address = an.address_id
INNER JOIN country c 
ON c.country_id = an.FK_Address_Country;


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

/*LEFT JOIN*/

SELECT * 
FROM address a 
LEFT JOIN human h
ON h.FK_Human_Address = a.address_id;

/*RIGHT JOIN*/

SELECT * 
FROM human h
RIGHT JOIN address a
ON h.FK_Human_Address = a.address_id;

/*CROSS JOIN*/

SELECT * 
FROM human h
CROSS JOIN address a;

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

/*Grouping*/

SELECT h.FK_Human_Address, COUNT(*)
FROM human h 
GROUP BY h.FK_Human_Address;

SELECT h.FK_Human_Address, COUNT(*)
FROM human h 
GROUP BY h.FK_Human_Address
HAVING count(*) > 1;

SELECT h.FK_Human_Address, COUNT(*)
FROM human h 
GROUP BY h.FK_Human_Address
ORDER BY COUNT(*) DESC;

SELECT h.FK_Human_Address, COUNT(*)
FROM human h 
WHERE 1 = 1
GROUP BY h.FK_Human_Address
HAVING count(*) > 1;

SELECT a.country, COUNT(*)
FROM human h 
INNER JOIN address a 
ON h.FK_Human_Address = a.address_id
GROUP BY a.country;

/*Alter*/

CREATE TABLE Example(
example_id INT PRIMARY KEY AUTO_INCREMENT,
ex_number INT);

INSERT INTO example(ex_number)
VALUES
(10),
(15);

ALTER TABLE example 
ADD city VARCHAR(30) DEFAULT 'Lviv';

ALTER TABLE example 
MODIFY COLUMN city VARCHAR(100);

/*String function task*/
/*
 * В таблице есть столбец с именем, некоторые буквы в верхнем и нижнем регистрах.
Изменить имена так, чтобы первая буква была в верхнем регистре, а остальные в нижнем.
 * */
SELECT substring('RelATIonSHips' FROM 2);

SELECT substring('Relationships', 1, 1);

SELECT substring('Relationships' FROM 2);

SELECT upper('Hello');

SELECT lower('Hello');

SELECT concat(upper(substring('RelATIonSHips', 1, 1)), lower(substring('RelATIonSHips' FROM 2)));

UPDATE example SET city = concat(upper(substring(city, 1, 1)), lower(substring(city FROM 2)));

/*Sub query*/

SELECT h2.human_id FROM human h2 WHERE first_name = 'John';

SELECT * FROM human h WHERE h.human_id = (SELECT h2.human_id FROM human h2 WHERE first_name = 'John');/*4*/

/*One to one bi-*/

CREATE TABLE Department(
department_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30), 
FK_Department_Phone INT,
FOREIGN KEY (FK_Department_Phone) REFERENCES Phone(phone_id));

CREATE TABLE Phone(
phone_id INT PRIMARY KEY AUTO_INCREMENT,
number VARCHAR(30),
FK_Phone_Department INT DEFAULT NULL);

ALTER TABLE Phone ADD FOREIGN KEY (FK_Phone_Department) REFERENCES department(department_id);

INSERT INTO phone(`number`, FK_Phone_Department)
VALUES
('067', NULL),
('068', NULL),
('093', NULL);

INSERT INTO department(name, FK_Department_Phone)
VALUES
('IT', 1),
('Manager', 2),
('Production', 3);

UPDATE phone SET FK_Phone_Department = 1 WHERE phone_id  = 1;
UPDATE phone SET FK_Phone_Department = 2 WHERE phone_id  = 2;
UPDATE phone SET FK_Phone_Department = 3 WHERE phone_id  = 3;

/*OneToMany uni-*/

CREATE TABLE Autopark(
park_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30));

CREATE TABLE Vehicle(
vehicle_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
FK_Vehicle_Autopark INT,
FOREIGN KEY (FK_Vehicle_Autopark) REFERENCES Autopark(park_id));

/*OneToMany bi-*/

CREATE TABLE Company(
company_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30));

CREATE TABLE Secretary(
secretary_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30));

CREATE TABLE Company_Secretary(
FK_Company_ID INT,
FK_Secretary_ID INT UNIQUE,
FOREIGN KEY (FK_Company_ID) REFERENCES Company(company_id),
FOREIGN KEY (FK_Secretary_ID) REFERENCES Secretary(secretary_id));

/*ManyToMany*/

CREATE TABLE Company(
company_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30));

CREATE TABLE Secretary(
secretary_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30));

CREATE TABLE Company_Secretary(
FK_Company_ID INT,
FK_Secretary_ID INT,
FOREIGN KEY (FK_Company_ID) REFERENCES Company(company_id),
FOREIGN KEY (FK_Secretary_ID) REFERENCES Secretary(secretary_id),
UNIQUE KEY(FK_Company_ID, FK_Secretary_ID));
