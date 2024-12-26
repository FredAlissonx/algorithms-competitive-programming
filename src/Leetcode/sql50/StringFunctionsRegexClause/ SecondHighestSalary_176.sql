SELECT
    CASE
        WHEN COUNT(*) <= 1 THEN NULL
        ELSE (
            SELECT
                salary
            FROM
                employee
            GROUP BY salary
            ORDER BY salary DESC
            LIMIT 1, 1
        )
    END AS SecondHighestSalary
FROM
    employee;
