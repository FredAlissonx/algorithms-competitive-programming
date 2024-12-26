# Import your libraries
import pyspark
from pyspark.sql import functions as F
# Start writing code
los_angeles_restaurant_health_inspections = los_angeles_restaurant_health_inspections.filter(
    F.col("program_status") == "INACTIVE"
)

# To validate your solution, convert your final pySpark df to a pandas df
los_angeles_restaurant_health_inspections.toPandas()