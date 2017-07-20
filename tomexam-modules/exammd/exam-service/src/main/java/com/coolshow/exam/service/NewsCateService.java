package com.coolshow.exam.service;

import com.coolshow.exam.model.NewsCate;
import com.jfinal.plugin.activerecord.Db;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface NewsCateService {

  /**
   * .
   *
   * @param id id
   * @return 根据id获取新闻类别
   */
  public List findById(Integer id);

  /**
   * .
   *
   * @param parentid
   * @return
   */
  public List findByParentId(Integer parentid);

  /**
   * .
   *
   * @return 获取全部新闻类别
   */
  public List findAll();

  /**
   * .
   *
   * @param newsCate 新闻类别
   * @return 添加
   */
  public Integer add(NewsCate newsCate);

  /**
   * .
   *
   * @param newsCate 新闻类别
   * @return 修改新闻类别
   */
  public Integer update(NewsCate newsCate);


  /**
   * .
   *
   * @param id id
   * @return 根据id删除新闻类别
   */
  public Integer delete(Integer id);

}
