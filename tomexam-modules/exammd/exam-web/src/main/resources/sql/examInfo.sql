#sql("examNum")
select count(1) t from tm_exam_info where pid = ?
#end
#sql("analyze")
select p.*,(select count(1) from tm_exam_info ei where ei.pid =#para(pid)) total_people,
(select count(1) from tm_exam_info ei where ei.pid =#para(pid) and ei.score >= 0.6 * p.total_score) pass_num,
(select count(1) from tm_exam_info ei where ei.pid =#para(pid) and ei.score < 0.6 * p.total_score ) not_pass_num,
(select max(ei.score) from tm_exam_info ei where ei.pid =#para(pid)) max_score,
(select min(ei.score) from tm_exam_info ei where ei.pid =#para(pid)) min_score,
(select avg(ei.score) from tm_exam_info ei where ei.pid =#para(pid)) avg_score,
(select 0.6 * p.total_score) pass_score
from
	tm_paper p
where
	p.id =#para(pid)
#end