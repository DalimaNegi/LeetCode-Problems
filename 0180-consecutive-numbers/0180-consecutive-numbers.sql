# Write your MySQL query statement below

# To check short, fixed length consecutiveness - WINDOW FUNCTIONS -> 
# LAG(col, N) -> fetches N rows before current row 
# AND 
# LEAD() -> fetches N rows after current row 

SELECT DISTINCT num as ConsecutiveNums 
FROM (SELECT id, num, 
             LEAD(num,1) over(ORDER BY id) as next1_num, 
             LEAD(num,2)  over(ORDER BY id) as next2_num
      FROM Logs)
AS consecutive_Numbers
WHERE num = next1_num and num = next2_num;


-- WHERE could be written outside because EXECUTION ORDER is
-- FROM
-- WHERE
-- Window functions (LEAD, LAG, etc.) are evaluated
-- SELECT