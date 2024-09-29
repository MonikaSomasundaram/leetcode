# Write your MySQL query statement below
select a.machine_id,round((sum(b.timestamp)-sum(a.timestamp))/COUNT(a.process_id),3) as processing_time from Activity a,Activity b where a.machine_id=b.machine_id and a.process_id=b.process_id and a.activity_type="start" and b.activity_type="end" group by machine_id;