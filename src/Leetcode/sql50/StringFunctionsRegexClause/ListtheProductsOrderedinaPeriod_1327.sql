SELECT
    p.product_name,
    SUM(o.unit) AS unit
FROM
    products p
INNER JOIN
    orders o ON o.product_id = p.product_id
WHERE
    DATE_FORMAT(o.order_date, '%Y-%m') = '2020-02'
GROUP BY
    p.product_name
HAVING
    unit >= 100;
