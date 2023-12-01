CREATE DATABASE address_sql;

USE address_sql;

CREATE TABLE Address(
address_id INT PRIMARY KEY AUTO_INCREMENT,
country ENUM('Ukraine', 'USA', 'Canada'),
city VARCHAR(50),
street VARCHAR(40),
number_house INT);

INSERT INTO Address (country, city, street, number_house)
VALUES
('Ukraine', 'Kyiv',        'Sadova',         123),
('USA',     'New York',    'Main Street',    456),
('Canada',  'Ottawa ',     'Harvard Street', 789),
('USA',     'Los Angeles', 'Oak Street',     321);

SELECT * FROM Address;