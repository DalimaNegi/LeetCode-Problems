# Write your MySQL query statement below

SELECT mng.employee_id , mng.name, COUNT(emp.reports_to) as reports_count,                        ROUND(AVG(emp.age),0) as average_age
FROM Employees as emp JOIN Employees as mng
ON emp.reports_to = mng.employee_id
GROUP BY mng.employee_id
ORDER BY mng.employee_id;