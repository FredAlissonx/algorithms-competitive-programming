# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = airbnb_search_details.groupBy("city", "property_type") \
    .agg(
        F.avg("bedrooms").alias("n_bedrooms_avg"),
        F.avg("bathrooms").alias("n_bathrooms_avg")
        )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()