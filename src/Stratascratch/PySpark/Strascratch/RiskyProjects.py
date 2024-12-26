# Import your libraries
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
employee_link = linkedin_emp_projects["emp_id"] == linkedin_employees["id"]
project_link = linkedin_emp_projects["project_id"] == linkedin_projects["id"]

joined_df = linkedin_emp_projects \
    .join(
        linkedin_employees,
        on=employee_link,
        how="inner"
    ) \
    .join(
        linkedin_projects,
        on=project_link,
        how="inner"
    )

project_hst = joined_df \
    .withColumn(
        "days",
        F.datediff(joined_df.end_date, joined_df.start_date)
    ) \
    .withColumn(
        "prorated_salary",
        (F.col("days") / 365) * F.col("salary")
    )

result_df = project_hst \
    .groupBy("title", "budget") \
    .agg(
        F.ceil(F.sum("prorated_salary")).alias("prorated_expense")
    ) \
    .filter(F.col("budget") < F.col("prorated_expense")) \
    .orderBy("title")

# Show the result
result_df.toPandas()