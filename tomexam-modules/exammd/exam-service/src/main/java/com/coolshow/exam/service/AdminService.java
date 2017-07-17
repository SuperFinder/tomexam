package com.coolshow.exam.service;

import com.coolshow.exam.model.Admin;

import java.util.List;

/**
 * Created by ouzj on 2017/7/7.
 */
public interface AdminService {
  public List findAll();

  public List findById(Integer id);

  public List findByDept(String deptId);

  public List findByName(String username);

  public List findByPass(String username, String password);

  public Integer add(Admin admin);

  public Integer addInSys(String username, Integer roleId, String status);

  public Integer updateAndPass(Admin admin);

}
