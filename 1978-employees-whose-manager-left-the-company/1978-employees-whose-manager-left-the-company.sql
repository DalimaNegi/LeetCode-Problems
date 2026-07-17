# Write your MySQL query statement below

SELECT employee_id
FROM Employees 
WHERE manager_id not in (
    SELECT employee_id FROM Employees
) and salary < 30000
ORDER BY employee_id;


# manager-6 not in employees 
# employee -11 whose ex-manager is 6 has salary 28k.