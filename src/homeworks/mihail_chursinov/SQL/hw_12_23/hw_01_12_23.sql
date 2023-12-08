CREATE DATABASE notebook_sql;

USE notebook_sql;

CREATE TABLE notebook (
id INT PRIMARY KEY AUTO_INCREMENT,
model VARCHAR(50),
producer VARCHAR(50),
release_date DATE,
ram_amount INT,
ssd_capacity INT,
cpu VARCHAR(50));

INSERT INTO notebook (model, producer, release_date, ram_amount, ssd_capacity, cpu)
VALUES
('A23', 'Apple',   '2023-01-01', 8,  256,  'CPU1'),
('L22', 'Lenovo',  '2023-02-15', 16, 512,  'CPU2'),
('S18', 'Samsung', '2023-03-30', 32, 1024, 'CPU3');

SELECT * FROM notebook n;