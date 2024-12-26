SELECT
    score,
    (
    SELECT
        COUNT(DISTINCT score)
    FROM scores
    WHERE score >= s.score
    ) AS `rank`
FROM scores s
ORDER BY score DESC;
