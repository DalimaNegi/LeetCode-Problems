# Write your MySQL query statement below

SELECT p.product_id,
COALESCE(
    (
        SELECT new_price 
        FROM Products p2
        WHERE p.product_id = p2.product_id
        AND p2.change_date <= "2019-08-16"
        ORDER BY p2.change_date desc
        LIMIT 1
    ),10
) as price
FROM (
    SELECT distinct product_id FROM Products
) as p ;