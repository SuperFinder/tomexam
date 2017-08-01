package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.User;
import com.coolshow.exam.service.UserService;
import com.coolshow.exam.service.impl.UserServiceImpl;
import com.jfinal.core.Controller;


public class UserController extends Controller {
  private static final UserService service = Singleton.getInstance().getSingletonObject
      (UserServiceImpl.class);

  private static final User user = Singleton.getInstance().getSingletonObject(User.class);

  public void index() {
    render("/register.html");
  }

  public void add() {
    String username = getPara("username");
    String deptCode = getPara("deptCode");
    Integer gid = getParaToInt("gid");
    String realName = getPara("realName");
    String email = getPara("email");
    String mobi = getPara("mobi");
    user.setUsername(username);
    user.setDeptCode(deptCode);
    user.setGid(gid);
    user.setRealname(realName);
    user.setEmail(email);
    user.setMobi(mobi);
    Integer result = service.add(user);
    renderText(String.valueOf(result));
  }
}
