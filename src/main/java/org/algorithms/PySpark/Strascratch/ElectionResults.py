# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
value_votes = voting_results.groupBy("voter").agg(
    F.round(1 / F.count("candidate"), 3).alias("vote_value")
)

joined_df = voting_results.join(value_votes, on="voter", how="inner")

window_spec = Window.orderBy(F.col("total_vote").desc())
most_voted = joined_df.groupBy("candidate").agg(
    F.sum("vote_value").alias("total_vote")
).withColumn(
    "rank", F.rank().over(window_spec)
).filter(F.col("rank") == 1).select("candidate")

# To validate your solution, convert your final pySpark df to a pandas df
most_voted.toPandas()