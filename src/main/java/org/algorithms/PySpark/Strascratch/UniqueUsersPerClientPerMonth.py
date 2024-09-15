# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = fact_events \
    .groupBy("client_id", F.month("time_id")) \
    .agg(F.countDistinct("user_id"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()