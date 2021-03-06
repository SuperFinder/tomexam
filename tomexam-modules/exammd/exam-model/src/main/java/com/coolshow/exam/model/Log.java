package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseLog;
import com.jfinal.plugin.activerecord.Db;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Log extends BaseLog<Log> {
  private static final Log dao = Singleton.getInstance().getSingletonObject(Log.class);

  /**
   * @param log 日志
   * @return 添加日志
   */

  public Integer addLog(Log log) {
    return Db.update(getSql("log.add"), log.getLogtype(), log.getUsertype(), log.getUsername(),
        log.getUid(),log.getLogtime(),log.getIp(), log.getRemark());
  }
}
