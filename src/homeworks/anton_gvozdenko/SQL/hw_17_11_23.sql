CREATE DATABASE University_office;
USE University_office;

CREATE TABLE University (
    university_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    date_creation DATE
);

ALTER TABLE University AUTO_INCREMENT = 1;


CREATE TABLE Faculty (
    faculty_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date_creation DATE
);
ALTER  TABLE Faculty  AUTO_INCREMENT = 1;

 CREATE TABLE Address (
    address_id INT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    house_number INT NOT NULL,
    apartment_number INT
);

ALTER TABLE Address AUTO_INCREMENT = 1;
  
CREATE TABLE Group_student (
    group_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(40),
    date_creation DATE,
    FK_head_man_student INT,
  FK_group_faculty_id INT,
    FOREIGN KEY  (FK_head_man_student)REFERENCES Student(student_id),
    FOREIGN KEY (FK_group_faculty_id) REFERENCES Faculty(faculty_id));
);

ALTER  TABLE  Group_student ADD FOREIGN KEY (FK_head_man_student) REFERENCES Student(student_id);

ALTER TABLE Group_Student AUTO_INCREMENT = 1;

CREATE TABLE Student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    last_name VARCHAR(30),
    age INT,
    Sex VARCHAR(10),
    birthday DATE,
 FK_student_address_id INT,
   FK_student_group INT,
    FOREIGN KEY (FK_student_address_id) REFERENCES Address(address_id),
    FOREIGN KEY (FK_student_group) REFERENCES Group_student(group_id));
   
   ALTER  TABLE Student AUTO_INCREMENT = 1;
   CREATE  TABLE University_Faculty(
   FK_university_id,
   FK_faculty_id,
   FOREIGN KEY (FK_university_id) REFERENCES University( university_id),
   FOREIGN KEY (FK_faculty_id) REFERENCES Faculty(faculty_id),
   UNIQUE KEY (FK_university_id,FK_faculty_id));
  
  
  INSERT INTO Student(name,last_name,age,Sex,birthday,FK_student_address_id,FK_student_group)
  VALUES
  ('John','Bush',22,'MAN','2000-01-01',1,1),
  ('Ben','Tramp',21,'MAN','2001-02-02',2,2),
  ('Serg','Ronaldo',23,'MAN','2000-03-03',3,3),
  ('Ivan','Turner',25,'MAN','2004-05-05',4,4),
  ('Anthony','Taylor',20,'MAN','2010-01-01',5,5),
  ('John','Taylor',26,'MAN','2000-06-06',6,6),
  ('Ivan','Bush',22,'MAN','2000-01-01',7,7),
  ('Andrew','Bush',25,'MAN','2000-08-08',8,8),
  ('Petr','Bush',21,'MAN','2005-01-01',9,9),
  ('John','Bush',20,'MAN','2007-07-07',10,10),
  ('Steven','Bush',22,'MAN','2001-09-09',11,11),
  ('Vasyl','Bush',22,'MAN','2000-12-12',12,12),
  ('Nicolo','Bush',23,'MAN','2003-01-01',13,13),
  ('John','Bush',22,'MAN','2000-11-11',14,14);
    
  
  INSERT INTO address (city,street,house_number,apartment_number)
  VALUES
  ('Lviv','Peremohy',1,2),
  ('Odessa','Molodizhna',22,3),
  ('Kiev','Naberezhna',4,4);
  
 INSERT INTO Group_student(name,date_creation,FK_head_man_student,FK_group_faculty_id)
 VALUES
 ('FIT','1999-09-11',1,1),
 ('ET','1990-09-11',2,2),
 ('Management','1995-09-11',3,3);


INSERT INTO University(name,date_creation)
VALUES
('DNU','1990-09-01'),
('Agrarniy','1970-01-01'),
('Horniy','1980-09-01');

INSERT INTO Faculty(name,date_creation)
VALUES 
('Infornaciynih Tahnologiy','2000-02-22'),
('Managementu','2001-03-22'),
('Math','1900-02-22');






 