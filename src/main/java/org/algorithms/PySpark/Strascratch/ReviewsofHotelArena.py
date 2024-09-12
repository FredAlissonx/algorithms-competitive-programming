# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
window_spec = Window.partitionBy("reviewer_score")
hotel_arena_reviews = hotel_reviews \
    .filter(F.col("hotel_name") == "Hotel Arena") \
    .select(
        "reviewer_score",
        "hotel_name",
        F.count("*").over(window_spec).alias("n_reviews")
    ).distinct()

# To validate your solution, convert your final pySpark df to a pandas df
hotel_arena_reviews.toPandas()