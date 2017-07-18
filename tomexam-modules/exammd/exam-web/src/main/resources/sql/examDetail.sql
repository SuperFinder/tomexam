#sql("findDetail")
select t.*,(t.mnum/t.totalnum)*100 tpercent from
(select ed.qid,count(1) totalnum,  sum(if(ed.score<=0,0,1)) mnum
from tm_exam_detail ed where ed.pid=? group by ed.qid) t
#end