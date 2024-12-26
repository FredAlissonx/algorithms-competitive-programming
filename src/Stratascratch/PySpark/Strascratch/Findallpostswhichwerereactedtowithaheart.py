# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code

facebook_react_post = facebook_reactions.join(
    facebook_posts,
    on="post_id",
    how="inner"
    ) \
    .select(
        facebook_posts["*"],
        facebook_reactions["reaction"]
    )

col_select = [col for col in facebook_posts.columns]
result_df = facebook_react_post \
    .filter(
        F.col("reaction").contains("heart")
    ) \
    .select(*col_select) \
    .distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()