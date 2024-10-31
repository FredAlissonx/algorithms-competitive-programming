# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = forbes_global_2010_2014 \
    .filter(F.col("rank") == 1) \
    .select("company", "continent")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()