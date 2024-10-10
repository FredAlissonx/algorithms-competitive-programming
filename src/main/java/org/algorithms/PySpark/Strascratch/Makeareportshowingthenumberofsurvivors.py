# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = titanic \
    .groupBy("survived") \
    .agg(
        F.sum(F.when(F.col("pclass") == 1, 1)).alias("first_class"),
        F.sum(F.when(F.col("pclass") == 2, 1)).alias("second_class"),
        F.sum(F.when(F.col("pclass") == 3, 1)).alias("third_class")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()