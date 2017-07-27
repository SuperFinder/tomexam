package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseUser;
import com.jfinal.plugin.activerecord.Db;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class User extends BaseUser<User> {
  private static final User dao = Singleton.getInstance().getSingletonObject(User.class).dao();

  public Integer add(User user) {
    return Db.update(getSql("user.add"), user.getUserno(), user.getDeptCode(), user.getUsername(),
        user.getUserpass(), user.getPhoto(), user.getStatus(), user.getRegdate(), user.getRealname(),
        user.getEmail(), user.getMobi(), user.getRemark(), user.getGid()
    );
  }
}
