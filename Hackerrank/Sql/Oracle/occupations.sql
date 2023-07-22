-- https://www.hackerrank.com/challenges/occupations/problem
SELECT
    MAX(CASE WHEN OCCUPATION = 'Doctor' THEN NAME END) AS Doctor,
    MAX(CASE WHEN OCCUPATION = 'Professor' THEN NAME END) AS Professor,
    MAX(CASE WHEN OCCUPATION = 'Singer' THEN NAME END) AS Singer,
    MAX(CASE WHEN OCCUPATION = 'Actor' THEN NAME END) AS Actor
FROM (
    SELECT
        NAME,
        OCCUPATION,
        ROW_NUMBER() OVER (PARTITION BY OCCUPATION ORDER BY NAME) AS rn
    FROM
        OCCUPATIONS
)
GROUP BY
    rn
ORDER BY
    rn;