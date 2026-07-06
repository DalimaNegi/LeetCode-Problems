# Write your MySQL query statement below

SELECT query_name , 
ROUND(AVG(rating / position) ,2) as quality, 
ROUND((SUM(
    CASE 
      WHEN rating < 3 
         Then 1 
         Else 0 
      END) * 100)/COUNT(rating) ,2) as poor_query_percentage
FROM Queries
WHERE query_name is not NULL
GROUP BY query_name ;