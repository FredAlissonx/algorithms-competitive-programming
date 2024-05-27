WITH cte AS (
  SELECT
    app_id,
    SUM(CASE WHEN event_type = 'impression' THEN 1 END) AS impression,
    SUM(CASE WHEN event_type = 'click' THEN 1 END) AS click
  FROM events
  WHERE EXTRACT(YEAR FROM timestamp) = 2022
  GROUP BY app_id
)
SELECT
 app_id,
 ROUND(click * 100.0 / impression, 2) AS ctr
FROM cte;