# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
worker_df = worker.filter(F.month(F.col("joining_date")) >= 4)
result_df = worker_df.groupBy(F.col("department")) \
    .agg(
            F.count("*").alias("num_workers")
        )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()