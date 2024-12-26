DELETE p2
FROM
    person p1,
    person p2
WHERE
    p1.email = p2.emai
    AND
    p2.id > p1.id;