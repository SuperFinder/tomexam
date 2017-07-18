package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.ExamInfo;
import com.coolshow.exam.service.ExamInfoService;
import com.coolshow.exam.service.impl.ExamInfoServiceImpl;
import com.jfinal.core.Controller;

import java.util.List;

/**
 * Created by ouzj on 2017/7/18.
 */
public class ExamInfoController extends Controller {
  private final ExamInfoService service = Singleton.getInstance().getSingletonObject
      (ExamInfoServiceImpl.class);

  public void examInfo() {
    Integer id = getParaToInt("id");
    renderJson(service.analyze(id));

  }

  public void examNum() {
    Integer id = getParaToInt("id");
    renderJson(service.examNum(id));
  }
}
