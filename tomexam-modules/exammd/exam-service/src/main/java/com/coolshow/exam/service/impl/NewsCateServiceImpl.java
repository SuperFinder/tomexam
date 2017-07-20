package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.NewsCate;
import com.coolshow.exam.service.NewsCateService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class NewsCateServiceImpl implements NewsCateService{

  private static final NewsCate dao = Singleton.getInstance().getSingletonObject(NewsCate.class)
      .dao();
  /**
   * .
   *
   * @param id id
   * @return 根据id获取新闻类别
   */
  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }

  /**
   * .
   *
   * @param parentid
   * @return
   */
  @Override
  public List findByParentId(Integer parentid) {
    return dao.findByParentId(parentid);
  }

  /**
   * .
   *
   * @return 获取全部新闻类别
   */
  @Override
  public List findAll() {
    return dao.findAll();
  }

  /**
   * .
   *
   * @param newsCate 新闻类别
   * @return 添加
   */
  @Override
  public Integer add(NewsCate newsCate) {
    return dao.add(newsCate);
  }

  /**
   * .
   *
   * @param newsCate 新闻类别
   * @return 修改新闻类别
   */
  @Override
  public Integer update(NewsCate newsCate) {
    return dao.update(newsCate);
  }

  /**
   * .
   *
   * @param id id
   * @return 根据id删除新闻类别
   */
  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }
}
