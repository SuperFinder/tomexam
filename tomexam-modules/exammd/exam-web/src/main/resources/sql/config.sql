#sql("findAll")
select * from tm_config
#end
#sql("findById")
select * from tm_config where id = ?
#end
#sql("findByKey")
select * from tm_config where confkey = ?
#end