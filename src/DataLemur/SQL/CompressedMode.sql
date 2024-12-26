 WITH ranked AS (
   SELECT
     order_occurrences,
     item_count,
     DENSE_RANK() OVER(
       ORDER BY order_occurrences DESC
       ) AS ranking
   FROM items_per_order
 )
 SELECT
   item_count AS mode
 FROM ranked
 WHERE ranking = 1
 ORDER BY mode ASC;