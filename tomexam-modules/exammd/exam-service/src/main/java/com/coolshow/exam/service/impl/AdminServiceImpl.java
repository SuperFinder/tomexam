package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;

import java.util.Date;
import java.util.List;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminServiceImpl implements AdminService {
  private static final Admin dao = Singleton.getInstance().getSingletonObject(Admin.class).dao();

  @Override
  public List findAll() {

    return dao.findAll();
  }

  @Override
  public List findById(Integer id) {
    return dao.findById(id);
  }

  @Override
  public List findByDept(String deptId) {
    return dao.findByDept(deptId);
  }

  @Override
  public List findByName(String username) {
    return dao.findByName(username);
  }

  @Override
  public List findByPass(String username, String password) {
    return dao.findByPass(username,password);
  }

  public Integer add(Admin admin){
    //todo 设置最后登录时间
//    admin.setLastlogin(Date);
    return dao.add(admin);
  }
  @Override
  public Integer addInSys(String username, Integer roleId, String status) {
    return dao.addInSys(username, roleId, status);
  }

  @Override
  public Integer updateAndPass(Admin admin) {

    return dao.updateAndPass(admin);
  }

  @Override
  public Integer updateNoPass(Admin admin) {
    return dao.updateNoPass(admin);
  }

  @Override
  public Integer updateInSys(Admin admin) {
    return dao.updateInSys(admin);
  }

  @Override
  public Integer updateLastLogin(Date lastLogin, Integer id) {
    return dao.updateLastLogin(lastLogin,id);
  }

  @Override
  public Integer deleteById(Integer id) {
    return dao.deleteById(id);
  }


}
