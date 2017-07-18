#sql("findAll")
SELECT * FROM tm_admin
#end
#sql("findById")
select * from tm_admin WHERE id =?
#end
#sql("findByDept")
select * from tm_admin where departmentid=?
#end
#sql("findByName")
select * from tm_admin where username=? and status=?
#end
#sql("findByPass")
select * from tm_admin where username = ? and userpass = ?
#end
#sql("add")
insert into tm_admin(username,departmentid,userpass,status,roleid,realname,mobi,remark,
logintimes,lastlogin)values(?,?,?,?,?,?,?,?,0,?)
#end
#sql("addInSys")
insert into tm_admin (username,roleid,status) values (?,?,?)
#end
#sql("updateAndPass")
update tm_admin set userpass=?,status=?,roleid=?,realname=?,mobi=?,remark=? where id=?
#end
#sql("updateNoPass")
update tm_admin set status = ?, roleid = ?, realname = ?, mobi = ? , remark = ?where id = ?
#end
#sql("updateInSys")
update tm_admin set status = ?, roleid = ?, remark = ? where id = ?
#end
#sql("updateLastLogin")
update tm_admin set lastlogin = ?,logintimes=(logintimes+1) where id = ?
#end
#sql("deleteById")
DELETE FROM tm_admin WHERE id = ?
#end
