package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseAdmin;
import com.jfinal.plugin.activerecord.Db;

import java.util.Date;
import java.util.List;


/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Admin extends BaseAdmin<Admin> {
  public static final Admin dao = Singleton.getInstance().getSingletonObject(Admin.class);

  /**
   * .
   *
   * @return 返回管理员列表
   */
  public List findAll() {
    return dao.find(getSql("admin.findAll"));

  }

  /**
   * .
   *
   * @param deptId 部门id
   * @return 部门列表
   */

  public List findByDept(String deptId) {

    return dao.find(getSql("admin.findByDept"), deptId);
  }

  /**
   * .
   *
   * @param id 管理员id
   * @return 某管理员
   */
  public List findById(Integer id) {

    return dao.find(getSql("admin.findById"), id);
  }


  /**
   * .
   *
   * @param username 用户名
   * @return 某管理员
   */
  public List findByName(String username) {

    return dao.find(getSql("admin.findByName"), username, "1");
  }

  /**
   * .
   *
   * @param username 用户名
   * @param password 用户密码
   * @return 某管理员
   */
  public List findByPass(String username, String password) {

    return dao.find(getSql("admin.findByPass"), username, password);
  }

  /**
   * .
   *
   * @param admin
   * @return 增加管理员
   */
  public Integer add(Admin admin) {
    return Db.update(getSql("admin.add"), admin.getUsername(), admin.getDepartmentid(),
        admin.getUserpass(), admin.getStatus(), admin.getRoleid(), admin.getRealname(),
        admin.getMobi(), admin.getRemark(), admin.getLastlogin());
  }

  /***
   * @param username 用户名
   * @param roleId 权限id
   * @param status 状态
   * @return 添加管理员
   */
  public Integer addInSys(String username, Integer roleId, String status) {
    return Db.update(getSql("admin.addInSys"), username, roleId, status);
  }


  /**
   * @param admin 管理员
   * @return 修改管理员包括密码
   */
  public Integer updateAndPass(Admin admin) {
    return Db.update(getSql("admin.updateAndPass"), admin.getUserpass(), admin.getStatus(),
        admin.getRoleid(), admin.getRealname(), admin.getMobi(), admin.getRemark(), admin.getId());
  }

  /**
   * .
   *
   * @param admin 管理员
   * @return 修改管理员，不改密码
   */
  public Integer updateNoPass(Admin admin) {
    return Db.update(getSql("admin.updateNoPass"), admin.getStatus(), admin.getRoleid(),
        admin.getRealname(), admin.getMobi(), admin.getRemark(), admin.getId());
  }


  /**
   * @param admin 管理员
   * @return 管理员下添加管理员
   */
  public Integer updateInSys(Admin admin) {
    return Db.update(getSql("admin.updateInSys"), admin.getStatus(), admin.getRoleid(),
        admin.getRemark(), admin.getId());
  }


  /**
   * 修改上次登陆时间和总登录次数
   *
   * @param id
   * @return
   * @throws Exception
   */
  public Integer updateLastLogin(Date lastLogin, Integer id) {
    //todo lastlogin
    return Db.update(getSql("admin.updateLastLogin"), lastLogin, id);
  }


  /**
   * .
   *
   * @param id ID
   * @return 依照id删除管理员
   */
  public Integer deleteById(Integer id) {

    return Db.update(getSql("admin.deleteById"), id);
  }

}
