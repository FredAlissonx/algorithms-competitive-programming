# Import your libraries
import pyspark
from pyspark.sql import DataFrame
from pyspark.sql.functions import col, max

# Start writing code
current_salary = ms_employee_salary.groupBy(
    col("id")
    ) \
    .agg(max(col("salary")).alias("max_salary"))

join_condition = (
    (ms_employee_salary["id"] == current_salary["id"]) &
    (ms_employee_salary["salary"] == current_salary["max_salary"])
    )
ms_employee_salary_final_df = ms_employee_salary.join(
        current_salary,
        on=join_condition,
        how="inner"
    ).select(ms_employee_salary["*"]) \
    .orderBy(col("id"))

# To validate your solution, convert your final pySpark df to a pandas df
ms_employee_salary_final_df.toPandas()