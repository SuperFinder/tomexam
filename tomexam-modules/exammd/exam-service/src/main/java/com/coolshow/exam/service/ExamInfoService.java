package com.coolshow.exam.service;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface ExamInfoService {
  /**
   * 依照试卷id，查出该试卷相关信息，分别是
   * 试卷本体详细信息
   * total_people  参考人数
   * pass_num   通过人数
   * not_pass_num  未通过人数
   * max_score   最高分
   * min_score   最低分
   * avg_score  平均分
   * pass_score   及格分数
   *
   * @param pid
   * @return
   */
  List analyze(Integer pid);

  List examNum(Integer pid);
}
