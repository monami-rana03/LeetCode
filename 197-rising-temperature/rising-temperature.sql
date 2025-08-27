# Write your MySQL query statement below
SELECT m.id FROM weather n JOIN weather m
ON DATE(m.recordDate)=DATE(n.recordDate)+INTERVAL 1 DAY
WHERE m.temperature>n.temperature;