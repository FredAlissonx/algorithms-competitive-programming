# Import your libraries
from pyspark.sql.functions import split, explode, sum, col
# Start writing code
split_col = split(yelp_business["categories"], ";")
exploded_df = yelp_business.withColumn("category", explode(split_col))

result_final_df = exploded_df.groupBy("category") \
    .agg(
        sum(col("review_count")).alias("total_reviews")
        ) \
    .orderBy(col("total_reviews").desc())
# To validate your solution, convert your final pySpark df to a pandas df
result_final_df.toPandas()