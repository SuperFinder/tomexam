package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Paper;
import com.coolshow.exam.service.PaperService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class PaperServiceImpl implements PaperService {
  private static final Paper dao = Singleton.getInstance().getSingletonObject(Paper.class).dao();

  /**
   * .
   *
   * @param paper 试卷
   * @return 添加试卷
   */
  @Override
  public Integer add(Paper paper) {
    return dao.add(paper);
  }

  /**
   * .
   *
   * @param paper 试卷
   * @return 添加试卷和答案
   */
  @Override
  public Integer addByGen(Paper paper) {
    return dao.addByGen(paper);
  }

  /**
   * .
   *
   * @param id id
   * @return 根据id取试卷
   */
  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }

  /**
   * .
   *
   * @param paper
   * @return 修改试卷
   */
  @Override
  public Integer update(Paper paper) {
    return dao.update(paper);
  }

  /**
   * .
   *
   * @param id 删除试卷id
   * @return 删除试卷
   */
  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }

  /**
   * .
   *
   * @param id 删除试卷id
   * @return 逻辑删除试卷
   */
  @Override
  public Integer loginDelete(Integer id) {
    return dao.loginDelete(id);
  }

  /**
   * .
   *
   * @param totalScore 试卷总分
   * @param pid        试卷id
   * @return
   */
  @Override
  public Integer updateScore(Integer totalScore, Integer pid) {
    return dao.updateScore(totalScore, pid);
  }
}
