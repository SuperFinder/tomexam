-- 查找全部
#define findAll(table,id)
SELECT *
FROM #(table)
#end
-- 根据id查找
#define findById(table,id)
SELECT *
FROM #(table)
WHERE id = #(id)
#end
-- 根据id删除
#define deleteById(table,id)
DELETE
FROM #(table)
WHERE id = #(id)
#end
-- Admin
#namespace("Admin")
#sql("findAll")
#@findAll("tm_admin")
#end
#sql("findById")
#@findById("tm_admin",id)
#end
#sql("deleteById")
#@deleteById("tm_admin",id)
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
logIntegerimes,lastlogin)values(?,?,?,?,?,?,?,?,0,?)
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
update tm_admin set lastlogin = ?,logIntegerimes=(logIntegerimes+1) where id = ?
#end

#end
-- AdminRole
#namespace("AdminRoles")
#sql("findAll")
#@findAll("tm_admin_roles")
#end
#sql("findById")
#@findById("tm_admin_roles",id)
#end
#sql("findById")
#@findById("tm_admin_roles",id)
#end

#end

#namespace("AdminRolesSettings")
#sql("findAll")
#@findAll("tm_admin_roles_settings")
#end


#end