# Import your libraries
from pyspark.sql.functions import col, count, desc, asc, rank
from pyspark.sql import DataFrame
from pyspark.sql.window import Window

# Start writing code
window_spec: Window = Window.orderBy(col("total_emails").desc(), col("from_user").asc())
users_emails: DataFrame = google_gmail_emails.groupBy(col("from_user")) \
    .agg(
    count("*").alias("total_emails")
    )

google_gmail_emails: DataFrame = users_emails.withColumn(
    "rank",
    rank().over(window_spec)
    ) \
    .orderBy(col("rank").asc())

# To validate your solution, convert your final pySpark df to a pandas df
google_gmail_emails.toPandas()