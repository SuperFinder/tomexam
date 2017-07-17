package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.AdminRoles;
import com.coolshow.exam.service.AdminRolesService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class AdminRolesServiceImpl implements AdminRolesService{

  private static final AdminRoles dao = Singleton.getInstance().getSingletonObject(AdminRoles.class)
      .dao();
  @Override
  public List findAll() {
    return dao.findAll();
  }

  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }
//todo 系统更新时间
  @Override
  public Integer add(AdminRoles adminRoles) {
//    adminRoles.setCdate();
    return dao.add(adminRoles);
  }

  @Override
  public Integer updateById(AdminRoles adminRoles) {
    return dao.updateById(adminRoles);
  }

  @Override
  public Integer deleteById(Integer id) {
    return dao.deleteById(id);
  }
}
