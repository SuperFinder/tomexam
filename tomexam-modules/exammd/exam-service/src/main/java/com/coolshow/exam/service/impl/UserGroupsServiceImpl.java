package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.UserGroups;
import com.coolshow.exam.service.UserGroupsService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class UserGroupsServiceImpl implements UserGroupsService {

  private static final UserGroups dao = Singleton.getInstance().getSingletonObject(UserGroups.class)
      .dao();

  /**
   * .
   *
   * @param groupId 集团id
   * @return 根据部门ID获取部门
   */
  @Override
  public List findById(Integer groupId) {
    return dao.findById(groupId);
  }

  /**
   * .
   *
   * @return 获取全部集团
   */
  @Override
  public List findAll() {
    return dao.findAll();
  }

  /**
   * .
   *
   * @return 获取全部集团名字和编码
   */
  @Override
  public List findIdAndName() {
    return dao.findIdAndName();
  }
}
