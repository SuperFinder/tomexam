package com.coolshow.exam.service.impl;

import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;

import java.util.List;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminServiceImpl implements AdminService {
  private final Admin dao = new Admin().dao();

  @Override
  public List getAdmins() {
    return dao.getAdmins();
  }
}
