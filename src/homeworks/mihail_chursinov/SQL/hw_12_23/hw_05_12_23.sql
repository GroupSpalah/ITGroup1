CREATE DATABASE IF NOT EXISTS driver;

USE driver;

CREATE TABLE Driver (
id_driver INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
age INT,
qualification ENUM ('Beginner', 'Intermediate', 'Advanced'));

CREATE TABLE Truck (
id_truck INT PRIMARY KEY AUTO_INCREMENT,
model VARCHAR(50),
model_year INT,
FK_Truck_Driver INT,
FOREIGN KEY (FK_Truck_Driver) REFERENCES Driver(id_driver));

INSERT INTO Driver (first_name, last_name, age, qualification) VALUES
('John', 'Doe', 30, 'Advanced'),
('Jane', 'Smith', 25, 'Intermediate');

INSERT INTO Truck (model, model_year, FK_Truck_Driver) VALUES
('Truck1', 2023, 1),
('Truck2', 2020, 1),
('Truck3', 2021, 2),
('Truck4', 2020, 2);


