package com.coolshow.exam.service;

import com.coolshow.exam.model.Plus;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface PlusService {

  public int add(Plus plus);

  public int update(Plus plus);

  public List findById(int id);

  public int delete(int id);
}
