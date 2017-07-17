package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.ExamDetail;
import com.coolshow.exam.service.ExamDetailService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class ExamDetailServiceImpl implements ExamDetailService {
  private static final ExamDetail dao = Singleton.getInstance().getSingletonObject
      (ExamDetail.class).dao();

  /**
   * 考试详情
   *
   * @param pid
   * @return
   */
  @Override
  public List examDetail(Integer pid) {
    return null;
  }
}
