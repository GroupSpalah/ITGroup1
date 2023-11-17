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
('Alex', 'Tylor',    3),
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

SELECT d.dept_id, COUNT(*)
FROM empl e 
INNER JOIN dept d
ON e.FK_Empl_Dept = d.dept_id
GROUP BY d.dept_id;
 
SELECT d.city, COUNT(*)
FROM empl e 
INNER JOIN dept d
ON e.FK_Empl_Dept = d.dept_id
WHERE d.city LIKE '%i%' 
GROUP BY d.city;

SELECT *
FROM empl e 
INNER JOIN dept d
ON e.FK_Empl_Dept = d.dept_id
WHERE e.first_name IN (SELECT e2.first_name FROM empl e2 GROUP BY first_name HAVING COUNT(*) > 1) AND d.city = 'Lviv' 
ORDER BY first_name;

SELECT d.city, COUNT(*)
FROM empl e 
INNER JOIN dept d
ON e.FK_Empl_Dept = d.dept_id
WHERE e.first_name = 'Alex'
GROUP BY d.city HAVING COUNT(*) > 2;

