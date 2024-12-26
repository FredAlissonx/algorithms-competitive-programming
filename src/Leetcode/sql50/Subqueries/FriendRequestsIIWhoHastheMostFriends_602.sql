WITH cte AS (
    SELECT
        requester_id AS id
    FROM requestaccepted
UNION ALL
    SELECT
        accepter_id AS id
    FROM requestaccepted
)
SELECT
    id,
    COUNT(*) AS num
    FROM cte
    GROUP BY id
    ORDER BY num DESC LIMIT 1;