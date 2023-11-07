CREATE DATABASE shops;
USE shop;
CREATE TABLE Product(

name VARCHAR(30),

date_production DATE,

fragility BOOLEAN,

price INT,

manufacturer_shop INT,

FOREIGN KEY(manufacturer_shop) REFERENCES Manufacturer(man_id));


CREATE TABLE Manufacturer(

man_id INT PRIMARY KEY AUTO_INCREMENT,

name_man VARCHAR(30),

country ENUM('Ukraine','USA','Spain'));

INSERT INTO Manufacturer(name_man,country)
VALUES
('Sony','Ukraine'),

('LG','USA'),

('Panasonic','Spain');
INSERT INTO Product(name,date_production,fragility,price)
VALUES
('Phone','2023-01-05',TRUE,123),

('Charger','2023-02-22',FALSE,112),

('Bike','2021-01-01',TRUE,333),

('Car','2020-12-01',FALSE,500);

SELECT * FROM Product

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id;

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE manufacturer.name_man = 'Sony' AND Product.fragility = TRUE;

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE Product.date_production BETWEEN '2021-01-01' AND '2023-01-05';

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE Product.price BETWEEN 112 AND 333;

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE Product.name LIKE '%P'; 

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE Manufacturer.name_man LIKE '%S'; 

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE Manufacturer.country LIKE '%U';

SELECT * FROM Product 

INNER JOIN Manufacturer

ON Product.manufacturer_shop = Manufacturer.man_id

WHERE  ORDER BY Manufacturer.date_production;

SELECT concat(Product.name,'->',Product.price,'$',Manufacturer.name_man ,'#', Manufacturer.country); 





