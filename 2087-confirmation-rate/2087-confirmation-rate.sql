# Write your MySQL query statement below
select s.user_id,
case
when count(c.user_id)=0 then 0
else round(SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END)/count(c.user_id),2)
end
as confirmation_rate 
from Signups s left join Confirmations c on s.user_id=c.user_id group by s.user_id;