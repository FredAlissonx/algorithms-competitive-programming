# Import your libraries
from pyspark.sql.functions import col, sum, max

# Start writing code
valid_departments_id = [1, 4]
join_condition = (
    db_employee["department_id"] == db_dept["id"]
    )

department_salaries = db_employee.join(
        db_dept,
        on=join_condition,
        how="inner"
    ) \
    .filter(
        col("department_id").isin(valid_departments_id)
    ) \
    .groupBy(col("department_id")) \
    .agg(
        max("salary").alias("salary_department")
    )

expression = """
    SUM(
        CASE
            WHEN department_id = 1 THEN -salary_department
            ELSE salary_department
        END
    ) AS salary_difference
"""
db_employee = department_salaries.selectExpr(expression)

# To validate your solution, convert your final pySpark df to a pandas df
db_employee.toPandas()