SELECT DISTINCT
  salary AS second_highest_salary
FROM employee
ORDER BY salary DESC
OFFSET 1
LIMIT 1