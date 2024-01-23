SELECT
    e1.name AS Employee
FROM
    employee e1,
    employee e2
WHERE
    e1.managerId = e2.id
    AND
    e1.salary > e2.salary;