package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseUserUsergroup;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class UserUsergroup extends BaseUserUsergroup<UserUsergroup> {
  public static final UserUsergroup dao = Singleton.getInstance().getSingletonObject
      (UserUsergroup.class);
}
