package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Admin;
import com.coolshow.exam.service.AdminService;
import com.coolshow.exam.service.impl.AdminServiceImpl;
import com.jfinal.core.Controller;

import java.util.Date;
import java.util.List;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminController extends Controller {
  private final AdminService service = Singleton.getInstance().getSingletonObject(AdminServiceImpl.class);

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
//    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
//    admin.setStatus(getPara("status"));
//    admin.setRealname(getPara("realName"));
//    admin.setMobi(getPara("mobile"));
//    admin.setRemark(getPara("remark"));
    Admin admin = update();
    admin.setUsername(getPara("username"));
    admin.setDepartmentid(getPara("departmentId"));
    admin.setUserpass(getPara("password"));
    admin.setRoleid(getParaToInt("roleId"));
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
//    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
//    admin.setStatus(getPara("status"));
//    admin.setRealname(getPara("realName"));
//    admin.setMobi(getPara("mobile"));
//    admin.setRemark(getPara("remark"));
    Admin admin = update();
    admin.setUserpass(getPara("password"));
    admin.setId(getParaToInt("id"));
    Integer result = service.updateAndPass(admin);
    renderJson(result);
  }

  public void updateNoPass() {
//    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
//    admin.setStatus(getPara("status"));
//    admin.setRealname(getPara("realName"));
//    admin.setMobi(getPara("mobile"));
//    admin.setRemark(getPara("remark"));
    Admin admin = update();
    admin.setId(getParaToInt("id"));
    Integer result = service.updateNoPass(admin);
    renderJson(result);
  }

  public void updateInSys() {
    Admin admin = Singleton.getInstance().getSingletonObject(Admin.class);
    admin.setStatus(getPara("status"));
    admin.setRoleid(getParaToInt("roleId"));
    admin.setRemark(getPara("remark"));
    admin.setId(getParaToInt("id"));
    Integer result = service.updateInSys(admin);
    renderJson(result);
  }

  public void updateLastLogin() {
    Date lastLogin = getParaToDate("lastLogin");
    Integer id = getParaToInt("id");
    Integer result = service.updateLastLogin(lastLogin, id);
    renderJson(result);
  }

  public void deleteById() {
    Integer id = getParaToInt("id");
    Integer result = service.deleteById(id);
    renderJson(result);
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
