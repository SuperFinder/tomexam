package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.AdminRolesSettings;
import com.coolshow.exam.service.AdminRoleSettingsService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class AdminRolesSettingsServiceImpl implements AdminRoleSettingsService{
  private static final AdminRolesSettings dao = Singleton.getInstance().getSingletonObject(AdminRolesSettings.class).dao();
  @Override
  public List findAll() {
    return dao.findAll();
  }

  @Override
  public List findByP(Integer ptype) {
    return dao.findByP(ptype);
  }
}
