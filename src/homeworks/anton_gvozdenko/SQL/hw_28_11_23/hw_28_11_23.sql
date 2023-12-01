CREATE DATABASE Address_sql;

USE Address_sql;

CREATE TABLE Address(
country  VARCHAR(30),
city VARCHAR(30),
street VARCHAR(30),
house_number INT
);

INSERT INTO Address(country,city,street,house_number)
VALUES
('Ukraine','Kiev','Peremohy',1),
('USA','New York','Central',2),
('Italy','Rome','Corso',3);