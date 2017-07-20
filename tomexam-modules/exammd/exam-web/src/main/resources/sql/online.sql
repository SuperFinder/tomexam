#sql("findById")
select * from tm_online where uid=?
#end

#sql("onlineNum")
select pid,count(*) total_on from tm_online where lasttime>date_add(?, interval ? minute) group by pid
#end

#sql("onlineUsers")
select t.*,tu.username,tu.realname,tu.photo from tm_online t left join tm_user tu on t.uid=tu.id
where t.pid=? and t.lasttime>date_add(?, interval ? minute)
#end

#sql("sendCommand")
update tm_online set exta=? where uid=?
#end

#sql("updateLastTime")
update tm_online set lasttime=?,pid=? where uid=?
#end

#sql("delete")
delete from tm_online where uid=?
#end

#sql("add")
insert into tm_online(uid,pid,lasttime,exta,ip) values(?,?,?,?,?)
#end