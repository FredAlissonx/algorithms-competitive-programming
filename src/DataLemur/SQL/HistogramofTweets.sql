WITH cte AS (
  SELECT
    user_id,
    COUNT(*) AS count
  FROM tweets
  WHERE EXTRACT(YEAR FROM tweet_date) = 2022
  GROUP BY user_id
)
SELECT
  count AS tweet_bucket,
  COUNT(user_id) AS users_num
FROM cte
GROUP BY count;