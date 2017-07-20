package com.coolshow.exam.service;

import com.coolshow.exam.model.Online;

import java.util.Date;
import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface OnlineService {

  /**
   * .
   *
   * @param uid 用户id
   * @return 获取在线状态
   */
  public List findById(Integer uid);


  /**
   * .
   *
   * @param minute 间隔时间
   * @return 获取试卷在线答题人数
   */
  //todo 系统更新时间
  public List onlineNum(Date datetime, Integer minute);

  /**
   * .
   *
   * @param pid    试卷id
   * @param minute 间隔时间
   * @return 在线的用户
   */
  public List onlineUsers(Integer pid, Date datetime, Integer minute);

  /**
   * .
   *
   * @param scmd
   * @param uid
   * @return 发送命令
   */
  public Integer sendCommand(String scmd, Integer uid);

  /**
   * .
   *
   * @param pid 试卷id
   * @param uid 用户id
   * @return 添加在线状态
   */
  public Integer updateLastTime(Date datetime, Integer pid, Integer uid);

  /**
   * .
   *
   * @param uid 用户id
   * @return 下线
   */
  public int delete(Integer uid) ;

  /**
   * .
   *
   * @param online online
   * @return 插入在线状态
   */
  public Integer add(Online online) ;

}
