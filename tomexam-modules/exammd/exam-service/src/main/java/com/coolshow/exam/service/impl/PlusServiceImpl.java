package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Plus;
import com.coolshow.exam.service.PlusService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class PlusServiceImpl implements PlusService {
  private static final Plus dao = Singleton.getInstance().getSingletonObject(Plus.class).dao();

  @Override
  public int add(Plus plus) {
    return dao.add(plus);
  }

  @Override
  public int update(Plus plus) {
    return dao.update(plus);
  }

  @Override
  public List findById(int id) {
    return dao.findById(id);
  }

  @Override
  public int delete(int id) {
    return dao.delete(id);
  }
}
