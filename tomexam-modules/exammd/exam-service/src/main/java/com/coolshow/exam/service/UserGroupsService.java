package com.coolshow.exam.service;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface UserGroupsService {
  /**
   *.
   * @param groupId 集团id
   * @return 根据部门ID获取部门
   */
  List findById(Integer groupId);

  /**
   *.
   * @return 获取全部集团
   */
  List findAll();

  /**
   *.
   * @return 获取全部集团名字和编码
   */
  List findIdAndName();

}
