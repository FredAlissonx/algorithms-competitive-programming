# Import your libraries
import pyspark
from pyspark.sql.functions import col, lead, count, rank, when
from pyspark.sql.window import Window

# Start writing code
window_spec = Window.partitionBy("company_name").orderBy("year")
df_1 = car_launches.groupBy("company_name", "year") \
    .agg(count("product_name").alias("quantity"))

car_launches = df_1.withColumn(
    "net_products",
    lead(col("quantity")).over(window_spec) - col("quantity")
    )

cols = ["company_name", "net_products"]
car_launches = car_launches.filter(col("net_products").isNotNull()).select(*cols)


# To validate your solution, convert your final pySpark df to a pandas df
car_launches.toPandas()