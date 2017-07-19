package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseNews;
import com.jfinal.kit.JMap;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;

import java.util.List;
import java.util.Map;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class News extends BaseNews<News> {
  public static final News dao = Singleton.getInstance().getSingletonObject(News.class).dao();

  /**
   * .
   *
   * @param id id
   * @return 根据id获取新闻
   */
  public List findById(Integer id) {
    return dao.find(getSql("news.findById"), id);
  }

  /**
   * @param rows 行
   * @return 获取新闻
   */
  public List findNews(Integer rows) {
    return dao.find(getSql("news.findNews"), rows);
  }

  /**
   * .
   *
   * @param rows    行
   * @param classId 类别
   * @return 获取某类新闻
   */
  public List findNewsList(Integer classId, Integer rows) {
    return dao.find(getSql("news.findNewsList"), classId, rows);
  }

  /**
   * .
   *
//   * @param rows     行
   * @param classid id
   * @return 多选新闻
   */

  //todo 测试下
  public List findNewsLists(Integer[] classid) {
    Kv cond  = Kv.by("cond",1).set("cond1",2);
//    Kv cond =
    SqlPara sp =  getSqlPara("news.findNewsLists", Kv.by("cond",cond));
    return dao.find(sp);

  }

  public List test(Integer[] pid){
    Kv cond  = Kv.by("id",1);
    SqlPara sp =  getSqlPara("news.test", cond);
    Kv row = Kv.by("row",3);
    return dao.find(sp,row);
  }

  /**
   * .
   *
   * @param news 新闻
   * @return 添加
   */
  //todo 系统更新时间 postdate
  public Integer add(News news) {
    return Db.update(getSql("news.add"), news.getTitle(), news.getTitleColor(),
        news.getClassid(), news.getContent(), news.getStatus(), news.getSummary(), news.getTotop(),
        news.getVisit(), news.getPostdate(), news.getPhoto(), news.getAuthor(), news.getOutlink(),
        news.getNewsfrom(), news.getAdminid());
  }

  /**
   * .
   *
   * @param id id
   * @return 添加观看新闻记录
   */
  public Integer addVisit(Integer id) {
    return Db.update(getSql("news.addVisit"), id);
  }

  /**
   * .
   *
   * @param news 新闻
   * @return 修改
   */
  public Integer update(News news) {

    return Db.update(getSql("news.update"), news.getTitle(), news.getTitleColor(),
        news.getClassid(), news.getContent(), news.getStatus(), news.getSummary(), news.getTotop(),
        news.getVisit(), news.getPhoto(), news.getAuthor(), news.getOutlink(), news.getNewsfrom(),
        news.getAdminid(), news.getId());
  }


  /**
   * @param id id
   * @return 根据id删除新闻
   */
  public Integer delete(Integer id) {
    return Db.update(getSql("news.delete"), id);
  }

}
