package com.coolshow.exam.service;

import java.util.Date;
import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface QuestionCollectionService {
  Integer add(Integer qid, Integer uid, Date cDate, Integer did);

  List findById(Integer did);

  Integer delete(Integer id);

  List find(String uid);
}
