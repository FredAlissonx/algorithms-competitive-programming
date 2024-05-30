SELECT
  EXTRACT(MONTH FROM submit_date) AS mth,
  product_id,
  ROUND(AVG(stars), 2)AS avg_star
FROM reviews
GROUP BY mth, product_id
ORDER BY mth
