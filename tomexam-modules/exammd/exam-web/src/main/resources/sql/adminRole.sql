#sql("findAll")
select * from tm_admin_roles order by id desc
#end
#sql("findById")
select * from tm_admin_roles where id = ?
#end
-- addAdminRole
#sql("add")
insert into tm_admin_roles(rolename, roleprivelege, remark, cdate) values(?,?,?,?)
#end
