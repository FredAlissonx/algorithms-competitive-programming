# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
window_spec: Window = Window.orderBy(F.col("salary").desc())
result_df = employee \
    .withColumn(
        "rank",
        F.rank().over(window_spec)
    ) \
    .filter(F.col("rank") == 2) \
    .select("salary")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()