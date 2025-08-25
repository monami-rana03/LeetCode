# Write your MySQL query statement below
SELECT customer_id,count(*) AS count_no_trans 
FROM visits v left join transactions t
ON v.visit_id=t.visit_id
WHERE t.visit_id IS NULL
GROUP BY customer_id;
