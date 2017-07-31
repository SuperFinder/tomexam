package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Department;
import com.coolshow.exam.service.DepartmentService;
import com.coolshow.exam.service.impl.DepartmentServiceImpl;
import com.jfinal.core.Controller;

public class DepartmentController extends Controller {


  public void index() {
    DepartmentService service = Singleton.getInstance().getSingletonObject(DepartmentServiceImpl.class);
    Department dept = Singleton.getInstance().getSingletonObject(Department.class);
    setAttr("dept", dept);

  }
}
