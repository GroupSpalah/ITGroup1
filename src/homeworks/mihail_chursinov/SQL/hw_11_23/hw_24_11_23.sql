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

CREATE FUNCTION format_date(d_format VARCHAR(50), m_date DATE) RETURNS VARCHAR (20) READS SQL DATA 
BEGIN
	RETURN DATE_FORMAT (m_date, d_format);
END

SELECT *, format_date ('%d %b %y', s.birth_date) 
FROM students s;

CREATE FUNCTION add_two_years(e_age INT) RETURNS INT DETERMINISTIC
BEGIN
	RETURN (e_age * 3); 
END

SELECT a.number_house FROM address a;
