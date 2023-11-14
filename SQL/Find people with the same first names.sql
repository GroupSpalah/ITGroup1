SELECT * FROM 
human h WHERE h.first_name IN(SELECT h2.first_name FROM human h2 GROUP BY first_name HAVING count(*) > 1);

SELECT h2.first_name, COUNT(*)
FROM human h2 
GROUP BY first_name
HAVING count(*) > 1;