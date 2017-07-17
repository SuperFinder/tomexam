package com.coolshow.exam.service;

import com.coolshow.exam.model.AdminRoles;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface AdminRolesService {
  List findAll();
  List findById(Integer id);
  Integer add(AdminRoles adminRoles);
  Integer updateById(AdminRoles adminRoles);
  Integer deleteById(Integer id);
}
