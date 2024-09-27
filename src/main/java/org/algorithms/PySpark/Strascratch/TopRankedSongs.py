# Import your libraries
import pyspark
from pyspark.sql import functions as F
# Start writing code
songs_top_rank = spotify_worldwide_daily_song_ranking \
    .groupBy("trackname") \
    .agg(
        F.sum(
            F.when(F.col("position") == 1, 1)
            .otherwise(0)
        ).alias("times_top1")
    ) \
    .filter(F.col("times_top1") != 0) \
    .orderBy(F.col("times_top1").desc())


# To validate your solution, convert your final pySpark df to a pandas df
songs_top_rank.toPandas()