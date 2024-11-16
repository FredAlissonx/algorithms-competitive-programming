-- link to the article: https://medium.com/art-of-data-engineering/can-you-crack-this-sql-query-in-30-minutes-2809c054bc52
WITH salaries AS (
	SELECT
		candidate_id,
		experience,
		salary,
	SUM(salary) OVER(PARTITION BY experience ORDER BY salary ASC) AS roll_over
	FROM candidate
),
seniors AS (
	SELECT
		*
	FROM salaries
	WHERE
		experience = 'Senior'
	AND
		roll_over <= 1000000
),
juniors AS (
	SELECT
		*
	FROM salaries
	WHERE
		experience = 'Junior'
	AND
		roll_over <= (1000000 - (SELECT MAX(roll_over) FROM seniors))
),
unified AS (
	SELECT * FROM seniors
	UNION ALL
	SELECT * FROM juniors
)
SELECT
	*
FROM unified;