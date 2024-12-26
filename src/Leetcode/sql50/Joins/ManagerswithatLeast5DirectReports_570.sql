SELECT b.name
FROM
    Employee a,
    Employee b
WHERE a.managerId IS NOT NULL AND b.id = a.managerId
GROUP BY a.managerId
HAVING COUNT(*) >= 5;