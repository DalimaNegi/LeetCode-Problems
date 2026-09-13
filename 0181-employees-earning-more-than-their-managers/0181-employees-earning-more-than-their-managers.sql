# Write your MySQL query statement below

# Example of Self-JOIN

with t as(
    SELECT e.id as id, e.name as employeeName, e.salary as EmployeeSalary,
           e.managerId as managerID, m.salary as ManagerSalary
    FROM Employee as e JOIN Employee as m
    ON e.managerId = m.id
)

SELECT employeeName as Employee
FROM t
WHERE EmployeeSalary > ManagerSalary;
