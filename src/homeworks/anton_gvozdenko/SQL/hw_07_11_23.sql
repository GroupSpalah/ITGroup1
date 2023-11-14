CREATE DATABASE Product;

USE Product;

CREATE TABLE Item(


id_item INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(30),

date_production DATE,

manufacturer VARCHAR(30),

isCrash BOOLEAN,

price INT,

FK_item_producer_id INT,

FOREIGN KEY (FK_item_producer_id) REFERENCES  Producer(producer_id)) ;

CREATE TABLE Producer(

producer_id INT PRIMARY KEY AUTO_INCREMENT,

manufacturer_name ENUM('LG','NOKIA','SAMSUNG'),

 FK_producer_country INT,
  
 FOREIGN KEY(FK_producer_country) REFERENCES Country(country_id)  
);
CREATE TABLE Country(
country_id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(30));

INSERT INTO Item(name,date_production,manufacturer,isCrash,price,FK_item_producer_id)
VALUES
('Phone','2022-01-01','LG',     TRUE, 100,1),
('Phone','2021-02-02','Nokia',  FALSE,105,1),
('Bike', '2022-01-01','Honda',  FALSE,500,2),
('TV',   '2022-02-22','SAMSUNG',TRUE, 200,2);

INSERT INTO Producer(manufacturer_name,FK_producer_country)
VALUES
('LG',     1),
('Nokia',  2),
('SAMSUNG',2);

INSERT INTO Country(name)
VALUES
('USA'),
('Italy'),
('Ukraine');

SELECT * FROM  Item i
INNER JOIN Producer pr
ON i.FK_item_producer_id = pr.producer_id
INNER JOIN Country c
ON c.country_id = pr.FK_producer_country;


UPDATE Item SET  name = 'Bike',price = 500
WHERE  price = 200;

SELECT i.price,COUNT(*)
FROM Item i
GROUP BY i.price;

SELECT i.isCrash,count(*)
FROM Item i
GROUP BY i.isCrash;

SELECT i.name,count(*)
FROM Item i
GROUP BY i.name;

SELECT i.date_production,count(*)
FROM Item i
GROUP BY i.date_production;

SELECT i.date_production,count(*) 
FROM Item i
GROUP BY i.date_production
HAVING COUNT(*) = 2;

SELECT i.price,count(*) 
FROM Item i
GROUP BY i.price
HAVING COUNT(*) > 1;

ALTER TABLE Item
MODIFY COLUMN name VARCHAR(100);

SELECT pr.manufacturer_name ,COUNT(*)
FROM Item i
INNER JOIN Producer pr
ON i.FK_item_producer_id = pr.producer_id
INNER JOIN Country c
ON c.country_id = pr.FK_producer_country
WHERE c.name LIKE '%U'
GROUP BY pr.manufacturer_name;


