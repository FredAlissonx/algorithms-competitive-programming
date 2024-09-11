# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code

facebook_react_post = facebook_reactions.alias("fr").join(
    facebook_posts.alias("fp"),
    on="post_id",
    how="inner"
    )

result_df = facebook_react_post \
    .filter(
        F.col("reaction").contains("heart")
    ) \
    .select(
        "fp.post_id",
        "fp.poster",
        "fp.post_text",
        "fp.post_keywords",
        "fp.post_date"
    ).distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()