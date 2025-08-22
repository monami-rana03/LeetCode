# Write your MySQL query statement below
SELECT m.product_name,n.year,n.price FROM Product m JOIN Sales n ON m.product_id=n.product_id;