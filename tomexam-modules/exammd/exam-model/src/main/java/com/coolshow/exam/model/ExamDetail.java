package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseExamDetail;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ExamDetail extends BaseExamDetail<ExamDetail> {
  private static final ExamDetail dao = Singleton.getInstance().getSingletonObject(ExamDetail.class);

  /**
   * .
   * 依据pid算出每道题统计信息
   * qid   问题ID
   * totalnum   所有人对当前卷当前题的总回答总次数
   * mnum       所有人对当前卷当前题的得分总次数
   * tpercent   本试卷本题的得分率
   *
   * @param pid 问题ID
   * @return
   */
  public List findDetail(Integer pid) {
    return dao.find(getSql("examDetail.findDetail"), pid);
  }
}
