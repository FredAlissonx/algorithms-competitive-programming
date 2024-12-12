# Import your libraries
import pyspark
from pyspark.sql.functions import col, when, count

# Start writing code

known_address_percentage = count(col("address")) / count(col("*")) * 100
join_condition = orders["cust_id"] == customers["id"]

result_df = orders.join(
    customers,
    on=join_condition,
    how="inner"
    ) \
    .select(
        known_address_percentage
        )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()