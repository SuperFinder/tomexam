#sql("add")
insert into tm_question_db(dname,checkself,remark,adminid,cdate,status,departmentid)
values(?,?,?,?,?,?,?)
#end

#sql("update")
update tm_question_db set dname=?,checkself=?,remark=?,status=? where id=?
#end

#sql("delete")
delete from tm_question_db where id = ?
#end

#sql("DbByCheck")
select * from tm_question_db where status=? and checkself='on' order by id desc
#end

#sql("DbByDept")
select * from tm_question_db where status=? and departmentid=? and checkself='on' order by id desc
#end

#sql("findDb")
select * from tm_question_db where status=? order by id desc
#end

#sql("findDbById")
select * from tm_question_db where id = ?
#end