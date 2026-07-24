# Write your MySQL query statement below
with ranking as (
    SELECT d.name as Department, e.name as Employee,                                         e.salary as Salary,                                                              DENSE_RANK() OVER(Partition BY d.name ORDER BY e.salary desc) as salaryRank
    FROM Employee as e JOIN Department as d
    ON e.departmentId = d.id
)

SELECT Department, Employee, Salary
FROM ranking
WHERE salaryRank <= 3;