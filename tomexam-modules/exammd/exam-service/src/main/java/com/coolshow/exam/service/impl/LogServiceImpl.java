package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Log;
import com.coolshow.exam.service.LogService;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class LogServiceImpl implements LogService {
  private static final Log dao = Singleton.getInstance().getSingletonObject(Log.class).dao();

  /**
   * @param log 日志
   * @return 添加日志
   */
  @Override
  public Integer addLog(Log log) {
    return dao.addLog(log);
  }
}
