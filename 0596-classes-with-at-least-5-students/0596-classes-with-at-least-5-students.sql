# Write your MySQL query statement below

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(class) >= 5 ;

# Whenever we want to use conditions with GROUP -> we use HAVING