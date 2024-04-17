SELECT
    p.product_id,
    p.product_name
FROM product p
INNER JOIN sales s ON s.product_id = p.product_id
GROUP BY p.product_id
HAVING SUM(sale_date < '2019-01-01' OR s.sale_date > '2019-03-31') = 0;
