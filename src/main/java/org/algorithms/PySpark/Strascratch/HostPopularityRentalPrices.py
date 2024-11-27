# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
host_df = airbnb_host_searches \
    .select(
        F.col("price"),
        F.col("number_of_reviews"),
        F.concat(
            F.col("price"), F.col("room_type"), F.col("host_since"), F.col("zipcode"),
            F.col("number_of_reviews")
            )
        ) \
        .distinct()

classified_df = host_df \
    .withColumn(
        "host_popularity",
        F.when(F.col("number_of_reviews") == 0, "New") \
        .when(F.col("number_of_reviews").between(1, 5), "Rising") \
        .when(F.col("number_of_reviews").between(6, 15), "Trending Up") \
        .when(F.col("number_of_reviews").between(16, 40), "Popular") \
        .when(F.col("number_of_reviews") > 40, "Hot")
    )

result_df = classified_df \
    .groupBy("host_popularity") \
    .agg(
        F.min("price").alias("min_price"),
        F.round(F.avg("price"),scale=2).alias("avg_price"),
        F.max("price").alias("max_price")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()