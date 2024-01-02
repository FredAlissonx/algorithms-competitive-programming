SELECT
    unique_id,
    name
FROM
    employees
LEFT JOIN employeeUNI ON employees.id = employeeUNI.id;