# Write your MySQL query statement below

with sameTiv as (
    SELECT tiv_2015 , COUNT(tiv_2015) as repeatedTiv
    FROM Insurance
    GROUP BY tiv_2015
    Having COUNT(tiv_2015) > 1
)
,
 uniqueCoordinates as (
    SELECT lat,lon
    FROM Insurance
    GROUP BY lat,lon
    HAVING COUNT(*) = 1
)

SELECT ROUND(SUM(tiv_2016),2) as tiv_2016 
FROM Insurance
WHERE tiv_2015 in (SELECT tiv_2015 FROM sameTiv) and (lat,lon) in (SELECT lat, lon FROM uniqueCoordinates)