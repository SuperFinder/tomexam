#sql("findById")
select * from tm_user_groups where id = ?
#end

#sql("findAll")
select * from tm_user_groups
#end

#sql("findIdAndName")
select id,groupname from tm_user_groups order by id desc
#end

