# Write your MySQL query statement below

SELECT visited_on, amount, average_amount
FROM (
    SELECT DISTINCT visited_on , 
       SUM(amount) OVER (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 day PRECEDING AND CURRENT ROW) as amount,
       ROUND(SUM(amount) OVER (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 day PRECEDING AND CURRENT ROW)/7,2) as average_amount
    FROM Customer  
) as w
WHERE DATEDIFF(visited_on, (SELECT MIN(visited_on) FROM Customer)) >= 6
ORDER BY visited_on;


# ROWS - no missing dates - ROWS BETWEEN 6 PRECEDING AND CURRENT ROW                         - shows each row regardless of missing data

# RANGE - have missing dates - RANGE BETWEEN INTERVAL 6 day PRECEDING AND CURRENT ROW       - skips rows if no data exists for a specific date
