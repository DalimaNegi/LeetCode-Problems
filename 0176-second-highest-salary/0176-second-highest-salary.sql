# Write your MySQL query statement below

-- SELECT (
--     SELECT DISTINCT salary FROM Employee ORDER BY salary desc LIMIT 1 OFFSET 1
-- ) as SecondHighestSalary;    # Time and Space cmplx - O(n)

-- LIMIT - no. of rows to extract
-- OFFSET - row position (0-n)

-- SELECT MAX(salary) as SecondHighestSalary 
-- FROM Employee
-- WHERE salary < (SELECT MAX(salary) FROM Employee); # Time -O(n) and Space cmplx- O(1)

SELECT MAX(salary) as SecondHighestSalary 
FROM Employee
WHERE salary not in (SELECT MAX(salary) FROM Employee);
