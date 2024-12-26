# Import your libraries
import pyspark
from pyspark.sql.window import Window
from pyspark.sql.functions import col, dense_rank, desc, sum

# Start writing code
window_spec: Window = Window.orderBy(col("total_messages").desc())
sum_messages = airbnb_contacts.groupBy("id_guest") \
    .agg(sum("n_messages").alias("total_messages"))

ranked_guests = sum_messages.withColumn(
        "rank",
        dense_rank().over(window_spec)
    ).orderBy(col("rank"))

airbnb_contacts = ranked_guests.select(col("id_guest"), col("total_messages").alias("n_messages"), col("rank"))

# To validate your solution, convert your final pySpark df to a pandas df
airbnb_contacts.toPandas()