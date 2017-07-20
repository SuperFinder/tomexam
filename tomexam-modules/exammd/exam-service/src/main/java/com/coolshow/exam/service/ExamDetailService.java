package com.coolshow.exam.service;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface ExamDetailService {
  /**
   * 考试详情
   *
   * @param pid
   * @return
   */
  List findDetail(Integer pid);
}
