CREATE PROCEDURE get_all_students_same_university(university_name VARCHAR(30))
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
WHERE u.name = 'Harvard University';
END;

CALL get_all_students_same_university();

CREATE PROCEDURE get_all_students_same_univ_facul() 
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
WHERE u.name = 'Massachusetts Institute of Technology' 
AND f.name = 'Computer Science';
END;

CALL get_all_students_same_univ_facul();

CREATE PROCEDURE get_all_students_same_un_fac_gr()
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
WHERE u.name = 'Stanford University' 
AND f.name = 'Business' 
AND gs.name = 'Group B';
END;

CALL get_all_students_same_un_fac_gr();

