SELECT
    user_id AS buyer_id,
    join_date,
    COUNT(order_id) AS orders_in_2019
FROM Users
LEFT JOIN Orders ON user_id = buyer_id AND YEAR(order_date) = 2019
GROUP BY user_id;