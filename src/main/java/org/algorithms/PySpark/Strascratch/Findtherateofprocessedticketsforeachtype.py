# Import your libraries
import pyspark
from pyspark.sql import functions as F
# Start writing code
facebook_complaints = facebook_complaints.groupBy("type") \
    .agg(
        (F.count(F.when(F.col("processed"), 1)) / F.count("*")).alias("processed_rate")
    )

# To validate your solution, convert your final pySpark df to a pandas df
facebook_complaints.toPandas()