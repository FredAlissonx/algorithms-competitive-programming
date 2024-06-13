SELECT
  d.employee_id,
  CASE
    WHEN SUM(d.deal_size) > q.quota THEN 'yes'
    ELSE 'no'
  END AS made_quota
FROM deals d
INNER JOIN sales_quotas q ON d.employee_id = q.employee_id
GROUP BY d.employee_id, q.quota
ORDER BY d.employee_id;