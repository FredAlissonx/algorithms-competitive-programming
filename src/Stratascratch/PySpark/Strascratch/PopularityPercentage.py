# Import your libraries
import pyspark
from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Start writing code
# popularity percentage for each user
# total_friends / total_users * 100
#
fb_prep = facebook_friends \
    .unionAll(facebook_friends.select('user2', 'user1')) \
    .groupBy('user1') \
    .agg(F.count('*').alias('total_friends'))

result_df = fb_prep \
    .select(
        'user1',
        (F.col('total_friends') / fb_prep.count() * 100).alias('popularity_percent'))

# To validate your solution, convert your final pySpark df to a pandas df
result_df.toPandas()