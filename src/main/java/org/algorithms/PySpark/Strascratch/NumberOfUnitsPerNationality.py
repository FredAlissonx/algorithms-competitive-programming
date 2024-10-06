# Import your libraries
from pyspark.sql.functions import col, count, desc, lower

# Start writing code
airbnb_hosts_distinct = airbnb_hosts.filter(col("age") < 30).drop_duplicates()

airbnb_hosts_units =  airbnb_hosts_distinct \
    .join(
        airbnb_units,
        on="host_id",
        how="inner"
        ) \
        .filter(lower(col("unit_type")) == "apartment")

result_df = airbnb_hosts_units \
    .groupBy("nationality") \
    .agg(count("*").alias("apartment_count")) \
    .orderBy(col("apartment_count").desc())

#To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()