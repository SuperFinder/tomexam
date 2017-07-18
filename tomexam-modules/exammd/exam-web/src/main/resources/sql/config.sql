#sql("findAll")
select * from tm_config
#end
#sql("findByKey")
select * from tm_config where confkey = ?
#end
#sql("add")
insert into tm_config(confkey,confval,remark, id, cname) values(?,?,?,?,?)
#end
#sql("updateByConfigKey")
update tm_config set confval=? where confkey=?
#end
