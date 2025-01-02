SELECT
    hotel_name,
    reviewer_score,
    COUNT(*) AS count
FROM hotel_reviews
GROUP BY hotel_name, reviewer_score
HAVING hotel_name = 'Hotel Arena';