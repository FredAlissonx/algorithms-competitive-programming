# Import your libraries
from pyspark.sql import functions as F
from pyspark.sql.window import Window, WindowSpec
from pyspark.sql import DataFrame

# Start writing code
window_spec_load: WindowSpec = Window.partitionBy("user_id", F.to_date("timestamp")).orderBy(F.col("timestamp").desc())
window_spec_exit: WindowSpec = Window.partitionBy("user_id", F.to_date("timestamp")).orderBy(F.col("timestamp").asc())

filtered_logs = facebook_web_log.filter(
    F.col("action").isin(["page_load", "page_exit"])
)

def get_earlier_last(action: str, window_spec: WindowSpec, alias: str) -> DataFrame:
    filtered_logs = facebook_web_log.filter(
        F.col("action").isin(["page_load", "page_exit"])
    )
    return filtered_logs.filter(F.col("action") == action) \
            .withColumn("row_number", F.row_number().over(window_spec)) \
            .filter(F.col("row_number") == 1) \
            .select("user_id", F.to_date("timestamp").alias("date"), F.col("timestamp").alias(alias))


latest_page_load = get_earlier_last(action="page_load", window_spec=window_spec_load, alias="load_time")
earliest_page_exit = get_earlier_last(action="page_exit", window_spec=window_spec_exit, alias="exit_time")

session_times = latest_page_load.join(
    earliest_page_exit,
    on=["user_id", "date"]
).filter(F.col("load_time") < F.col("exit_time"))


session_times = session_times.withColumn(
    "session_duration", F.unix_timestamp("exit_time") - F.unix_timestamp("load_time")
)

avg_session_duration = session_times.groupBy("user_id").agg(
    F.avg("session_duration").alias("avg_session_duration")
)


# To validate your solution, convert your final pySpark df to a pandas df
avg_session_duration.toPandas()