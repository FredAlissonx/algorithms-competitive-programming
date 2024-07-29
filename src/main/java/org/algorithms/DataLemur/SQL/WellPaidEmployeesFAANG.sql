SELECT
  a.employee_id,
  a.name
FROM
  employee a,
  employee b
WHERE
  a.manager_id = b.employee_id
AND
  a.salary > b.salary;