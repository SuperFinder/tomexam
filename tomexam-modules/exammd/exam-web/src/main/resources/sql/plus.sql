#sql("add")
insert into tm_plus(pname,pdesc,photo,vurl,status,purl,cdate) values(?,?,?,?,?,?,? )
#end

#sql("update")
update tm_plus set pname=?,pdesc=?,photo=?,vurl=?,status=?,purl=? where id=?
#end

#sql("findById")
select * from tm_plus where id=?
#end

#sql("delete")
delete from tm_plus where id = ?
#end