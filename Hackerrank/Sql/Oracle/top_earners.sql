SELECT MAX(months * salary), COUNT(*)
FROM EMPLOYEE
WHERE (months * salary) = (
    SELECT MAX(months * salary) 
    FROM EMPLOYEE
);