SELECT
  sender_id,
  COUNT(message_id) AS message_count
FROM messages
WHERE
  TO_CHAR(sent_date, 'YYYY-MM') = '2022-08'
GROUP BY sender_id
ORDER BY message_count DESC
LIMIT 2;