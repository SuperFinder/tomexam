#sql("findById")
select * from tm_news where id = ?
#end
#sql("findNews")
select title,id,DATE_FORMAT(postdate,'%Y-%m-%d %h:%i %p') pdate
from tm_news order by id desc limit 0,?
#end
#sql("findNewsList")
select title,id,DATE_FORMAT(postdate,'%Y-%m-%d %h:%i %p') pdate from tm_news where classid= ?
order by id desc limit 0,?
#end
#sql("findNewsLists")
select title,id,DATE_FORMAT(postdate,'%Y-%m-%d %h:%i %p') pdate from tm_news where classId in
  #(for classId: classIds)
    #(for.index>0?",":"") #(classId)
  #end
    order by id desc limit 0,?
#end
#sql("add")
insert into tm_news(title,title_color,classid,content,status,summary,totop,visit,postdate,photo,
author,outlink,newsfrom,adminid) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)
#end
#sql("addVisit")
update tm_news set visit=(visit+1) where id=?
#end
#sql("update")
update tm_news set title=?,title_color=?,classid=?,content=?,status=?,summary=?,totop=?,visit=?,
photo=?,author=?,outlink=?,newsfrom=?,adminid=? where id=?
#end
#sql("delete")
delete from tm_news where id = ?
#end