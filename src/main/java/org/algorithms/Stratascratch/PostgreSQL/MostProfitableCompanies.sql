WITH cte AS (
    SELECT
        company,
        profits,
        DENSE_RANK() OVER(ORDER BY profits DESC) AS rk
    FROM forbes_global_2010_2014
)
SELECT
    company,
    profits
FROM cte
WHERE rk <= 3;