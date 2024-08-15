# Import your libraries
from pyspark.sql.functions import rank, desc, col, sum


# Start writing code
forbes_global_2010_2014 = forbes_global_2010_2014.orderBy(col("profits").desc()).limit(3).select(
        "company",
        "profits"
    )

# To validate your solution, convert your final pySpark df to a pandas df
forbes_global_2010_2014.toPandas()