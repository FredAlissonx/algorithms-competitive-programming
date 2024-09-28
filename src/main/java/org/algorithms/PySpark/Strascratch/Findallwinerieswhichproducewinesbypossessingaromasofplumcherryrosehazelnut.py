# Import your libraries
import pyspark
from pyspark.sql import functions as F

# Start writing code
aromas = ["plum", "cherry", "rose", "hazelnut"]
aromas_pattern = r"\b(" + "|".join(aromas) + r")\b"

result_df =  winemag_p1 \
    .filter(F.lower(F.col("description")).rlike(aromas_pattern)) \
    .select("winery").distinct()

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()