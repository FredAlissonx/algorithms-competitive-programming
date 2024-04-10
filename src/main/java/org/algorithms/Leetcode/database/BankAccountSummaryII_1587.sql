SELECT
    name,
    SUM(amount) AS balance
FROM users u
INNER JOIN transactions t ON t.account = u.account
GROUP BY t.account
HAVING balance > 10000;
