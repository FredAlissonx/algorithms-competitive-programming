import pyspark.sql.functions as F
from pyspark.sql import Window

# Start writing code
premium_accounts_by_day = premium_accounts_by_day \
    .withColumn(
        "date_plus_7d",
        F.date_add(premium_accounts_by_day["entry_date"], 7)
    )

join_condition = (
        (F.col("left.account_id") == F.col("right.account_id")) &
        (F.col("left.date_plus_7d") == F.col("right.entry_date"))
    )

merged_df = premium_accounts_by_day.alias("left") \
    .join(
        premium_accounts_by_day.alias("right"),
        on=join_condition,
        how="left"
    )
merged_df = merged_df.filter(merged_df["left.final_price"] > 0)

merged_df = merged_df \
    .withColumn(
        "final_price_right",
        F.when(F.col("right.final_price") == 0, None) \
        .otherwise(F.col("right.final_price"))
        )

result_df = merged_df \
    .groupBy('left.entry_date') \
    .agg(
        F.count("left.final_price").alias("premium_paid_accounts"),
        F.count("final_price_right").alias("premium_paid_accounts_after_7d")
    ) \
    .orderBy("entry_date") \
    .limit(7)


# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()