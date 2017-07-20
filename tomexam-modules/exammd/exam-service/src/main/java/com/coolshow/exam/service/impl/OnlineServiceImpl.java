package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Online;
import com.coolshow.exam.service.OnlineService;

import java.util.Date;
import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class OnlineServiceImpl implements OnlineService {
  private static final Online dao = Singleton.getInstance().getSingletonObject(Online.class).dao();

  /**
   * .
   *
   * @param uid 用户id
   * @return 获取在线状态
   */
  @Override
  public List findById(Integer uid) {
    return dao.findById(uid);
  }

  /**
   * .
   *
   * @param datetime 系统时间
   * @param minute   间隔时间
   * @return 获取试卷在线答题人数
   */
  @Override
  public List onlineNum(Date datetime, Integer minute) {
    return dao.onlineNum(datetime, minute);
  }

  /**
   * .
   *
   * @param pid      试卷id
   * @param datetime
   * @param minute   间隔时间  @return 在线的用户
   */
  @Override
  public List onlineUsers(Integer pid, Date datetime, Integer minute) {
    return dao.onlineUsers(pid, datetime, minute);
  }

  /**
   * .
   *
   * @param scmd 命令
   * @param uid  用户id
   * @return 发送命令
   */
  @Override
  public Integer sendCommand(String scmd, Integer uid) {
    return dao.sendCommand(scmd, uid);
  }

  /**
   * .
   *
   * @param datetime 时间
   * @param pid      试卷id
   * @param uid      用户id
   * @return 添加在线状态
   */
  @Override
  public Integer updateLastTime(Date datetime, Integer pid, Integer uid) {
    return dao.updateLastTime(datetime, pid, uid);
  }

  /**
   * .
   *
   * @param uid 用户id
   * @return 下线
   */
  @Override
  public int delete(Integer uid) {
    return dao.delete(uid);
  }

  /**
   * .
   *
   * @param online online
   * @return 插入在线状态
   */
  @Override
  public Integer add(Online online) {
    return dao.add(online);
  }
}
