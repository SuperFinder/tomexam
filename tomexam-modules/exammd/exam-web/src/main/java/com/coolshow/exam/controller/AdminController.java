package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;
import com.coolshow.exam.service.impl.AdminServiceImpl;
import com.jfinal.core.Controller;

import java.util.Date;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminController extends Controller {
  private final AdminService service = Singleton.getInstance().getSingletonObject(AdminServiceImpl.class);

  public void findAll() {
    renderJson(service.findAll());
  }

  public void findById() {
    Integer id = getParaToInt("id");
    renderJson(service.findById(id));
  }

  public void findByDept() {
    String deptId = getPara("deptId");
    renderJson(service.findByDept(deptId));
  }

  public void findByName() {
    String username = getPara("username");
    renderJson(service.findByName(username));
  }

  public void findByPass() {
    String username = getPara("username");
    String password = getPara("password");
    renderJson(service.findByPass(username, password));
  }

  public void add() {
    Admin admin = update();
    admin.setUsername(getPara("username"));
    admin.setDepartmentid(getPara("departmentId"));
    admin.setUserpass(getPara("password"));
    admin.setRoleid(getParaToInt("roleId"));
    renderJson(service.add(admin));
  }

  public void addInSys() {
    String username = getPara("username");
    Integer roleId = getParaToInt("roleId");
    String status = getPara("status");
    renderJson(service.addInSys(username, roleId, status));
  }

  public void updateAndPass() {
//    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
//    admin.setStatus(getPara("status"));
//    admin.setRealname(getPara("realName"));
//    admin.setMobi(getPara("mobile"));
//    admin.setRemark(getPara("remark"));
    Admin admin = update();
    admin.setUserpass(getPara("password"));
    admin.setId(getParaToInt("id"));
    renderJson(service.updateAndPass(admin));
  }

  public void updateNoPass() {
//    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
//    admin.setStatus(getPara("status"));
//    admin.setRealname(getPara("realName"));
//    admin.setMobi(getPara("mobile"));
//    admin.setRemark(getPara("remark"));
    Admin admin = update();
    admin.setId(getParaToInt("id"));
    renderJson(service.updateNoPass(admin));
  }

  public void updateInSys() {
    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
    admin.setStatus(getPara("status"));
    admin.setRoleid(getParaToInt("roleId"));
    admin.setRemark(getPara("remark"));
    admin.setId(getParaToInt("id"));
    renderJson(service.updateInSys(admin));
  }

  public void updateLastLogin() {
    Date lastLogin = getParaToDate("lastLogin");
    Integer id = getParaToInt("id");
    renderJson(service.updateLastLogin(lastLogin, id));
  }

  public void deleteById() {
    Integer id = getParaToInt("id");
    renderJson(service.deleteById(id));
  }

  private Admin update() {
    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
    admin.setStatus(getPara("status"));
    admin.setRealname(getPara("realName"));
    admin.setMobi(getPara("mobile"));
    admin.setRemark(getPara("remark"));
    return admin;
  }


}
