package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.User;
import com.coolshow.exam.service.UserService;

/**
 * Created by ouzj on 2017/7/13.
 */
public class UserServiceImpl implements UserService {
  private static final User dao = Singleton.getInstance().getSingletonObject(User.class);

  @Override
  public Integer add(User user) {
    return dao.add(user);
  }
}
