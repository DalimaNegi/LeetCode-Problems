# Write your MySQL query statement below

SELECT name as results
FROM (
    SELECT u.name as name, COUNT(mr.user_id) as totalMovieRateCount
    FROM Users as u JOIN MovieRating as mr
    ON u.user_id = mr.user_id
    GROUP BY u.user_id
    ORDER BY totalMovieRateCount desc, name asc
    LIMIT 1
) as movie_count

UNION ALL     # using just UNION - removes duplicates

SELECT movieName as results
FROM(
    SELECT m.title as movieName,  AVG(mr.rating) as averageRating
    FROM Movies as m JOIN MovieRating as mr
    ON m.movie_id = mr.movie_id
    WHERE DATE_FORMAT(mr.created_at, '%Y-%m') = "2020-02"
    GROUP BY m.movie_id
    ORDER BY averageRating desc, movieName asc
    LIMIT 1
) as highestRating
