SELECT DISTINCT
    fr.post_id,
    fr.poster,
    fp.post_text,
    fp.post_keywords,
    fp.post_date
FROM facebook_reactions fr
INNER JOIN facebook_posts fp ON fp.post_id = fr.post_id
AND fr.reaction = 'heart';