#define testId(idList,rows)
select title,id,DATE_FORMAT(postdate,'%Y-%m-%d %h:%i %p') pdate from tm_news where classid in
(
#for (id : idList)
      #(for.index > 0 ? ", " : "") #(id)
   #end
   )
   order by id desc limit 0,#(rows)
#end

#sql("addOption")
insert into tm_question_options(salisa,qid,soption) values(?,?,?)
#end


#sql("addOptions")
#@testId(idList,rows)
#end

#sql("delete")
delete from tm_question_options where qid=?
#end

#sql("findById")
select * from tm_question_options where qid=? order by salisa asc
#end

#sql("findById") news
select * from tm_question_options where qid in (?) order by qid,salisa asc
#end
