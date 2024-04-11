SELECT
    s.stock_name,
    SUM(IF(operation = 'Buy', -price, price)) AS capital_gain_loss
FROM stocks s
GROUP BY s.stock_name;
