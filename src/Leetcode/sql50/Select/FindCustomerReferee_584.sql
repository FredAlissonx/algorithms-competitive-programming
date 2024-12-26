SELECT
    name
FROM
    customer
WHERE
    referee_id <> 2
    ||
    referee_id IS NULL;