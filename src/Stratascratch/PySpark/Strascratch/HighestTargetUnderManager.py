# Import your libraries
import pyspark
from pyspark.sql.functions import desc, col

# Start writing code
salesforce_employees = salesforce_employees.filter(col("manager_id") == 13)

result_df = salesforce_employees \
    .select(
        "first_name",
        "target") \
    .orderBy(col("target").desc(), col("first_name")) \
    .limit(3)

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()