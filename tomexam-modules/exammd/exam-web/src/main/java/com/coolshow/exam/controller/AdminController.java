package com.coolshow.exam.controller;

import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;
import com.coolshow.exam.service.impl.AdminServiceImpl;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

import java.util.List;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminController extends Controller {
  private final AdminService service = new AdminServiceImpl();

  public void getAdmins() {
    List<Admin> admins = service.getAdmins();
    renderJson(admins);
  }

}
