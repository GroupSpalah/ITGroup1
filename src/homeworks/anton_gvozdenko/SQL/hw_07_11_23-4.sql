
CREATE DATABASE WORKS;

USE WORKS;

CREATE TABLE Employee(
employee_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
FK_employee_dept INT,
FOREIGN KEY (FK_employee_dept)REFERENCES Dept(dept_id));

CREATE TABLE Dept(
dept_id INT PRIMARY KEY AUTO_INCREMENT,
dept_number INT,
city VARCHAR(30));

INSERT INTO Employee(first_name,last_name,FK_employee_dept)
VALUES
('John',  'Johnson',1),
('Ben',   'Bush',2),
('Donald','Tramp',3),
('John',  'Peterson',4);

INSERT INTO Dept(dept_number,city)
VALUES
(10,'Kiev'),
(20,'Lviv'),
(30,'Odessa'),
(10,'Mikolaiv');

 SELECT * FROM Employee e
 INNER JOIN Dept d
 ON e.FK_employee_dept  = d.dept_id;

 SELECT d.city   
 FROM employee e 
 INNER JOIN Dept d 
 ON e.FK_employee_dept  = d.dept_id;

 SELECT DISTINCT  e.first_name
 FROM employee e 
 INNER JOIN dept d 
 ON e.FK_employee_dept  = d.dept_id;

 SELECT d.dept_number   ,COUNT(*)
 FROM employee e 
 INNER JOIN dept d 
 ON e.FK_employee_dept  = d.dept_id
 GROUP BY d.dept_number ;

SELECT   e.first_name,count(*) 
FROM employee e 
INNER JOIN dept d 
ON e.FK_employee_dept  = d.dept_id
WHERE d.dept_number  > 10
GROUP BY e.first_name  
ORDER BY count(*) DESC;

SELECT e.first_name,d.city 
FROM employee e 
INNER JOIN dept d 
ON e.FK_employee_dept  = d.dept_id
WHERE d.dept_number > 9;

SELECT d.city
FROM employee e 
INNER JOIN dept d 
ON e.FK_employee_dept  = d.dept_id
WHERE d.city LIKE 'L%';

SELECT d.city ,COUNT(*) 
FROM employee e 
INNER JOIN dept d 
ON e.FK_employee_dept  = d.dept_id
WHERE d.city LIKE '%l%' 
GROUP BY d.city;

SELECT * FROM
employee e 
INNER JOIN dept d 
WHERE e.first_name  IN (SELECT e2.first_name FROM employee e2 GROUP BY first_name HAVING d.city = 'Lviv');

SELECT *
FROM employee e
INNER JOIN dept d 
WHERE e.first_name IN(SELECT e2.first_name  FROM employee e2  GROUP BY employee_id  HAVING e.first_name = 'John');

















