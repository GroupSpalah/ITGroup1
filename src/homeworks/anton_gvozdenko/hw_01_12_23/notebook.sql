CREATE DATABASE Notebook_sql;
USE Notebook_sql;

CREATE TABLE Notebook(
model VARCHAR(20),
manufacturer VARCHAR(20),
date_creation DATE,
RAM INT,
SSD INT,
CPU VARCHAR(30),
notebook_id INT PRIMARY KEY AUTO_INCREMENT);

INSERT INTO  Notebook(model,manufacturer,date_creation,RAM,SSD,CPU,notebook_id)
VALUES 
('Omem',    'HP',   '2023-01-01',16,500,'AMD',1),
('Vivibook','Asus', '2023-02-02',8,1000,'Intel',2),
('Nitro',   'Acer', '2023-03-03',8,250, 'Intel_pentium',3),
('Macbook', 'Apple','2022-04-04',8,256, 'Apple_m1',4);

