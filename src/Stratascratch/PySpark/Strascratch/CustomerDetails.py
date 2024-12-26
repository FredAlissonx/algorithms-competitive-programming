# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
cols = ["first_name", "last_name", "city", "order_details"]
result_df = customers.join(
    other=orders,
    on=customers["id"] == orders["cust_id"],
    how="left"
    ) \
    .select(*cols) \
    .orderBy(F.col("first_name"), F.col("order_details"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()