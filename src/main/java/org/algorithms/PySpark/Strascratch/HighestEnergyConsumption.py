# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
meta_energy = fb_eu_energy.union(fb_asia_energy).union(fb_na_energy)

consumption_df = meta_energy \
    .groupBy("date") \
    .agg(
        F.sum("consumption").alias("total_consumption")
    )

max_consumption = consumption_df \
    .agg(
        F.max("total_consumption").alias("max_consumption")
    ).collect()[0]["max_consumption"]

result_df = consumption_df.filter(F.col("total_consumption") == max_consumption)

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()