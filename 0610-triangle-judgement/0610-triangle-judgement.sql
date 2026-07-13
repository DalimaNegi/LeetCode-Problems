# Write your MySQL query statement below
SELECT x , y , z , 
CASE 
    WHEN x + y <= z THEN "No"
    WHEN z + y <= x THEN "No"
    WHEN x + z <= y THEN "No"
    ELSE "Yes"
END as triangle
FROM Triangle

# Sum of two sides should always be > third side.
