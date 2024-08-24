# Import your libraries
import pyspark
from pyspark.sql.functions import col, sum, dense_rank, desc
from pyspark.sql.window import Window

# Start writing code
window_spec: Window = Window.orderBy(col("cool").desc())

cols = ["business_name", "review_text"]
cool_reviews = yelp_reviews.withColumn(
        "rank",
        dense_rank().over(window_spec)
        ) \
        .filter(col("rank") == 1) \
        .select(*cols)

# To validate your solution, convert your final pySpark df to a pandas df
cool_reviews.toPandas()