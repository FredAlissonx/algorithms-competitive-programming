# Import your libraries
from pyspark.sql.window import Window
from pyspark.sql.functions import col, desc, dense_rank

# Start writing code
window_spec = Window.orderBy(col("salary").desc())
condition_join = (worker["worker_id"] == title["worker_ref_id"])
worker = worker.join(
    title,
    on=condition_join,
    how="inner"
    ) \
    .withColumn("rank", dense_rank().over(window_spec)) \
    .filter(col("rank") == 1) \
    .select(
        title["worker_title"].alias("best_paid_title")
    )

# To validate your solution, convert your final pySpark df to a pandas df
worker.toPandas()