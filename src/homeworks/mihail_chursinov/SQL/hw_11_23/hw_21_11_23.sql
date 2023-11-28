CREATE PROCEDURE get_all_students_same_university(IN university_name VARCHAR(50))
BEGIN
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
WHERE u.name = university_name;
END;

CALL get_all_students_same_university('Harvard University');

CREATE PROCEDURE get_all_students_same_univ_facul(IN university_name VARCHAR(50), faculty_name VARCHAR(50)) 
BEGIN
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
WHERE u.name = university_name 
AND f.name = faculty_name;
END;

CALL get_all_students_same_univ_facul('Stanford University', 'Business');

CREATE PROCEDURE get_all_students_same_un_fac_gr(IN university_name VARCHAR(50), faculty_name VARCHAR(50),
group_student_name VARCHAR(50))
BEGIN
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
WHERE u.name = university_name 
AND f.name = faculty_name 
AND gs.name = group_student_name;
END;

CALL get_all_students_same_un_fac_gr('Massachusetts Institute of Technology', 'Computer Science', 'Group C');

