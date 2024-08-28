# Import your libraries
import pyspark
from pyspark.sql.functions import lit, col, count, when
from pyspark.sql.window import Window

# Start writing code
result_df = facebook_posts.join(
    facebook_post_views,
    on="post_id",
    how="left"
    ) \
    .groupBy("post_date") \
    .agg(
        (count(when(col("post_keywords").like('%spam%'), 1)) / count(col("viewer_id")) * 100) \
            .alias("spam_share")
        )


# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()