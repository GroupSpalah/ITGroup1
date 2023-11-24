CREATE VIEW get_all_employee AS SELECT * FROM employee e;

SELECT * FROM get_all_employee gae;

SELECT emp_id, name FROM get_all_employee gae;

UPDATE get_all_employee SET name = 'John' WHERE emp_id = 101;

DELETE FROM get_all_employee WHERE emp_id = 101;

/*
 * item 	price 	count		sum
 * 
 * phone     15      10         150
 * */

