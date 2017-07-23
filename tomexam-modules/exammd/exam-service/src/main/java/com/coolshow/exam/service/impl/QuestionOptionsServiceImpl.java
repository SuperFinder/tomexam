package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.QuestionOptions;
import com.coolshow.exam.service.QuestionOptionsService;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class QuestionOptionsServiceImpl implements QuestionOptionsService {
  private static final QuestionOptions dao = Singleton.getInstance().getSingletonObject
      (QuestionOptions.class).dao();

  @Override
  public int[] addOptions() {
    return dao.addOptions();
  }

  @Override
  public Integer addOption() {
    return dao.addOption();
  }
}
