WITH nextTransaction AS (
  SELECT
    merchant_id,
    credit_card_id,
    amount,
    transaction_timestamp,
    LEAD(transaction_timestamp) OVER(
      PARTITION BY
        merchant_id,
        credit_card_id,
        amount
      ORDER BY transaction_timestamp
    ) AS next_timestamp
  FROM transactions
)
SELECT
  SUM(
    CASE
      WHEN EXTRACT(MINUTE FROM (next_timestamp - transaction_timestamp)) <= 10 THEN 1
      ELSE 0
    END
  ) AS payment_count
FROM nextTransaction
WHERE
  next_timestamp IS NOT NULL
AND
  DATE_TRUNC('hour', transaction_timestamp) = DATE_TRUNC('hour', next_timestamp);