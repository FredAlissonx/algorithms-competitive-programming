# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
window_spec = Window.partitionBy("department")
avg_dept = employee \
    .withColumn(
        "avg_salary",
        F.avg("salary").over(window_spec)
    )

result_df = avg_dept \
    .select(
        "department",
        "first_name",
        "salary",
        "avg_salary"
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()