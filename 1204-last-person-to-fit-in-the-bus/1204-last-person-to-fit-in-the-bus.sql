# Write your MySQL query statement below

SELECT person_name
FROM ( SELECT turn, person_id as ID , person_name, weight, 
       SUM(weight) OVER(ORDER BY TURN) as TotalWeight      #Window function
       FROM Queue
       ORDER BY TURN
     ) filtered_data
WHERE TotalWeight <= 1000
ORDER BY TURN desc
LIMIT 1 OFFSET 0;