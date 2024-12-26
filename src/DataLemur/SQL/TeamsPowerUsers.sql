SELECT
  sender_id,
  COUNT(*) AS message_count
FROM messages
WHERE
  DATE_PART('year', sent_date) = '2022'
AND
  DATE_PART('month', sent_date) = '08'
GROUP BY sender_id
ORDER BY message_count DESC
LIMIT 2
