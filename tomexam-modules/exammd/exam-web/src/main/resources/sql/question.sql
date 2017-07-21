#sql("addAndDept")
insert into tm_question(dbid,qtype,qlevel,qfrom,status,content,postdate,skey,keydesc,adminid,departmentid)
values(?,?,?,?,?,?,?,?,?,?,?)
#end

#sql("findInvoked")
SELECT * FROM tm_question WHERE id IN (SELECT DISTINCT qid FROM tm_paper_detail)
#end

#sql("add")
insert into tm_question(dbid,qtype,qlevel,qfrom,status,content,postdate,skey,keydesc,adminid)
values(?,?,?,?,?,?,?,?,?,?)
#end

#sql("findById")
select * from tm_question where id = ?
#end

#sql("update")
update tm_question set dbid=?,qtype=?,qlevel=?,qfrom=?,status=?,content=?,skey=?,keydesc=? where id=?
#end

#sql("findIsUse")
select paper_name,isranpaper from tm_paper where id in (select pid from tm_paper_detail where qid = ?)
#end

#sql("delete")
delete from tm_question where id = ?
#end

#sql("findByOther")
select * from tm_question where dbid=? and qtype=? and qlevel=? and status='1' order by rand() limit 0,?
#end

#sql("findByOtherNew")
select * from tm_question where dbid=? and qtype=? and qlevel=? order by rand() limit 0,?
#end
