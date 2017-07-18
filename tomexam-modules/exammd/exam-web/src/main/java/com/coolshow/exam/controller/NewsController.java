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
    Integer ints[] ;
    ints = new Integer[3] ;
    ints[0] = 1 ;
    ints[1] = 2 ;
    ints[2] = 3 ;
    Integer rows = 2;
    service.findNewsLists(ints,rows);
  }
}
