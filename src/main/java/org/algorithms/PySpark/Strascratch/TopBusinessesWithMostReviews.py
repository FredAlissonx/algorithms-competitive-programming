# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = yelp_business.select("name", "review_count") \
    .orderBy(F.col("review_count").desc()) \
    .limit(5)

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()