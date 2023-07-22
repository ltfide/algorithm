-- https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true
SELECT MAX(months * salary), COUNT(*)
FROM EMPLOYEE
WHERE (months * salary) = (
    SELECT MAX(months * salary) 
    FROM EMPLOYEE
);