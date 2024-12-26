WITH cte AS (
    SELECT employee_id FROM employees WHERE employee_id NOT IN (SELECT employee_id FROM salaries)
    UNION ALL
    SELECT employee_id FROM salaries WHERE employee_id NOT IN (SELECT employee_id FROM employees)
)
SELECT employee_id FROM cte ORDER BY employee_id ASC;