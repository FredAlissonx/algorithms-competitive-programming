WITH numbers AS
(
    SELECT
    *,
    LEAD(num, 1) OVER() AS n1,
    LEAD(num, 2) OVER() AS n2
    FROM logs
)
SELECT
    DISTINCT num AS ConsecutiveNums
FROM numbers
WHERE
    num = n1
    AND
    num = n2;