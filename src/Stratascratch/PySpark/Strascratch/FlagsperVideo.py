# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
user_name_df = user_flags \
    .filter(F.col("flag_id").isNotNull()) \
    .withColumn(
        "complete_name",
        F.concat_ws(" ", F.col("user_firstname"), F.col("user_lastname"))
    )

result_df = user_name_df \
    .groupBy("video_id") \
    .agg(
        F.countDistinct("complete_name").alias("num_unique_users")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()