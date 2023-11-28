CREATE VIEW get_all_students AS SELECT * 
FROM students s;

CREATE VIEW get_all_address AS SELECT *
FROM address a;

SELECT *
FROM get_all_students;

SELECT *
FROM get_all_address gaa;

SELECT first_name, birth_date 
FROM get_all_students gas;

SELECT city, number_house 
FROM get_all_address gaa;

UPDATE get_all_students SET first_name = 'Michael'
WHERE student_id = 2;

UPDATE get_all_address SET city = 'Kyiv'
WHERE address_id = 3;

DELETE 
FROM get_all_students 
WHERE student_id = 10;
