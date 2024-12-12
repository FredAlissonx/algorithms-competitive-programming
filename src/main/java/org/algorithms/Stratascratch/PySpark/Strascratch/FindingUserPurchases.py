from pyspark.sql.functions import col, lead, datediff
from pyspark.sql.window import Window
from pyspark.sql import DataFrame

# Start writing code here
window_spec: Window = Window.partitionBy("user_id").orderBy("created_at")
amazon_transactions: DataFrame = amazon_transactions.withColumn("next_date", lead(col("created_at"), 1).over(window_spec))

amazon_transactions: DataFrame = amazon_transactions.filter(
        datediff(col("next_date"), col("created_at")) <= 7
    ).select("user_id").distinct()

# Show the result and convert to pandas
amazon_transactions.toPandas()
