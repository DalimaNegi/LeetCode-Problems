# Write your MySQL query statement below

with cte as(
    SELECT DISTINCT customer_number , COUNT(customer_number) as totalOrders
    FROM Orders
    GROUP BY customer_number
    ORDER BY totalOrders desc
)

SELECT customer_number
FROM cte
LIMIT 1;