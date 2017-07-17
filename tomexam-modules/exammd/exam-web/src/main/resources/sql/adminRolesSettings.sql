#sql("findAll")
select * from tm_admin_roles_settings order by porder asc, id asc
#end
#sql("findByP")
select * from tm_admin_roles_settings where ptype=? order by porder asc, id asc
#end