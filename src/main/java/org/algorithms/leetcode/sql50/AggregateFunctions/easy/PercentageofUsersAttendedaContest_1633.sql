SELECT
   contest_id,
    ROUND(
        COUNT(r.user_id) /
        (
            SELECT
                COUNT(user_id)
            FROM
                users
        ) * 100, 2) AS percentage
FROM
    register r
INNER JOIN users u ON u.user_id = r.user_id
GROUP BY contest_id
ORDER BY percentage DESC, contest_id;