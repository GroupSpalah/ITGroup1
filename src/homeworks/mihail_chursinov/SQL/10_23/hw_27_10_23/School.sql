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

CREATE TABLE Goods(
goods_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(40),
production_date VARCHAR(40),
manufacturer VARCHAR(40),
fragility VARCHAR(40),
price INT,
FK_Goods_Manufacturer INT,
FOREIGN KEY (FK_Goods_Manufacturer) REFERENCES Manufacturer (manufacturer_id));
); 

INSERT INTO Goods (name, production_date, manufacturer, fragility, price, FK_Goods_Manufacturer)
VALUES 
('Laptop',     '2022-01-20', 'HP',      'Fragile',   900, 1),
('Television', '2020-04-10', 'LG',      'Medium', 700, 2),
('Phone',      '2019-01-01', 'Samsung', 'Low',    600, 3);

SELECT * 
FROM goods;

CREATE TABLE Manufacturer(
manufacturer_id INT PRIMARY KEY AUTO_INCREMENT,
company_name VARCHAR(40),
country ENUM('Ukraine', 'USA', 'Canada')
);

INSERT INTO Manufacturer (company_name, country)
VALUES 
('HP',      'USA'),
('LG',      'Canada'),
('Samsung', 'Ukraine');

SELECT * 
FROM Manufacturer;

SELECT * 
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id;

SELECT m.company_name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.fragility = 'Fragile';

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.production_date >= '2020-01-20' AND g.production_date <='2023-01-01';