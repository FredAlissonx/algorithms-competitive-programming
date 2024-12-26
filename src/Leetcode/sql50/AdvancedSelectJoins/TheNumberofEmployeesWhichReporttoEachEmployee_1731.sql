SELECT
    e1.employee_id,
    e1.name,
    COUNT(e2.reports_to) AS reports_count,
    ROUND(AVG(e2.age)) AS average_age
FROM
    employees e1
INNER JOIN employees e2 ON e1.employee_id = e2.reports_to
GROUP BY e2.reports_to
ORDER BY e1.employee_id;
