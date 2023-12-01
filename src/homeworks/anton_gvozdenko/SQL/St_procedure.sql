CREATE PROCEDURE get_student_by_university()
BEGIN
	SELECT * FROM student s 
INNER JOIN group_student gs 
ON s.FK_student_group = gs.group_id 
INNER JOIN faculty f 
ON gs.FK_group_faculty_id = f.faculty_id 
INNER JOIN university_faculty uf 
ON uf.FK_faculty_id = f.faculty_id 
INNER JOIN university u 
ON uf.FK_university_id = u.university_id 
WHERE u.name = 'DNU';
END;
CALL get_student_by_university();

CREATE PROCEDURE get_student_by_university_faculty()
BEGIN
	SELECT * FROM student s 
INNER JOIN group_student gs 
ON s.FK_student_group = gs.group_id 
INNER JOIN faculty f 
ON gs.FK_group_faculty_id = f.faculty_id 
INNER JOIN university_faculty uf 
ON uf.FK_faculty_id = f.faculty_id 
INNER JOIN university u 
ON uf.FK_university_id = u.university_id 
WHERE u.name = 'DNU'
AND f.name = 'Math';
END;
CALL get_student_by_university_faculty();

CREATE PROCEDURE get_student_by_university_faculty_group()
BEGIN
SELECT * FROM student s 
INNER JOIN group_student gs 
ON s.FK_student_group = gs.group_id 
INNER JOIN faculty f 
ON gs.FK_group_faculty_id = f.faculty_id 
INNER JOIN university_faculty uf 
ON uf.FK_faculty_id = f.faculty_id 
INNER JOIN university u 
ON uf.FK_university_id = u.university_id 
WHERE u.name = 'Agrarniy'
AND f.name = 'Managementu'
AND gs.name = 'Management';
END;
CALL get_student_by_university_faculty_group();

CREATE PROCEDURE get_date_format()
BEGIN 
	SELECT  s.name,s.last_name
DATE_FORMAT(birthday, '%d %b %y')
FROM student s;
END;
CALL  get_date_format();
