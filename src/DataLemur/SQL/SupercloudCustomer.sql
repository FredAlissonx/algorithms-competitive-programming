WITH customers AS (
  SELECT
    cc.customer_id,
    COUNT(DISTINCT p.product_category) AS product_count
  FROM customer_contracts cc
  INNER JOIN products p ON p.product_id = cc.product_id
  GROUP BY customer_id
)
SELECT
  customer_id
FROM customers
WHERE product_count = (SELECT COUNT(DISTINCT product_category) FROM products)