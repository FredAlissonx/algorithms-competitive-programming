# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
orders_gap = orders \
    .filter(F.col("order_date").between("2019-02-01", "2019-05-01")) \
    .select("cust_id", "order_date", "total_order_cost")

joined_df = customers \
    .select("id", "first_name") \
    .join(
        F.broadcast(orders_gap),
        customers["id"] == orders_gap["cust_id"],
        how="inner"
    )

agg_df = joined_df \
    .groupBy("first_name", "order_date") \
    .agg(F.sum("total_order_cost").alias("max_cost"))


window_spec = Window.orderBy(F.col("max_cost").desc())
result_df = agg_df \
    .withColumn("rank", F.row_number().over(window_spec)) \
    .filter(F.col("rank") == 1) \
    .select("first_name", "order_date", "max_cost")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()