WITH times AS (
  SELECT
    b.age_bucket,
    SUM(CASE WHEN a.activity_type IN ('send', 'open') THEN a.time_spent END) AS total_time,
    SUM(CASE WHEN a.activity_type = 'send' THEN a.time_spent END) AS send_time,
    SUM(CASE WHEN a.activity_type = 'open' THEN a.time_spent END) AS open_time
  FROM activities a
  INNER JOIN age_breakdown b ON b.user_id = a.user_id
  GROUP BY b.age_bucket
)

SELECT
  age_bucket,
  ROUND(send_time / total_time * 100.0, 2) AS send_perc,
  ROUND(open_time / total_time * 100.0, 2) AS open_perc
FROM times;
