package com.coolshow.exam.service;

import java.util.List;

/**
 * Created by ouzj on 2017/7/13.
 */
public interface DepartmentService {
  /**
   * 获取全部部门
   *
   * @return
   */
  List findAll();


  /**
   * 获取全部部门名字,部门编码
   *
   * @return
   */
  List findDeptNameAndCode();
}
