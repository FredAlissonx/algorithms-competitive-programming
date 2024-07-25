WITH cte AS (
  SELECT
    card_name,
    issued_amount,
    DENSE_RANK() OVER(
      PARTITION BY card_name
      ORDER BY issue_year, issue_month
    ) AS rk
  FROM monthly_cards_issued
)
SELECT
  card_name,
  SUM(issued_amount) AS issued_amount
FROM cte
WHERE rk = 1
GROUP BY
  card_name
ORDER BY issued_amount DESC;