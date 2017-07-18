package com.coolshow.exam.route;

import com.coolshow.exam.controller.AdminController;
import com.coolshow.exam.controller.ExamInfoController;
import com.jfinal.config.Routes;

/**
 * Created by ouzj on 2017/7/14.
 */
public class MainRoute extends Routes {
  @Override
  public void config() {
    add("/admin", AdminController.class);
    add("/examInfo", ExamInfoController.class);
  }
}
