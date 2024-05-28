SELECT
  u.city,
  COUNT(t.order_id) AS total_orders
FROM users u
INNER JOIN trades t ON t.user_id = u.user_id
WHERE status = 'Completed'
GROUP BY u.city
ORDER BY total_orders DESC
LIMIT 3;