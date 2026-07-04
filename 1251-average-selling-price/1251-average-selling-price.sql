# Write your MySQL query statement below
SELECT p.product_id , ROUND(
    CASE 
        WHEN sum(u.units) is NULL then 0 
        ELSE sum(p.price * u.units)/ sum(u.units) 
    END ,
2) as average_price
FROM Prices as p LEFT JOIN UnitsSold as u
ON p.product_id = u.product_id 
AND u.purchase_date >= p.start_date and u.purchase_date <= p.end_date  
GROUP BY p. product_id;
