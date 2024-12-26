WITH cumSum AS (
  SELECT
    searches,
    num_users,
    SUM(num_users) OVER (ORDER BY searches) AS cum_sum_users,
    SUM(num_users) OVER () AS total_users
  FROM search_frequency
),
medianPoint AS (
  SELECT
    searches,
    cum_sum_users,
    total_users,
    CASE
      WHEN cum_sum_users >= total_users / 2.0 THEN 1
      ELSE 0
    END AS is_equal_or_bigger
  FROM cumSum
)
SELECT
  ROUND(
    CASE
      WHEN total_users % 2 != 0 THEN
        (SELECT MIN(searches) FROM medianPoint WHERE is_equal_or_bigger = 1)
      ELSE
        (SELECT AVG(searches) FROM (
          SELECT searches FROM medianPoint WHERE is_equal_or_bigger = 1 ORDER BY searches LIMIT 2
        ) AS temp)
    END, 1
  ) AS median
FROM medianPoint
LIMIT 1;
