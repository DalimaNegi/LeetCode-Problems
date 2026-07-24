# Write your MySQL query statement below

with cte as (
    SELECT requester_id as id , COUNT(requester_id) as num
    FROM RequestAccepted 
    GROUP BY requester_id

    UNION ALL

    SELECT accepter_id as id , COUNT(accepter_id) as num
    FROM RequestAccepted 
    GROUP BY accepter_id 
)

SELECT id , SUM(num) as num
FROM cte
GROUP BY id
ORDER BY num desc
LIMIT 1;
