# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
# top 5 states with most 5 start business
# are ties = return all unique states (rank)
# If two states have the same result, sort them in alphabetical order
# orderBy(n_businesses, state)
window_spec: Window = Window.orderBy(F.col("n_businesses").desc())
total_n_business = yelp_business \
    .groupBy("state") \
    .agg(
        F.sum(
            F.when(F.col("stars") == 5, 1)
        ).alias("n_businesses")
    )

ranked_states = total_n_business \
    .withColumn(
        "rank",
        F.rank().over(window_spec)
    )

result_df = ranked_states \
    .filter(F.col("rank") <= 5) \
    .orderBy(F.col("n_businesses").desc(), "state") \
    .select("state", "n_businesses")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()