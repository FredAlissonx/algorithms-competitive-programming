SELECT
  CONCAT(pt1.topping_name, ',', pt2.topping_name, ',', pt3.topping_name) AS pizza,
  pt1.ingredient_cost + pt2.ingredient_cost + pt3.ingredient_cost AS total_cost
FROM pizza_toppings AS pt1
CROSS JOIN
  pizza_toppings AS pt2,
  pizza_toppings AS pt3
WHERE
  pt1.topping_name < pt2.topping_name
AND
pt2.topping_name < pt3.topping_name
ORDER BY
  total_cost DESC, pizza;