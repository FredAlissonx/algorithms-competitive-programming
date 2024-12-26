WITH ranked_salary AS (
  SELECT
    name,
    salary,
    department_id,
    DENSE_RANK() OVER (
      PARTITION BY department_id ORDER BY salary DESC) AS ranking
  FROM employee
)

SELECT
  d.department_name,
  s.name,
  s.salary
FROM ranked_salary AS s
INNER JOIN department AS d
  ON s.department_id = d.department_id
WHERE s.ranking <= 3
ORDER BY d.department_name ASC, s.salary DESC, s.name ASC;