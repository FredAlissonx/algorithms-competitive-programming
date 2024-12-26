SELECT
    s.user_id,
    ROUND(AVG(IF(c.action = 'confirmed', 1, 0)), 2) AS confirmation_rate
FROM
    signups s
LEFT JOIN confirmations c ON c.user_id = s.user_id
GROUP BY s.user_id;