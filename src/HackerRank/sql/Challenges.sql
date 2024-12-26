WITH countChallenges AS (
    SELECT
        hk.hacker_id,
        hk.name,
        COUNT(ch.challenge_id) AS challenges_count
    FROM hackers hk
    INNER JOIN challenges ch ON ch.hacker_id = hk.hacker_id
    GROUP BY
        hk.hacker_id,
        hk.name
),
studentsChallenges AS (
    SELECT
        challenges_count
    FROM countChallenges
    WHERE challenges_count < (SELECT MAX(challenges_count) FROM countChallenges)
    GROUP BY challenges_count
    HAVING
        COUNT(hacker_id) > 1
)
SELECT
    hacker_id,
    name,
    challenges_count
FROM countChallenges cc
WHERE challenges_count NOT IN (SELECT challenges_count FROM studentsChallenges)
ORDER BY
    challenges_count DESC,
    hacker_id;