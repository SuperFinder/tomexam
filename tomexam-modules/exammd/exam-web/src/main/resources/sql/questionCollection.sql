#sql("findById")
select * from tm_question_collection where detailid=?
#end

#sql("add")
insert into tm_question_collection(qid,uid,cdate,detailid) values(?,?,?,?)
#end

#sql("delete")
delete from tm_question_collection where id=?
#end

#sql("find")
select tq.* from tm_question_collection tc left join tm_question tq on tc.qid = tq.id where tc.uid = ?
#end