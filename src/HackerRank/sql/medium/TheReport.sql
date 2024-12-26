WITH studentsMarks AS (
    SELECT
        name,
        SUM(marks) AS mark
    FROM students
    GROUP BY name
)
SELECT
    CASE
        WHEN grade < 8 THEN NULL
        ELSE name
    END AS name,
    gd.grade,
    mark
FROM studentsMarks sm
LEFT JOIN grades gd ON sm.mark BETWEEN gd.min_mark AND gd.max_mark
ORDER BY
    gd.grade DESC,
    name
