# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
join_condition = (F.col("emp1.manager_id") == F.col("emp2.id"))
manager_salary = employee.alias("emp1") \
    .join(
        employee.alias("emp2"),
        on=join_condition,
        how="inner"
    ) \
    .select(
        "emp1.id",
        "emp1.first_name",
        "emp1.salary",
        F.col("emp2.id").alias("id_manager"),
        F.col("emp2.salary").alias("manager_salary")
    )

result_df = manager_salary \
    .filter(F.col("salary") > F.col("manager_salary")) \
    .select(
        "first_name",
        "salary"
    )
# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()