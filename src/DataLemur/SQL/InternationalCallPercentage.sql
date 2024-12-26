WITH callers AS (
  SELECT
    pc.caller_id,
    pc.receiver_id,
    pi.country_id AS caller_country,
    pio.country_id AS receiver_country
  FROM phone_calls pc
  INNER JOIN
    phone_info pi ON pi.caller_id = pc.caller_id
  INNER JOIN
    phone_info pio ON pio.caller_id = pc.receiver_id
)
SELECT
  ROUND(
    COUNT(*)::NUMERIC / (
      SELECT COUNT(*) FROM callers
      )::NUMERIC * 100,
    1) AS international_calls_pct
FROM callers ca
WHERE caller_country != receiver_country