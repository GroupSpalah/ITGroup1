CREATE DATABASE students_sql;

USE students_sql;

CREATE TABLE Students(
students_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
gender ENUM ('male','female'),
birth_date DATE,
FK_Students_Address INT,
FK_Students_Group_Student INT,
FOREIGN KEY (FK_Students_Address) REFERENCES Address(address_id),
FOREIGN KEY (FK_Students_Group_Student) REFERENCES Group_Student(group_student_id)
);

CREATE TABLE University(
university_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
foundation_date DATE 
);

CREATE TABLE Faculty(
faculty_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
foundation_date DATE 
);

CREATE TABLE Group_Student(
group_student_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
foundation_date DATE,
FK_Group_Student_Students INT DEFAULT NULL,
FK_Group_Student_Faculty INT,
FOREIGN KEY (FK_Group_Student_Faculty) REFERENCES Faculty(faculty_id) 
);

CREATE TABLE Address(
address_id INT PRIMARY KEY AUTO_INCREMENT,
city VARCHAR(50),
street VARCHAR(50),
number_house INT,
number_apartament INT);

CREATE TABLE University_Faculty(
FK_University_ID INT,
FK_Faculty_ID INT,
FOREIGN KEY (FK_University_ID) REFERENCES University(university_id),
FOREIGN KEY (FK_Faculty_ID) REFERENCES Faculty(faculty_id),
UNIQUE KEY(FK_University_ID, FK_Faculty_ID));

ALTER TABLE Group_Student ADD FOREIGN KEY (FK_Group_Student_Faculty) REFERENCES Students(students_id);

INSERT INTO Students (first_name, last_name, gender, birth_date, FK_Students_Address, FK_Students_Group_Student)
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

INSERT INTO Group_Student (first_name, foundation_date, FK_Group_Student_Students, FK_Group_Student_Faculty)
VALUES
('Group A', '2021-09-01', 1, NULL),
('Group B', '2021-09-01', 2, NULL),
('Group C', '2021-09-01', 3, NULL),
('Group D', '2021-09-01', 4, NULL),
('Group E', '2021-09-01', 5, NULL);

INSERT INTO Address (city, street, number_house, number_apartament)
VALUES
('New York',      'Broadway',       123, 45),
('San Francisco', 'Main Street',    456, 78),
('Cambridge',     'Harvard Street', 789, 12),
('Berkeley',      'Oak Street',     321, 56),
('Princeton',     'Nassau Street',  654, 34);

SELECT * 
FROM students s  
INNER JOIN group_student gs 
ON s.FK_Students_Group_Student = gs.group_student_id 
INNER JOIN university u 
ON gs.FK_Group_Student_Faculty = u.university_id 
WHERE u.university_id = 'Stanford University';

