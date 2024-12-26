WITH uniqueQueriesCTE AS (
  SELECT
    e.employee_id,
    COUNT(q.query_id) AS unique_queries
  FROM employees e
  LEFT JOIN queries q
    ON q.employee_id = e.employee_id
    AND q.query_starttime >= '2023-07-01T00:00:00Z'
    AND q.query_starttime < '2023-10-01T00:00:00Z'
  GROUP BY e.employee_id
)
SELECT
  uq.unique_queries,
  COUNT(uq.employee_id) AS employee_count
FROM uniqueQueriesCTE uq
GROUP BY uq.unique_queries
ORDER BY uq.unique_queries;