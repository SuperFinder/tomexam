package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Question;
import com.coolshow.exam.service.QuestionService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class QuestionServiceImpl implements QuestionService {
  private static final Question dao = Singleton.getInstance().getSingletonObject(Question.class)
      .dao();

  @Override
  public Integer addAndDept(Question question) {
    return dao.addAndDept(question);
  }

  /**
   * @return 查找所用启用的问题
   */
  @Override
  public List findInvoked() {
    return dao.findInvoked();
  }

  @Override
  public Integer add(Question question) {
    return dao.add(question);
  }

  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }

  @Override
  public List findByOther(Question question, Integer total) {
    return dao.findByOther(question, total);
  }

  @Override
  public Integer update(Question question) {
    return dao.update(question);
  }

  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }

  @Override
  public List findIsUse() {
    return dao.findIsUse();
  }

  @Override
  public List findByOtherNew(Question question, Integer total) {
    return dao.findByOtherNew(question, total);
  }
}
