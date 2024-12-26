WITH cte AS (
    SELECT
        t.request_at AS day,
        SUM(
            CASE
                WHEN t.status LIKE '%cancelled%' THEN 1
                ELSE 0
            END
        ) AS cancelled_count,
        COUNT(*) total_count
    FROM trips t
    INNER JOIN users u ON t.client_id = u.users_id AND u.banned = 'No'
    INNER JOIN users us ON us.users_id = t.driver_id AND us.banned = 'No'
    WHERE
        t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
    GROUP BY t.request_at
)
SELECT
    Day,
    ROUND(cancelled_count / total_count, 2) AS 'Cancellation Rate'
FROM cte