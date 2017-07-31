package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Department;
import com.coolshow.exam.service.DepartmentService;

import java.util.List;

/**
 * Created by ouzj on 2017/7/13.
 */
public class DepartmentServiceImpl implements DepartmentService {
  private static final Department dao = Singleton.getInstance().getSingletonObject
      (Department.class).dao();

  /**
   * 获取全部部门
   *
   * @return
   */
  @Override
  public List findAll() {
    return dao.findAll();
  }

  /**
   * 获取全部部门名字,部门编码
   *
   * @return
   */
  @Override
  public List findDeptNameAndCode() {
    return dao.findDeptNameAndCode();
  }
}
