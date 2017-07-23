#sql("addOption")
insert into tm_question_options(salisa,qid,soption) values(?,?,?)
#end

#sql("delete")
delete from tm_question_options where qid=?
#end

#sql("findById")
select * from tm_question_options where qid=? order by salisa asc
#end

#sql("findInList")
select * from tm_question_options where qid in (?) order by qid,salisa asc
#end
