package com.coolshow.exam.route;

import com.coolshow.exam.controller.AdminController;
import com.jfinal.config.Routes;

/**
 * Created by ouzj on 2017/7/14.
 */
public class AdminRoute extends Routes {
  @Override
  public void config() {
    add("/admin", AdminController.class);
  }
}
