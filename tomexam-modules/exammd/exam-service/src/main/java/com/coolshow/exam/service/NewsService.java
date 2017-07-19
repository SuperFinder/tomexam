package com.coolshow.exam.service;

import com.coolshow.exam.model.News;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface NewsService {
  /**
   * .
   *
   * @param id id
   * @return 根据id获取新闻
   */
  public List findById(Integer id);

  /**
   * @param rows 行
   * @return 获取新闻
   */
  public List findNews(Integer rows);

  /**
   * .
   *
   * @param rows    行
   * @param classId 类别
   * @return 获取某类新闻
   */
  public List findNewsList(Integer classId, Integer rows);

  /**
   * .
   *
//   * @param rows     行
   * @param id id
   * @return 多选新闻
   */

  //todo 测试下
  public List findNewsLists(Integer[] id,Integer row);

  public List test(Integer[] pid);

  /**
   * .
   *
   * @param news 新闻
   * @return 添加
   */
  //todo 系统更新时间 postdate
  public Integer add(News news);

  /**
   * .
   *
   * @param id id
   * @return 添加观看新闻记录
   */
  public Integer addVisit(Integer id);

  /**
   * .
   *
   * @param news 新闻
   * @return 修改
   */
  public Integer update(News news);


  /**
   * @param id id
   * @return 根据id删除新闻
   */
  public Integer delete(Integer id);
}
