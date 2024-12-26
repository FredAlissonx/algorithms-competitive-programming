# Import your libraries
from pyspark.sql.functions import max, col

# Start writing code

bike_last_use = dc_bikeshare_q1_2012.groupBy("bike_number") \
    .agg(max("end_time").alias("last_used"))

join_condition = (
    (col("bk.bike_number") == col("dc.bike_number")) &
    (col("bk.last_used") == col("dc.end_time"))
    )

dc_bikeshare_q1_2012 = dc_bikeshare_q1_2012.alias("dc").join(
        bike_last_use.alias("bk"),
        on=join_condition,
        how="inner"
    ).select("bk.bike_number", "bk.last_used")
# To validate your solution, convert your final pySpark df to a pandas df
dc_bikeshare_q1_2012.toPandas()