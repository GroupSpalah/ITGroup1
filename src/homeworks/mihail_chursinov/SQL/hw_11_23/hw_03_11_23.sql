CREATE DATABASE goods_sql;

USE goods_sql;

CREATE TABLE Goods(
goods_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(40),
production_date DATE,
manufacturer VARCHAR(40),
fragility BOOLEAN,
price INT,
FK_Goods_Manufacturer INT,
FOREIGN KEY (FK_Goods_Manufacturer) REFERENCES Manufacturer (manufacturer_id));
); 

INSERT INTO Goods (name, production_date, manufacturer, fragility, price, FK_Goods_Manufacturer)
VALUES 
('Laptop',     '2022-01-20', 'HP',      TRUE,    900, 1),
('Television', '2020-04-10', 'LG',      FALSE,   700, 2),
('Phone',      '2019-01-01', 'Samsung', TRUE,    600, 3);

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

SELECT m.company_name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.fragility = 0;

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.production_date BETWEEN  '2020-01-20' AND '2023-01-01';

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.price BETWEEN  100 AND 800;

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.name LIKE 'p%';

SELECT g.manufacturer
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE g.manufacturer LIKE 's%';

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
WHERE m.country LIKE 'u%';

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
ORDER BY g.production_date LIMIT 2;

SELECT g.name
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id
ORDER BY g.production_date DESC LIMIT 2;

SELECT CONCAT (g.name, '->', g.price, '$', m.company_name, '#', m.country)
FROM goods g 
INNER JOIN manufacturer m 
ON g.FK_Goods_Manufacturer = m.manufacturer_id;