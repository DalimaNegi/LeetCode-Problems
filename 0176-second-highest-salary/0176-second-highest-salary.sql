# Write your MySQL query statement below

SELECT (
    SELECT DISTINCT salary FROM Employee ORDER BY salary desc LIMIT 1 OFFSET 1
) as SecondHighestSalary;

-- LIMIT - no. of rows to extract
-- OFFSET - row position (0-n)
