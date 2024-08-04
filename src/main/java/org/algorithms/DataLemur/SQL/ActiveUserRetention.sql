WITH activeUsersJuly AS (
  SELECT DISTINCT
    user_id,
    DATE_PART('month', event_date) AS month
  FROM user_actions ua
  WHERE DATE_PART('month', event_date) IN (6, 7)
)
SELECT
  b.month,
  COUNT(b.user_id) AS monthly_active_users
FROM
  activeUsers a,
  activeUsers b
WHERE
  a.user_id = b.user_id
AND
  a.month + 1 = b.month
GROUP BY b.month;