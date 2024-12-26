WITH cte AS (
    SELECT
        departmentId,
        MAX(salary) AS maxSalary
    FROM employee
    GROUP BY departmentId
)
SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary
FROM employee e
INNER JOIN department d ON d.id = e.departmentId
WHERE (e.departmentId, e.salary) IN (SELECT * FROM cte);

