WITH cte AS (
SELECT
  company_id
FROM job_listings
GROUP BY company_id, title, description
HAVING COUNT(*) > 1
)
SELECT
  COUNT(company_id)
FROM cte;