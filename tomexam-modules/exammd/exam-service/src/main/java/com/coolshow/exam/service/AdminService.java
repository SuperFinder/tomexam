package com.coolshow.exam.service;

import com.coolshow.exam.model.Admin;

import java.util.Date;
import java.util.List;

/**
 * Created by ouzj on 2017/7/7.
 */
public interface AdminService {
  List findAll();

  List findById(Integer id);

  List findByDept(String deptId);

  List findByName(String username);

  List findByPass(String username, String password);

  Integer add(Admin admin);

  Integer addInSys(String username, Integer roleId, String status);

  Integer updateAndPass(Admin admin);

  Integer updateNoPass(Admin admin);

  Integer updateInSys(Admin admin);

  Integer updateLastLogin(Date lastLogin, Integer id);

  Integer deleteById(Integer id);
}
