#sql("findById")
select * from tm_news_cate where id = ?
#end

#sql("findByParentId")
select * from tm_news_cate where parentid = ? order by id desc
#end

#sql("findAll")
select * from tm_news_cate order by id desc
#end

#sql("add")
insert into tm_news_cate(cname,parentid,adminid,orderid,remark) values(?,?,?,?,?)
#end

#sql("update")
update tm_news_cate set cname=?,parentid=?,adminid=?,orderid=?,remark=? where id=?
#end

#sql("delete")
delete from tm_news_cate where id = ?
#end