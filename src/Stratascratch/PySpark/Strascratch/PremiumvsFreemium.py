# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
# total number of downloads for paying and non-paying users by date
# join first
# no > yes
joined_df = ms_user_dimension \
    .join(
        ms_download_facts,
        on="user_id",
        how="inner"
    ) \
    .join(
        ms_acc_dimension,
        on="acc_id",
        how="inner"
    )

sum_downloads = joined_df \
    .groupBy("date") \
    .agg(
        F.sum(F.when(F.col("paying_customer") == "yes", F.col("downloads"))).alias("yes"),
        F.sum(F.when(F.col("paying_customer") == "no", F.col("downloads"))).alias("no")
    )

result_df = sum_downloads \
    .filter(F.col("no") > F.col("yes"))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()