# Write your MySQL query statement below
# output is only matched rows from both tables.
select p.product_name , s.year, s.price
from Product as p INNER JOIN Sales as s
where s.product_id = p.product_id;