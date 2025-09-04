# Write your MySQL query statement below
SELECT m.student_id,m.student_name,n.subject_name,count(o.student_id) as attended_exams 
FROM Students m CROSS JOIN Subjects n LEFT JOIN Examinations o
ON m.student_id=o.student_id AND n.subject_name=o.subject_name
GROUP BY m.student_id,m.student_name,n.subject_name
ORDER BY m.student_id,n.subject_name;