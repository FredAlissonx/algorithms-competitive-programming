from pyspark.sql import functions as F
from pyspark.sql import SparkSession

def etl(customers, orders, products):
    # Perform inner joins to combine the DataFrames
    joined_df = customers.join(
        orders,
        customers["customer_id"] == orders["customer_id"],
        "inner"
    ).join(
        products,
        orders["product_id"] == products["product_id"],
        "inner"
    )

    # Create the customer_name column by concatenating first_name and last_name
    joined_df = joined_df.withColumn(
        "customer_name", F.concat(F.col("first_name"), F.lit(" "), F.col("last_name"))
    )

    # Select the desired columns in the required order
    result_df = joined_df.select(
        "category",
        "customer_name",
        "email",
        "order_date",
        "order_id",
        "product_name"
    )

    return result_df
