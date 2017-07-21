package com.coolshow.exam.service;

import com.coolshow.exam.model.Question;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface QuestionService {
  public Integer addAndDept(Question question);

  /**
   * @return 查找所用启用的问题
   */
  List findInvoked();

  //todo 系统时间
  Integer add(Question question);


  List findById(Integer id);

  List findByOther(Question question, Integer total);

  Integer update(Question question);


  Integer delete(Integer id);

  List findIsUse();

  List findByOtherNew(Question question, Integer total);
}
