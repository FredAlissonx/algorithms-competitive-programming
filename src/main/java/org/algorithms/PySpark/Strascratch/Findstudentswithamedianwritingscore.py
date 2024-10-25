# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
median_score = sat_scores \
    .select(
        F.percentile_approx("sat_writing", 0.5)
    ) \
    .collect()[0][0]

result_df = sat_scores \
    .filter(F.col("sat_writing") == median_score) \
    .select(
        "student_id"
    )
# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()