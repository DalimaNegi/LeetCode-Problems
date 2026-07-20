# Write your MySQL query statement below

SELECT * FROM Users
WHERE REGEXP_LIKE(mail,"^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$","c");

-- REGEX BASICS 
-- ^ , $ → start match at beginning / ending of the string.
-- | → alternation , eg: (a | o)
-- dot → match single character.
-- asterisk → repetition of previous character zero or more times.
-- plus → repetition of previous character one or more times.
-- [ abc ] → matches either a , b or c.
-- [ ^abc ] → match everything except a , b and c.
-- ? → matches the character either 0 or 1 time , optional character.
-- { n , m } → between n and m times the preceding element
-- \d , \s → match ONE digit and \s for ONE space.
-- \w → match ONE word character , its like [a-zA-Z0-9_]