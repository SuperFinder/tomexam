package com.coolshow.exam.controller;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.service.QuestionOptionsService;
import com.coolshow.exam.service.impl.QuestionOptionsServiceImpl;
import com.jfinal.core.Controller;

public class QuestionOptionsController extends Controller {
  private final QuestionOptionsService service = Singleton.getInstance().getSingletonObject
      (QuestionOptionsServiceImpl.class);

  public void addOptions() {
    renderJson(service.addOptions());
  }

  public void addOption() {
    renderJson(service.addOption());
  }
}
