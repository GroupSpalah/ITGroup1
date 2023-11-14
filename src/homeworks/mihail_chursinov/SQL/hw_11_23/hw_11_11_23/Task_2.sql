CREATE DATABASE task2_sql;

USE task2_sql;

CREATE TABLE Empl (
empl_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(40),
last_name VARCHAR(40),
FK_Empl_Dept INT,
FOREIGN KEY (FK_Empl_Dept) REFERENCES Dept(dept_id)
);

CREATE TABLE Dept (
dept_id INT PRIMARY KEY AUTO_INCREMENT,
city ENUM('Kyiv', 'Lviv', 'Odesa'));

INSERT INTO Empl (first_name, last_name, FK_Empl_Dept) VALUES
('Mike', 'Nikolson', 1),
('John', 'Felix',    2),
('Alex', 'Tylor',    3);

INSERT INTO Dept (City) VALUES
('Kyiv'),
('Lviv'),
('Odesa');

SELECT city 
FROM dept;

SELECT DISTINCT first_name
FROM Empl
ORDER BY first_name;

SELECT COUNT(*)
FROM empl
WHERE FK_Empl_Dept = 1;