package com.coolshow.exam.service;

import com.coolshow.exam.model.Log;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface LogService {
  /**
   * @param log 日志
   * @return 添加日志
   */
  Integer addLog(Log log) ;
}
