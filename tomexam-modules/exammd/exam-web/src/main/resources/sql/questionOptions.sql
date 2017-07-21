#define addList(qid,options)
  #for(sOption : options)
    #(for.index == 0 ? "" : "; ")
      insert into tm_question_options(salisa,qid,soption) values('A',#(qid),'#(sOption)')
  #end
#end
#sql("addOption")
insert into tm_question_options(salisa,qid,soption) values(?,?,?)
#end

#sql("addOptions")
#@addList(qid,options)
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
