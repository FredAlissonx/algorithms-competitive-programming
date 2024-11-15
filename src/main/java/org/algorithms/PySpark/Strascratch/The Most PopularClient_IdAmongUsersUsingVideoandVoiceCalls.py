# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
event_list = [
    'video call received',
    'video call sent',
    'voice call received',
    'voice call sent'
    ]

window_spec = Window.partitionBy("user_id")

filtered_users = fact_events \
    .withColumn(
        "qtd_events",
        F.sum(
            F.when(F.col("event_type").isin(event_list), 1).otherwise(0)
            ).over(window_spec)
    ) \
    .withColumn(
        "qtd_total",
        F.count("*").over(window_spec)
    ) \
    .withColumn(
        "percentage_in_list",
        (F.col("qtd_events") / F.col("qtd_total")) * 100
    ) \
    .filter(F.col("percentage_in_list") >= 50)

result_df = filtered_users \
    .groupBy("client_id") \
    .count() \
    .orderBy(F.desc("count")) \
    .select("client_id") \
    .limit(1)

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()