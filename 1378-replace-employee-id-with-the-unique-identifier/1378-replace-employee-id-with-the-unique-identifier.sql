# Write your MySQL query statement below
select e.name, uni.unique_id 
from Employees as e LEFT JOIN EmployeeUNI as uni
on e.id = uni.id;