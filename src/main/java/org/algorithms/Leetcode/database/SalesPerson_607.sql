SELECT
   s.name
FROM
    salesperson s
WHERE s.sales_id NOT IN (
    SELECT
        o.sales_id
    FROM orders o
    INNER JOIN company c ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);