package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.service.NewsService;
import com.coolshow.exam.service.impl.NewsServiceImpl;
import com.jfinal.core.Controller;

/**
 * Created by ouzj on 2017/7/18.
 */
public class NewsController extends Controller {
  private final NewsService service = Singleton.getInstance().getSingletonObject
      (NewsServiceImpl.class);

  public void test1() {
    Integer ints []=new Integer[2];
    ints[0]=1;
    ints[1]=2;
    Integer rows = 2;
    renderJson(service.findNewsLists(ints,rows));
  }

  public void test() {
    Integer ints []=new Integer[2];
    ints[0]=1;
    ints[1]=2;
    renderJson(service.test(ints));
  }
}
