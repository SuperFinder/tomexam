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
  public void test (){
    Integer ints= getParaToInt("id") ;
//    Integer rows = 2;
    renderJson(service.findNewsLists(ints));
  }
  public void test1(){
    Integer id =  getParaToInt("id");
    renderJson(service.test(id));
  }
}
