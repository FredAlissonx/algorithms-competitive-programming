# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code

year_2010_df = billboard_top_100_year_end.filter(F.col("year") == 2010)
result_df = year_2010_df \
    .select(
        "year_rank",
        "group_name",
        "song_name"
    ) \
    .dropDuplicates() \
    .orderBy("year_rank") \
    .limit(10)

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()