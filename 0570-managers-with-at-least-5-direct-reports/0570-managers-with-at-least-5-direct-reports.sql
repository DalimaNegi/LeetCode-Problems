# Write your MySQL query statement below
SELECT e.name 
FROM Employee as e JOIN Employee as f
ON e.id = f.managerId
GROUP BY e.name, e.id
HAVING count(f.managerId) >=5;

-- SELF JOIN : One table is treated as manager and other as employees under it.
