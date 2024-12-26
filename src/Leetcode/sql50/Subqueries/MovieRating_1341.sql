(
    SELECT
    u.name AS results
    FROM users u
    INNER JOIN movierating m ON m.user_id = u.user_id
    GROUP BY u.name
    ORDER BY COUNT(u.name) DESC, u.name
    LIMIT 1
)
UNION ALL
(
    SELECT
        m.title AS results
    FROM movies m
    INNER JOIN movierating mr ON mr.movie_id = m.movie_id
    WHERE DATE_FORMAT(mr.created_at, '%Y-%m') = '2020-02'
    GROUP BY m.title
    ORDER BY AVG(mr.rating) DESC, m.title
    LIMIT 1
);