# Import your libraries
import pyspark
from pyspark.sql import functions as F
# Start writing code

condition_filter = (
    (F.col("notice_preference_definition") == "email") &
    (F.col("circulation_active_year") == 2016) &
    (F.col("provided_email_address") == False)
)
result_df = library_usage \
    .filter(condition_filter) \
    .select("home_library_code") \
    .distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()