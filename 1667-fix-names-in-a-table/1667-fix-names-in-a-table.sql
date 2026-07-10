# Write your MySQL query statement below

SELECT user_id, CONCAT(UPPER(SUBSTR(name,1,1)),LOWER(SUBSTR(name,2))) as name
FROM Users
ORDER BY user_id;

# SUBSTR is used to extract part of string -> (name_of_string,index,length)
# CONCAT - to concatenate those substrings