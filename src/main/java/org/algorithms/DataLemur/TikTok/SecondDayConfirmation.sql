SELECT
  e.user_id
FROM emails e
INNER JOIN texts t ON t.email_id = e.email_id
WHERE
  EXTRACT(DAY FROM signup_date) + 1 = EXTRACT(DAY FROM action_date)
  AND
  signup_action = 'Confirmed'


