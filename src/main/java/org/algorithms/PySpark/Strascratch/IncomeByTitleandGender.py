# Import your libraries
import pyspark
from pyspark.sql.functions import col, avg, sum
from pyspark.sql.window import Window

# Start writing code
join_condition = (sf_employee["id"] == sf_bonus["worker_ref_id"])
sf_bonus = sf_bonus.groupBy("worker_ref_id") \
    .agg(sum("bonus").alias("bonus"))

employee_bonus = sf_employee.join(
        sf_bonus,
        on=join_condition,
        how="inner"
    ) \
    .withColumn(
        "total_compensation",
        col("salary") + col("bonus")
        )

result_df = employee_bonus.groupBy("employee_title", "sex") \
    .agg(avg("total_compensation").alias("avg_total_comp"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()