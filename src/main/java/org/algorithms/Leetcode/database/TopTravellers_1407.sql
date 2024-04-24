SELECT
    (SELECT name FROM users WHERE id = u.id) AS name,
    IFNULL(SUM(distance), 0) AS travelled_distance
FROM users u
LEFT JOIN rides r ON r.user_id = u.id
GROUP BY u.id
ORDER BY travelled_distance DESC, u.name;
