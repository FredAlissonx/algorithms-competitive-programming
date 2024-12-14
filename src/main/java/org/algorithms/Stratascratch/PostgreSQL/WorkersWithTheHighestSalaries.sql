WITH ranked AS (
    SELECT
        worker_title,
        DENSE_RANK() OVER(ORDER BY salary DESC) AS rank_sal
    FROM worker w
    INNER JOIN title t ON t.worker_ref_id = w.worker_id
)
SELECT
    worker_title AS best_paid_title
FROM ranked
WHERE rank_sal = 1;