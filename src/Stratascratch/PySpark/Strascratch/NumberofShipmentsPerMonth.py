# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
year_month = F.date_format("shipment_date", "yyyy-MM").alias("year_month")
result_df = amazon_shipment \
    .groupBy(year_month) \
    .agg(
        F.countDistinct("shipment_id", "sub_id").alias("count")
    )

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()