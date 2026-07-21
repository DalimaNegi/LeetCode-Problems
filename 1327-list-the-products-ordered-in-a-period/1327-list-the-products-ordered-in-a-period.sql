# Write your MySQL query statement below

SELECT DISTINCT p.product_name as product_name, SUM(o.unit) as unit
FROM Products as p JOIN Orders as o
ON p.product_id = o.product_id
WHERE DATE_FORMAT(o.order_date, "%Y-%m") = "2020-02"
GROUP BY p.product_id
HAVING SUM(o.unit) >= 100;