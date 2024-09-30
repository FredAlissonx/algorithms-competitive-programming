# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
march_order = orders \
    .filter(F.col("order_date").between("2019-03-01", "2019-03-31"))

result_df = march_order \
    .groupBy("cust_id") \
    .agg(
        F.sum(F.col("total_order_cost")).alias("revenue")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()