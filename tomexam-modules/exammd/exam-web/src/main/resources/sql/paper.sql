#sql("add")
insert into tm_paper (paper_name,adminid,departmentid,status,starttime,endtime ,paper_minute,
total_score,remark,qorder,postdate,show_score, isranpaper) values(?,?,?,?,?,?,?,?,?,?,?,?,?)
#end

#sql("addByGen")
insert into tm_paper(paper_name,adminid,departmentid,status,starttime,endtime,paper_minute,
total_score,remark,qorder,postdate,show_score, isranpaper) values (?,?,?,?,?,?,?,?,?,?,?,?,?)
#end

#sql("findById")
select * from tm_paper where id=?
#end

#sql("update")
update tm_paper set paper_name=?,status=?,starttime=?,endtime=?,paper_minute=?, remark =?,qorder =?,
show_score =?,isranpaper =?where id =?
#end

#sql("delete")
delete from tm_paper where id = ?
#end

#sql("loginDelete")
update tm_paper set status=9 where id = ?
#end

#sql("updateScore")
update tm_paper set total_score=? where id=?