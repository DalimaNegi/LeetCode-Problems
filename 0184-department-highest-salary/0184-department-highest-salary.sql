# Write your MySQL query statement below

with t as(
    SELECT 
        departmentId, 
        name, 
        salary, 
        DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary desc) as s_rank
    FROM Employee 
)

SELECT d.name as Department, t.name as Employee, t.salary as Salary
FROM t JOIN Department as d
ON t.departmentId = d.id
WHERE t.s_rank = 1;