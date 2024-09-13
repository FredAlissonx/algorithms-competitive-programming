# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
condition = (F.col("nominee") == "Abigail Breslin")
result_df = oscar_nominees \
    .filter(condition) \
    .agg(F.countDistinct("*"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()