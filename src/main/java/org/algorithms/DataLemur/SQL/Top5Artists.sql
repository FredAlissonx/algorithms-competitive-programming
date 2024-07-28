WITH songsArtists AS (
  SELECT
    a.artist_name,
    DENSE_RANK() OVER(
      ORDER BY COUNT(s.song_id) DESC
    ) AS artist_rank
  FROM artists a
  INNER JOIN songs s ON s.artist_id = a.artist_id
  INNER JOIN global_song_rank gsr ON s.song_id = gsr.song_id
  AND gsr.rank <= 10 
  GROUP BY
    a.artist_name
)
SELECT
  artist_name,
  artist_rank
FROM songsArtists
WHERE artist_rank <= 5
ORDER BY artist_rank;