package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.News;
import com.coolshow.exam.service.NewsService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class NewsServiceImpl implements NewsService{
  private static final News dao = Singleton.getInstance().getSingletonObject(News.class).dao();

  /**
   * .
   *
   * @param id id
   * @return 根据id获取新闻
   */
  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }

  /**
   * @param rows 行
   * @return 获取新闻
   */
  @Override
  public List findNews(Integer rows) {
    return dao.findNews(rows);
  }

  /**
   * .
   *
   * @param classId 类别
   * @param rows    行
   * @return 获取某类新闻
   */
  @Override
  public List findNewsList(Integer classId, Integer rows) {
    return dao.findNewsList(classId,rows);
  }

  /**
   * .
   *
   * @param
//   * @param rows     行
   * @return 多选新闻
   */
  @Override
  public List findNewsLists() {
    return dao.findNewsLists();
  }

  @Override
  public List test(Integer pid) {
    return dao.test(pid);
  }

  /**
   * .
   *
   * @param news 新闻
   * @return 添加
   */
  @Override
  public Integer add(News news) {
    return dao.add(news);
  }

  /**
   * .
   *
   * @param id id
   * @return 添加观看新闻记录
   */
  @Override
  public Integer addVisit(Integer id) {
    return dao.addVisit(id);
  }

  /**
   * .
   *
   * @param news 新闻
   * @return 修改
   */
  @Override
  public Integer update(News news) {
    return dao.update(news);
  }

  /**
   * @param id id
   * @return 根据id删除新闻
   */
  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }
}
