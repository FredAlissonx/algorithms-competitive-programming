# Import your libraries
import pyspark
from pyspark.sql import DataFrame
from pyspark.sql import functions as F

# Start writing code
olympics_athletes_events: DataFrame = olympics_athletes_events.groupBy("games") \
    .agg(F.countDistinct("id").alias("athletes_count")) \
    .orderBy(F.col("athletes_count").desc()) \
    .limit(1)

# To validate your solution, convert your final pySpark df to a pandas df
olympics_athletes_events.toPandas()