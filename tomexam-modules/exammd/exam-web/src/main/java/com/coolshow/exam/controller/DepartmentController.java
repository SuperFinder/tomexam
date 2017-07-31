package com.coolshow.exam.controller;

import com.coolshow.exam.model.Department;
import com.jfinal.core.Controller;

public class DepartmentController extends Controller {

  public void xx() {
    String deptCode = "900001";
    Department deptName = Department.dao.findById(deptCode);
    setAttr("deptName", deptName);
    render("/WEB-INF/page/admin/admin_groups_list.html");
  }
}
