WITH general_footage AS (
  SELECT
    item_type,
    SUM(square_footage) AS total_square_footage,
    COUNT(square_footage) AS count_square
  FROM inventory
  GROUP BY item_type
),
prime_batch AS (
  SELECT
    item_type,
    total_square_footage,
    FLOOR(500000 / total_square_footage) AS prime_item_batch_count,
    (FLOOR(500000 / total_square_footage) * count_square) AS prime_item_count
  FROM general_footage
  WHERE item_type = 'prime_eligible'
)
SELECT
  item_type,
  CASE
    WHEN item_type = 'prime_eligible' THEN (FLOOR(500000/total_square_footage) * count_square)
    WHEN item_type = 'not_prime' THEN FLOOR((500000 - (SELECT FLOOR(500000/total_square_footage) * total_square_footage FROM prime_batch)) / total_square_footage) * count_square
  END AS item_count
FROM general_footage
ORDER BY item_count DESC;