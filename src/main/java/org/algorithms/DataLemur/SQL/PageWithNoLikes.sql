SELECT page_id
FROM pages
EXCEPT
SELECT page_id
FROM page_likes;