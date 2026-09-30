# Write your MySQL query statement below

with cte as(
    SELECT player_id , 
           event_date, 
           RANK() OVER(PARTITION BY player_id ORDER BY event_date ) as login
    FROM Activity
)

SELECT player_id, event_date as first_login
FROM cte
WHERE login = 1;
