# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
result_df = airbnb_search_details \
    .groupBy("city") \
    .agg(
        F.count("amenities").alias("qtd")
    ) \
    .sort(F.desc("qtd")) \
    .limit(1) \
    .select("city")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()