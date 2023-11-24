CREATE PROCEDURE get_all_students()
BEGIN
	SELECT * FROM students;
END;

CALL get_all_students();

CREATE PROCEDURE get_student_by_id_in(IN s_id INT)
BEGIN
	SET s_id = 4;
	SELECT * FROM students WHERE student_id = s_id;
END;

CREATE PROCEDURE get_student_by_id_out(OUT s_id INT)
BEGIN
	SET s_id = 5;
	SELECT * FROM students WHERE student_id = s_id;
END;

CREATE PROCEDURE get_student_by_id_in_out(INOUT s_id INT)
BEGIN
	SET s_id = 5;
	SELECT * FROM students WHERE student_id = s_id;
END;

SET @sid = 3;

SELECT @sid;

CALL get_student_by_id_in_out(@sid);

/*Parameters passing in stored procedure
	An IN parameter passes a value into a procedure. 
	The procedure might modify the value, but the modification is not visible to the caller 
	when the procedure returns. 
	
	An OUT parameter passes a value from the procedure back to 
	the caller. Its initial value is NULL within the procedure, and its value is visible to 
	the caller when the procedure returns.

	An INOUT parameter is initialized by the caller, 
	can be modified by the procedure, and any change made by the procedure is visible to the 
	caller when the procedure returns.
*/