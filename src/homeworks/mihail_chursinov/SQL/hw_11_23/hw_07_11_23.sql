CREATE DATABASE item_sql;

USE item_sql;

CREATE TABLE Item(
item_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(40),
production_date DATE,
manufacturer VARCHAR(40),
fragility BOOLEAN,
price INT,
FK_Item_Producer INT,
FOREIGN KEY (FK_Item_Producer) REFERENCES Producer (Producer_id));

INSERT INTO Item (name, production_date, manufacturer, fragility, price, FK_Item_Producer)
VALUES 
('Laptop',     '2022-01-20', 'HP',      TRUE,    900, 1),
('Television', '2020-04-10', 'LG',      FALSE,   700, 2),
('Phone',      '2019-01-01', 'Samsung', TRUE,    600, 3),
('Phone',      '2018-11-01', 'Samsung', TRUE,    600, 3);

CREATE TABLE Producer(
producer_id INT PRIMARY KEY AUTO_INCREMENT,
FK_Producer_Country INT,
company_name ENUM('HP', 'LG', 'Samsung'),
FOREIGN KEY (FK_Producer_Country) REFERENCES Country (Country_id));

INSERT INTO Producer (company_name, FK_Producer_Country)
VALUES 
('HP',      1),
('LG',      2),
('Samsung', 3),
('Samsung', 3);

CREATE TABLE Country(
country_id INT PRIMARY KEY AUTO_INCREMENT,
name ENUM('USA', 'Canada', 'Ukraine'));

INSERT INTO Country (name)
VALUES 
('USA'),
('Canada'),
('Ukraine'),
('Ukraine');

UPDATE item SET name = 'Laptop', price = 500
WHERE item_id IN (1, 3);

SELECT *
FROM item i 
INNER JOIN producer p 
ON i.FK_Item_Producer = p.producer_id 
INNER JOIN country c 
ON c.country_id = p.FK_Producer_Country;

SELECT i.price, COUNT(*) 
FROM item i 
GROUP BY i.price;

SELECT i.fragility, COUNT(*)
FROM item i 
GROUP BY i.fragility;

SELECT i.production_date, COUNT(*)
FROM item i 
GROUP BY i.production_date;

ALTER TABLE item 
MODIFY COLUMN name VARCHAR(100);

SELECT i.fragility, COUNT(*)
FROM item i 
GROUP BY i.fragility;

SELECT i.production_date, COUNT(*)
FROM item i 
GROUP BY i.production_date
HAVING COUNT(*) = 1;

SELECT p.company_name, COUNT(*)
FROM item i 
INNER JOIN producer p 
ON i.FK_Item_Producer = p.producer_id 
INNER JOIN country c 
ON c.country_id = p.FK_Producer_Country
WHERE c.name LIKE 'c%' 
GROUP BY p.company_name;
