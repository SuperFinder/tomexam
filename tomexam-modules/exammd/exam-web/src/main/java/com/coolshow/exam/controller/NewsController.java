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
    Integer ints [] =getParaValuesToInt("classId");
    Integer rows = getParaToInt("rows");
    renderJson(service.findNewsLists(ints,rows));
  }

}
