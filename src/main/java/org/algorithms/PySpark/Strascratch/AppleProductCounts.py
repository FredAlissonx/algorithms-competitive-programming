# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
apple_prd = ["macbook pro", "iphone 5s", "ipad air"]

joined_df = playbook_events.join(playbook_users, on="user_id", how="inner")

result_df = joined_df.groupBy("language") \
    .agg(
        F.countDistinct(F.when(F.col("device").isin(apple_prd), F.col("user_id"))).alias("n_apple_users"),
        F.countDistinct("user_id").alias("n_total_users")
    )

# Convert the result to a pandas DataFrame for validation
result_df.toPandas()
