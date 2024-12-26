# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
# first we need to calculate the month total revenue (need to get year-month)
# lag(total_month, 1).over(Window.orderBy(month))
# calculate percentage = (cr - pr) / pr * 100
# ex.: cr = 1000, pr = 200 -> (tr = 800 / 200 * 100)
window_spec = Window.orderBy("year_month")

total_revenue = sf_transactions \
    .withColumn(
        "year_month",
        F.date_format("created_at", "yyyy-MM")
    ) \
    .groupBy("year_month") \
    .agg(
        F.sum("value").alias("total_revenue")
    )

result_df = total_revenue \
    .withColumn(
        "previous_total_revenue",
        F.lag("total_revenue").over(window_spec)
    ) \
    .withColumn(
        "revenue_diff_pct",
        F.round((F.col("total_revenue") - F.col("previous_total_revenue"))
        /
        F.col("previous_total_revenue")
        *
        100,
        2)
    ) \
    .select("year_month", "revenue_diff_pct")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()