# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
files_df = google_file_store \
    .filter(F.col("filename").contains("draft"))

result_df = files_df \
    .withColumn(
        "words",
        F.explode(F.split(F.col("contents"), "\W+"))
    ) \
    .filter(F.col("words") != "") \
    .groupby("words").count()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()