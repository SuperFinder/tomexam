package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;
import com.coolshow.exam.service.impl.AdminServiceImpl;
import com.jfinal.core.Controller;

import java.util.List;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminController extends Controller {
  private final AdminService service = new AdminServiceImpl();

  public void findAll() {
    List<Admin> admins = service.findAll();
    renderJson(admins);
  }

  public void findById() {
    Integer id = getParaToInt("id");
    List<Admin> admins = service.findById(id);
    renderJson(admins);
  }

  public void findByDept() {
    String deptId = getPara("deptId");
    List<Admin> admins = service.findByDept(deptId);
    renderJson(admins);
  }

  public void findByName() {
    String username = getPara("username");
    List<Admin> admins = service.findByName(username);
    renderJson(admins);
  }

  public void findByPass() {
    String username = getPara("username");
    String password = getPara("password");
    List<Admin> admins = service.findByPass(username, password);
    renderJson(admins);
  }

  public void add() {
    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
    admin.setUsername(getPara("username"));
    admin.setDepartmentid(getPara("departmentId"));
    admin.setUserpass(getPara("password"));
    admin.setStatus(getPara("status"));
    admin.setRoleid(getParaToInt("roleId"));
    admin.setRealname(getPara("realName"));
    admin.setMobi(getPara("mobile"));
    admin.setRemark(getPara("remark"));
    Integer result = service.add(admin);
    renderJson(result);
  }

  public void addInSys() {
    String username = getPara("username");
    Integer roleId = getParaToInt("roleId");
    String status = getPara("status");
    Integer result = service.addInSys(username, roleId, status);
    renderJson(result);
  }

  public void updateAndPass() {
    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
    admin.setUserpass(getPara("password"));
    admin.setStatus(getPara("status"));
    admin.setRealname(getPara("realName"));
    admin.setMobi(getPara("mobile"));
    admin.setRemark(getPara("remark"));
    admin.setId(getParaToInt("id"));
  }
}
