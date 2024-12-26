# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
condition = (
    (F.col("yearly_salary") <= 30_000) |
    (F.col("yearly_salary") >= 70_000)
)

result_df = lyft_drivers \
    .filter(condition)


# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()