WITH cte AS (
SELECT
  policy_holder_id
FROM callers
GROUP BY policy_holder_id
HAVING
  COUNT(*) >= 3
)
SELECT
  COUNT(policy_holder_id) AS policy_holder_count
FROM cte;