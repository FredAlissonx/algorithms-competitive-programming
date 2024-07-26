WITH mostRecentTransaction AS (
  SELECT
    MAX(transaction_date) AS recent_date,
    user_id
  FROM user_transactions
  GROUP BY user_id
)
SELECT
  ut.transaction_date,
  ut.user_id,
  COUNT(ut.spend) AS purchase_count
FROM user_transactions ut
WHERE (ut.transaction_date, ut.user_id) IN (
  SELECT recent_date, user_id FROM mostRecentTransaction
  )
GROUP BY
  transaction_date,
  user_id
ORDER BY ut.transaction_date;