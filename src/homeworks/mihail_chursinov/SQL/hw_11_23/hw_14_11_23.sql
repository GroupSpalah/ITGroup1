#DROP DATABASE students_sql;

CREATE DATABASE IF NOT EXISTS students_sql;

USE students_sql;

CREATE TABLE Address(
address_id INT PRIMARY KEY AUTO_INCREMENT,
city VARCHAR(50),
street VARCHAR(50),
number_house INT,
number_apartament INT);

ALTER TABLE Address AUTO_INCREMENT = 1;

CREATE TABLE University(
university_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
foundation_date DATE 
);

ALTER TABLE University AUTO_INCREMENT = 1;

CREATE TABLE Faculty(
faculty_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
foundation_date DATE 
);

ALTER TABLE Faculty AUTO_INCREMENT = 1;

CREATE TABLE University_Faculty(
FK_University_ID INT,
FK_Faculty_ID INT,
FOREIGN KEY (FK_University_ID) REFERENCES University(university_id),
FOREIGN KEY (FK_Faculty_ID) REFERENCES Faculty(faculty_id),
UNIQUE KEY(FK_University_ID, FK_Faculty_ID));

CREATE TABLE Group_Student(
group_student_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
foundation_date DATE,
FK_Group_St_Students INT DEFAULT NULL,
FK_Group_St_Faculty INT,
FOREIGN KEY (FK_Group_St_Faculty) REFERENCES Faculty(faculty_id) 
);

ALTER TABLE Group_Student AUTO_INCREMENT = 1;

CREATE TABLE Students(
student_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
gender ENUM ('male','female'),
birth_date DATE,
FK_Students_Address INT,
FK_Students_Group_St INT,
FOREIGN KEY (FK_Students_Address) REFERENCES Address(address_id),
FOREIGN KEY (FK_Students_Group_St) REFERENCES Group_Student(group_student_id)
);

ALTER TABLE Students AUTO_INCREMENT = 1;

ALTER TABLE Group_Student ADD FOREIGN KEY (FK_Group_St_Students) REFERENCES Students(student_id);

INSERT INTO Address (city, street, number_house, number_apartament)
VALUES
('New York',      'Broadway',       123, 45),
('San Francisco', 'Main Street',    456, 78),
('Cambridge',     'Harvard Street', 789, 12),
('Berkeley',      'Oak Street',     321, 56),
('Princeton',     'Nassau Street',  654, 34);

INSERT INTO University (name, foundation_date)
VALUES
('Harvard University',                    '1636-09-08'),
('Stanford University',                   '1885-10-01'),
('Massachusetts Institute of Technology', '1861-04-10'),
('University of California, Berkeley',    '1868-03-23'),
('Princeton University',                  '1746-10-22');


INSERT INTO Faculty (name, foundation_date)
VALUES
('Engineering',      '1914-05-12'),
('Business',         '1925-09-20'),
('Computer Science', '1965-03-17'),
('Economics',        '1893-02-09'),
('Physics',          '1901-11-22');

INSERT INTO University_Faculty (FK_University_ID, FK_Faculty_ID)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);

INSERT INTO Group_Student (name, foundation_date, FK_Group_St_Faculty, FK_Group_St_Students)
VALUES
('Group A', '2021-09-01', 1, NULL),
('Group B', '2021-09-01', 2, NULL),
('Group C', '2021-09-01', 3, NULL),
('Group D', '2021-09-01', 4, NULL),
('Group E', '2021-09-01', 5, NULL);

INSERT INTO Students (first_name, last_name, gender, birth_date, FK_Students_Address, FK_Students_Group_St)
VALUES
('John',      'Doe',      'male',   '1995-05-10', 1, 1),
('Jane',      'Smith',    'female', '1996-08-22', 2, 2),
('Alice',     'Johnson',  'female', '1997-02-15', 1, 3),
('Bob',       'Williams', 'male',   '1996-11-30', 3, 2),
('Eva',       'Brown',    'female', '1998-04-05', 2, 1),
('Daniel',    'Taylor',   'male',   '1997-09-18', 4, 3),
('Olivia',    'Miller',   'female', '1996-06-25', 1, 2),
('Michael',   'Anderson', 'male',   '1997-12-12', 3, 1),
('Sophia',    'Wilson',   'female', '1998-01-07', 2, 3),
('James',     'Martin',   'male',   '1995-08-20', 4, 2),
('Emily',     'Moore',    'female', '1996-03-14', 1, 1),
('William',   'Jackson',  'male',   '1997-10-28', 3, 3),
('Emma',      'Thompson', 'female', '1998-07-02', 2, 2),
('Alexander', 'Smith',    'male',   '1995-04-09', 4, 1),
('Grace',     'Davis',    'female', '1996-09-22', 1, 3),
('Daniel',    'Clark',    'male',   '1997-01-15', 3, 2),
('Sophia',    'Evans',    'female', '1998-06-18', 2, 1),
('Liam',      'Harrison', 'male',   '1995-03-30', 4, 3),
('Ava',       'Baker',    'female', '1996-10-14', 1, 2),
('Benjamin',  'Fisher',   'male',   '1997-07-09', 3, 1);

