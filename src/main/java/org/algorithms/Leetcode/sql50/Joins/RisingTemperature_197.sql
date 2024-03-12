SELECT
    a.id
FROM
    weather a,
    weather b
WHERE
    DATEDIFF(a.recordDAte, b.recordDAte) = 1
    AND
    a.temperature > b.temperature;