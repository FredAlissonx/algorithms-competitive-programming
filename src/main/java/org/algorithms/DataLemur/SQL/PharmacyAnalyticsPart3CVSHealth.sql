SELECT
  manufacturer,
  CONCAT(
  '$', ROUND(COALESCE(SUM(total_sales) / 1000000), 0), ' ', 'million'
  ) AS sales_mil
FROM pharmacy_sales
GROUP BY manufacturer
ORDER BY
  ROUND(COALESCE(SUM(total_sales) / 1000000), 0) DESC,
  manufacturer DESC;