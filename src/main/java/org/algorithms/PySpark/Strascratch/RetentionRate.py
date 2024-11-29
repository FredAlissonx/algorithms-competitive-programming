# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
df = sf_events \
    .groupBy("account_id", "user_id") \
    .agg(
        F.date_format(F.max("date"), "yyyy-MM").alias("last_date")
        ) \
    .withColumn(
        "dec",
        F.when(F.col("last_date") > "2020-12", 1).otherwise(0)
        ) \
    .withColumn(
        "jan",
        F.when(F.col("last_date") > "2021-01", 1).otherwise(0)
        )

result_df = df \
    .groupBy("account_id") \
    .agg(
        F.round(F.sum("jan")/F.sum("dec")).alias("retention")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()