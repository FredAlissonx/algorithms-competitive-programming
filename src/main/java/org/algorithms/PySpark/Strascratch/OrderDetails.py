# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
allowed_first_name = ["Jill", "Eva"]
join_condition = (orders.cust_id == customers.id)

result_df = customers \
    .filter(F.col("first_name").isin(allowed_first_name)) \
    .join(
        orders,
        on=join_condition,
        how="inner"
    ) \
    .select(
        customers["first_name"],
        orders["order_date"],
        orders["order_details"],
        orders["total_order_cost"]
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()