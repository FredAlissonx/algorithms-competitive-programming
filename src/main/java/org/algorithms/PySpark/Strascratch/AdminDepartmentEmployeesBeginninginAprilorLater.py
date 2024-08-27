# Import your libraries
import pyspark
from pyspark.sql.functions import col, month

# Start writing code
filter_condition = (
       (col("department") == "Admin") &
       (month(col("joining_date")) >= 4)
    )

worker = worker.filter(filter_condition).count()

# To validate your solution, convert your final pySpark df to a pandas df
worker