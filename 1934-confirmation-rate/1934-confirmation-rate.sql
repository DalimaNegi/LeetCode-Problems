# Write your MySQL query statement below

SELECT s.user_id , ROUND(AVG(if(c1.action ="confirmed",1,0)),2) as confirmation_rate
FROM Signups as s LEFT JOIN Confirmations as c1
ON s.user_id = c1.user_id  
GROUP BY user_id

# if confirm -> 1 , else -> 0 
# For 7, avg(1+1+1) = 3;