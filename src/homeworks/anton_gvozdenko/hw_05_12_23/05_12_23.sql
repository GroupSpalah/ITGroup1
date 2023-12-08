CREATE DATABASE Road;
USE Road;

CREATE  TABLE Driver(
driver_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
age INT,
qualification ENUM('junior','middle','senior'));

CREATE TABLE Truck(
truck_id INT PRIMARY KEY AUTO_INCREMENT,
model VARCHAR(30),
model_year DATE,
FK_truck_driver INT,
FOREIGN KEY(FK_truck_driver) REFERENCES Driver(driver_id));


INSERT INTO Driver(first_name,last_name,age,qualification)
VALUES
('John','Bush',20,'junior'),
('Ben','Baiden',33,'middle'),
('Nicolas','Johnson',40,'senior');

INSERT INTO Truck(model,model_year,FK_truck_driver)
VALUES
('Daf','2022-01-01',1),
('Renaut','2020-02-02',2),
('Mersedes','2021-03-03',3);