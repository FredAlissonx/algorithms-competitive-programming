# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
lucrative_prd = online_orders \
    .filter(F.col("date").between("2022-01-01", "2022-06-30")) \
    .withColumn("revenue", F.col("cost_in_dollars") * F.col("units_sold")) \
    .groupBy("product_id") \
    .agg(
        F.sum(F.col("revenue")).alias("total")
        ) \
    .orderBy(F.col("total").desc()) \
    .limit(5)


# To validate your solution, convert your final pySpark df to a pandas df
lucrative_prd.toPandas()