# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
review_condition = (
    (F.col("reviewed_outcome") == "APPROVED") &
    (F.col("reviewed_by_yt") == True)
)

flag_review_df = flag_review.filter(review_condition)

joined_df = user_flags.join(
    flag_review_df,
    on="flag_id",
    how="inner"
).select(
    F.concat_ws(
        " ",
        user_flags.user_firstname,
        user_flags.user_lastname
        ).alias("username"),
    "video_id"
)

grouped_df = joined_df \
    .groupBy("username") \
    .agg(F.countDistinct("video_id").alias("qtt"))

max_qtt = grouped_df \
    .agg(
        F.max("qtt").alias("max_qtt")
        ) \
        .collect()[0]["max_qtt"]

result_df = grouped_df.filter(F.col("qtt") == max_qtt).select("username")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()