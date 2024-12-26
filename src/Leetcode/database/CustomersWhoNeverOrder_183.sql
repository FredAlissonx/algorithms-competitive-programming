SELECT
    name AS Customers
FROM customers c
WHERE c.id NOT IN(
    SELECT
        customerId
    FROM orders o
); 