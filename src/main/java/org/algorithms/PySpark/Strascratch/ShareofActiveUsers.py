# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
fb_active_users = fb_active_users.agg(
        (F.count(F.when((F.col("status") == "open") & (F.col("country") == "USA"), 1)) /
        F.count(F.when(F.col("country") == "USA", 1))).alias("active_users_share")
    )

# To validate your solution, convert your final pySpark df to a pandas df
fb_active_users.toPandas()