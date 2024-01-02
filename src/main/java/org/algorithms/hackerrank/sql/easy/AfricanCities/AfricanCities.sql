SELECT
    CITY.NAME
FROM
    CITY
JOIN
    COUNTRY ON COUNTRY.CODE = CITY.COUNTRYCODE
WHERE
    COUNTRY.CONTINENT = 'Africa';