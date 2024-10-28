# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = playbook_events \
    .filter(F.lower(F.col("device")) == "macbook pro") \
    .groupBy("event_name") \
    .agg(
        F.count("*").alias("event_count")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()