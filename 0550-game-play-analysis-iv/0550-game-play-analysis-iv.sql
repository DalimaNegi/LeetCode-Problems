# Write your MySQL query statement below
with cte as(
    SELECT player_id , MIN(event_date) as login
    FROM Activity
    GROUP BY player_id
),

consecutiveLogin as(
    SELECT a.player_id as player
    FROM Activity as a JOIN cte as firstlogin
    ON a.player_id = firstlogin.player_id 
    and a.event_date = DATE_ADD( firstlogin.login, INTERVAL 1 day) 
)

SELECT ROUND(COUNT(player)/(SELECT COUNT(DISTINCT player_id) FROM Activity),2) as fraction
FROM consecutiveLogin


