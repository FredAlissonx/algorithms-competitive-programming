WITH statusCall AS (
  SELECT
    SUM(
      CASE
        WHEN call_category = 'n/a' THEN 1
        WHEN call_category IS NULL THEN 1
      END
    ) AS count_uncategorized,
    COUNT(*) AS total_calls
  FROM callers ca
)
SELECT
  ROUND(count_uncategorized::NUMERIC / total_calls * 100, 1) AS uncategorised_call_pct
FROM statusCall;