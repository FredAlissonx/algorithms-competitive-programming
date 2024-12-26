SELECT
    ws.id,
    wp.age,
    ws.coins_needed,
    ws.power
FROM wands ws
INNER JOIN wands_property wp ON wp.code = ws.code
INNER JOIN (
    SELECT
        wp.age,
        ws.power,
        MIN(ws.coins_needed) AS min
    FROM wands ws
    INNER JOIN wands_property wp ON wp.code = ws.code
    AND wp.is_evil = 0
    GROUP BY
        wp.age,
        ws.power
) min_coins ON min_coins.age = wp.age AND ws.power = min_coins.power AND min_coins.min  = ws.coins_needed
ORDER BY
    ws.power DESC,
    wp.age DESC;