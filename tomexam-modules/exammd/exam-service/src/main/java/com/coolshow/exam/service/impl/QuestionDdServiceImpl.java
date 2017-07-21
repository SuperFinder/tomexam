package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.QuestionDb;
import com.coolshow.exam.service.QuestionDdService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class QuestionDdServiceImpl implements QuestionDdService {

  private static final QuestionDb dao = Singleton.getInstance().getSingletonObject(QuestionDb.class)
      .dao();

  @Override
  public Integer add(QuestionDb questionDb) {
    return dao.add(questionDb);
  }

  /**
   * .
   *
   * @param questionDb 问题库
   * @return 修改
   */
  @Override
  public Integer update(QuestionDb questionDb) {
    return dao.update(questionDb);
  }

  /**
   * .
   *
   * @param id id
   * @return 删除问题库
   */
  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }

  /**
   * .
   *
   * @param status 状态
   * @return 根据状态部门和自检获取问题库列表
   */
  @Override
  public List dbByCheck(String status) {
    return dao.dbByCheck(status);
  }

  /**
   * .
   *
   * @param status       状态
   * @param departmentId 部门id
   * @return 根据部门自获取问题库
   */
  @Override
  public List dbByDept(String status, String departmentId) {
    return dao.dbByDept(status, departmentId);
  }

  /**
   * .
   *
   * @param status 状态
   * @return 根据状态获取问题库
   */
  @Override
  public List findDb(String status) {
    return dao.findDb(status);
  }

  /**
   * .
   * @param id id
   * @return 根据id获取问题库
   */
  @Override
  public List findDbById(Integer id) {
    return null;
  }
}
