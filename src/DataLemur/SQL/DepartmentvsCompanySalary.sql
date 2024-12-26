WITH compAvg AS (
  SELECT
    AVG(amount) AS avg
  FROM salary
  WHERE payment_date = '03/31/2024 00:00:00'
)
SELECT
  em.department_id,
  TO_CHAR(sa.payment_date, 'MM-YYYY') AS payment_date,
  CASE
    WHEN AVG(sa.amount) > (SELECT avg FROM compAvg) THEN 'higher'
    WHEN AVG(sa.amount) < (SELECT avg FROM compAvg) THEN 'lower'
    ELSE 'same'
  END AS comparison
FROM salary AS sa
INNER JOIN employee AS em ON sa.employee_id = em.employee_id
WHERE sa.payment_date = '03/31/2024 00:00:00'
GROUP BY em.department_id, sa.payment_date
