package com.coolshow.exam.service;

import com.coolshow.exam.model.QuestionDb;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface QuestionDdService {
  Integer add(QuestionDb questionDb);


  /**
   * .
   *
   * @param questionDb 问题库
   * @return 修改
   */
  Integer update(QuestionDb questionDb);

  /**
   * .
   *
   * @param id id
   * @return 删除问题库
   */
  Integer delete(Integer id);


  /**
   * .
   *
   * @param status 状态
   * @return 根据状态部门和自检获取问题库列表
   */

  List DbByCheck(String status);


  /**
   * .
   *
   * @param status       状态
   * @param departmentId 部门id
   * @return 根据部门自获取问题库
   */
  List DbByDept(String status, String departmentId);

  /**
   * .
   *
   * @param status 状态
   * @return 根据状态获取问题库
   */
  List findDb(String status);

  /**
   * 根据id获取问题库
   *
   * @param id
   * @return
   */
  List findDbById(Integer id);
}
