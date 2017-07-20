package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseAdminRoles;
import com.jfinal.plugin.activerecord.Db;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class AdminRoles extends BaseAdminRoles<AdminRoles> {
  private static final AdminRoles dao = Singleton.getInstance().getSingletonObject(AdminRoles.class)
      .dao();


  /**
   * .
   *
   * @return 获取管理员列表
   */
  public List findAll() {
    return dao.find(getSql("adminRoles.findAll"));
  }

  /**
   * .
   *
   * @return 依ID获取一个管理员角色
   */
  public List findById(Integer id) {
    return dao.find(getSql("adminRoles.findById"), id);

  }

  /**
   * .
   *
   * @param adminRoles 管理权限
   * @return 添加管理权限
   */
  //todo 系统更新时间 cDate
  public Integer add(AdminRoles adminRoles) {

    return Db.update(getSql("adminRoles.add"), adminRoles.getRolename(),
        adminRoles.getRoleprivelege(), adminRoles.getRemark(), adminRoles.getCdate());
  }

  /**
   * .
   *
   * @param adminRoles
   * @return 依ID修改管理员角色
   */

  public Integer updateById(AdminRoles adminRoles) {
    return Db.update(getSql("adminRoles.updateById"), adminRoles.getRolename(),
        adminRoles.getRoleprivelege(), adminRoles.getRemark(), adminRoles.getId());
  }

  /**
   * .
   *
   * @param id ID
   * @return 依ID删除管理员角色
   */
  public Integer deleteById(Integer id) {
    return Db.update(getSql("adminRoles.deleteById"), id);
  }

}
