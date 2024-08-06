WITH getDay AS (
  SELECT
    measurement_time::DATE,
    measurement_value,
    ROW_NUMBER() OVER(
    PARTITION BY measurement_time::DATE
    ORDER BY measurement_time
    ) as row_number
  FROM measurements
)
SELECT
  measurement_time AS measurement_day,
  SUM(CASE WHEN row_number % 2 != 0 THEN measurement_value END) AS odd_sum,
  SUM(CASE WHEN row_number % 2 = 0 THEN measurement_value END) AS even_sum
FROM getDay
GROUP BY measurement_time
;