# Write your MySQL query statement below

with realData as(
    SELECT id
    FROM (
        SELECT email , MIN(id) as id
        FROM Person
        GROUP BY email
    ) as data
)

DELETE FROM PERSON
WHERE id not in (SELECT * FROM realData);

# Way - 1
-- DELETE p1 FROM Person p1 JOIN Person p2           # Cartesian Product CROSS JOIN
-- WHERE p1.email = p2.email and p1.id > p2.id;  