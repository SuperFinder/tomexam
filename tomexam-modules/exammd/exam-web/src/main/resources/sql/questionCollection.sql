#sql("findById")
select * from tm_question_collection where detailid=?
#end

#sql("add")
insert into tm_question_collection(qid,uid,cdate,detailid) values(?,?,?,?)
#end

#sql("delete")
delete from tm_question_collection where id=?
#end

