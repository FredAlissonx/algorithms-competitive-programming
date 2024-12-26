# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
cafe_str = ["cafe", "café", "coffee"]
result_df = sf_restaurant_health_violations \
    .withColumn(
        "business_type",
        F.when(F.lower(F.col("business_name")).contains("restaurant"), "restaurant")
        .when(F.lower(F.col("business_name")).rlike("|".join(cafe_str)), "cafe")
        .when(F.lower(F.col("business_name")).contains("school"), "school")
        .otherwise("other")
        ) \
        .select("business_name", "business_type") \
        .distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()