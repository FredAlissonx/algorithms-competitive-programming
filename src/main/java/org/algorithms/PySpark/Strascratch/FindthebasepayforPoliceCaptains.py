# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
result_df = sf_public_salaries \
    .filter(F.lower(F.col("jobtitle")).contains("captain")) \
    .select("employeename", "basepay")

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()