UPDATE Group_Student SET FK_Group_St_Students = 1 WHERE group_student_id = 1; 
UPDATE Group_Student SET FK_Group_St_Students = 2 WHERE group_student_id = 2;
UPDATE Group_Student SET FK_Group_St_Students = 3 WHERE group_student_id = 3;
UPDATE Group_Student SET FK_Group_St_Students = 4 WHERE group_student_id = 4;
UPDATE Group_Student SET FK_Group_St_Students = 5 WHERE group_student_id = 5;

SELECT * 
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id 
INNER JOIN faculty f
ON gs.FK_Group_St_Faculty = f.faculty_id
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
WHERE u.name = 'Harvard University';

SELECT * 
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id 
INNER JOIN faculty f
ON gs.FK_Group_St_Faculty = f.faculty_id
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
WHERE u.name = 'Massachusetts Institute of Technology' 
AND f.name = 'Computer Science';

SELECT * 
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id 
INNER JOIN faculty f
ON gs.FK_Group_St_Faculty = f.faculty_id
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
WHERE u.name = 'Stanford University' 
AND f.name = 'Business' 
AND gs.name = 'Group B';

SELECT s.first_name, s.last_name,
DATE_FORMAT(birth_date, '%d %b %y')
FROM students s;

SELECT gs.name, s.first_name, s.last_name 
FROM group_student gs 
INNER JOIN students s  
ON gs.FK_Group_St_Students = s.student_id;

#- найти группу с максимальным количеством студентов.

SELECT gs.name, count(*)
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id
GROUP BY gs.name;

SELECT gs.name, count(*)
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id
GROUP BY gs.name
ORDER BY count(*) DESC
LIMIT 1;

#- найти группу с минимальным количеством студентов.

SELECT gs.name, count(*)
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id
GROUP BY gs.name
ORDER BY count(*)
LIMIT 1;

#- вывести среднее количество людей в группе по университету.

SELECT u.name, gs.name `group_name`, count(*) qty
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id 
INNER JOIN faculty f
ON gs.FK_Group_St_Faculty = f.faculty_id
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
GROUP BY u.name, gs.name;

SELECT ug.name, ug.group_name, avg(ug.qty)
FROM(
				SELECT u.name, gs.name `group_name`, count(*) qty
				FROM students s  
				INNER JOIN group_student gs 
				ON s.FK_Students_Group_St = gs.group_student_id 
				INNER JOIN faculty f
				ON gs.FK_Group_St_Faculty = f.faculty_id
				INNER JOIN University_Faculty uf
				ON uf.FK_Faculty_ID = f.faculty_id
				INNER JOIN university u 
				ON uf.FK_University_ID = u.university_id
				GROUP BY u.name, gs.name
) ug
GROUP BY ug.name;

SELECT u.name, COUNT(*) faculty
FROM faculty f
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
GROUP BY u.name
ORDER BY faculty DESC;

SELECT u.name, COUNT(*) gr 
FROM group_student gs  
INNER JOIN faculty f 
ON gs.FK_Group_St_Faculty = f.faculty_id 
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
GROUP BY u.name
ORDER BY gr DESC;

SELECT u.name, COUNT(*) student  
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_St = gs.group_student_id 
INNER JOIN faculty f
ON gs.FK_Group_St_Faculty = f.faculty_id
INNER JOIN University_Faculty uf
ON uf.FK_Faculty_ID = f.faculty_id
INNER JOIN university u 
ON uf.FK_University_ID = u.university_id
GROUP BY u.name
ORDER BY student DESC;



