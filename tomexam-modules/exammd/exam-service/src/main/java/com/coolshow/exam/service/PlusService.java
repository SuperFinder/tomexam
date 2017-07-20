package com.coolshow.exam.service;

import com.coolshow.exam.model.Plus;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface PlusService {

  Integer add(Plus plus);

  Integer update(Plus plus);

  List findById(Integer id);

  Integer delete(Integer id);
}
