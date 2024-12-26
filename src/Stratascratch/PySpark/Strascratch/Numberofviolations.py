# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
sf_restaurant_health_violations = sf_restaurant_health_violations \
    .drop_duplicates() \
    .filter(F.col("business_name") == "Roxanne Cafe") \
    .withColumn(
        "year",
        F.year(F.col("inspection_date"))
    ) \
    .select(
            "year",
            "violation_id"
        )

result_df = sf_restaurant_health_violations.groupBy("year") \
    .agg(
        F.count(F.col("violation_id")).alias("violation_count")
    )

result_df.show()
# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()