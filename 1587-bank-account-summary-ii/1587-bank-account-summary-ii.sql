# Write your MySQL query statement below

with cte as(
    SELECT u.account as account, u.name as name , t.amount as amount
    FROM Users as u JOIN Transactions as t
    ON u.account = t.account
)

SELECT name , SUM(amount) as balance
FROM cte
GROUP BY account
HAVING SUM(amount)>10000;