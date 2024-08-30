# Import your libraries
import pyspark
from pyspark.sql.functions import col

# Start writing code
join_condition = ["nationality", "gender"]
result_df = airbnb_hosts.join(
    airbnb_guests,
    on=join_condition,
    how="inner"
    ) \
    .select(
        "host_id",
        "guest_id"
        ) \
    .distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()