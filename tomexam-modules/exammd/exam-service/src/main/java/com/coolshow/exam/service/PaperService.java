package com.coolshow.exam.service;

import com.coolshow.exam.model.Paper;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface PaperService {

  /**
   * .
   *
   * @param paper 试卷
   * @return 添加试卷
   */
  Integer add(Paper paper);

  /**
   * .
   *
   * @param paper 试卷
   * @return 添加试卷和答案
   */
  Integer addByGen(Paper paper);

  /**
   * .
   *
   * @param id id
   * @return 根据id取试卷
   */
  List findById(Integer id);

  /**
   * .
   *
   * @param paper
   * @return 修改试卷
   */
  Integer update(Paper paper);

  /**
   * .
   *
   * @param id 删除试卷id
   * @return 删除试卷
   */
  Integer delete(Integer id);


  /**
   * .
   *
   * @param id 删除试卷id
   * @return 逻辑删除试卷
   */
  Integer loginDelete(Integer id);

  /**
   * .
   *
   * @param pid        试卷id
   * @param totalScore 试卷总分
   * @return
   */
  Integer updateScore(Integer totalScore, Integer pid);
}
