package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BasePaperUsergroup;
import com.jfinal.plugin.activerecord.Db;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class PaperUsergroup extends BasePaperUsergroup<PaperUsergroup> {
  public static final PaperUsergroup dao = Singleton.getInstance().getSingletonObject
      (PaperUsergroup.class);

  /**
   * 删除试卷用户组
   *
   * @param pid
   * @return
   */
  public Integer deletePaperUserGroup(Integer pid) {
    String sql = "delete from tm_paper_usergroup where paperid=?";
    return Db.update(sql, pid);
  }

  /**
   * 添加试卷用户组
   *
   * @param pid
   * @param gid
   * @return
   */
  public Integer addPaperUserGroup(Integer pid, String gid) {
    String sql = "insert into tm_paper_usergroup(paperid,usergroupid) values(?,?)";
    return Db.update(sql, pid, gid);
  }

  /**
   * 获取试卷组id
   *
   * @param pid
   * @return
   */
  public List getPaperGroupIds(Integer pid) {
    String sql = "select usergroupid from tm_paper_usergroup where paperid=?";
    return dao.find(sql, pid);
  }

}
