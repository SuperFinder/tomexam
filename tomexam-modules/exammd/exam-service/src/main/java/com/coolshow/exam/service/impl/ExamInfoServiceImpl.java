package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.ExamInfo;
import com.coolshow.exam.service.ExamInfoService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class ExamInfoServiceImpl implements ExamInfoService {
  private static final ExamInfo dao = Singleton.getInstance().getSingletonObject(ExamInfo.class).dao();

  @Override
  public List analyze(Integer pid) {
    return dao.analyze(pid);
  }

  @Override
  public List examNum(Integer pid) {
    return dao.examNum(pid);
  }
}
