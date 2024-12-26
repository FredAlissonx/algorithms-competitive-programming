# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = spotify_worldwide_daily_song_ranking \
    .groupBy("artist") \
    .agg(
        F.count("id").alias("n_occurences")
    ) \
    .sort(F.desc("n_occurences"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()