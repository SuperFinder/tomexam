#sql("find")
select * from tm_admin_roles order by id desc
#end
#sql("add")
insert into tm_admin_roles(rolename, roleprivelege, remark, cdate) values(?,?,?,?)
#end
#sql("updateById")
update tm_admin_roles set rolename=?,roleprivelege=?,remark=? where id=?
#end
#sql("deleteById")
delete from tm_admin_roles where id = ?
#end