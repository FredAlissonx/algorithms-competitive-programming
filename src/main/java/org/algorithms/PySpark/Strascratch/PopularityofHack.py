# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
joined_df = facebook_employees.join(
    facebook_hack_survey,
    on=facebook_hack_survey["employee_id"]==facebook_employees["id"],
    how="inner"
    )

result_df = joined_df \
    .groupBy("location") \
    .agg(
        F.avg("popularity").alias("popularity")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()