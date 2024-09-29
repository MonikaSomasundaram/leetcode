# Write your MySQL query statement below
select a.name from Employee a,Employee b where a.id=b.managerId group by b.managerId having count(a.id)>=5;