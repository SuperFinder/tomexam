package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.QuestionCollection;
import com.coolshow.exam.service.QuestionCollectionService;

import java.util.Date;
import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class QuestionCollectionServiceImpl implements QuestionCollectionService {
  public static final QuestionCollection dao = Singleton.getInstance().getSingletonObject
      (QuestionCollection.class).dao();
  @Override
  public Integer add(Integer qid, Integer uid, Date cDate, Integer did) {
    return dao.add(qid, uid, cDate, did);
  }

  @Override
  public List findById(Integer did) {
    return dao.findById(did);
  }

  @Override
  public Integer delete(Integer id) {
    return dao.delete(id);
  }

  @Override
  public List find(String uid) {
    return dao.find(uid);
  }
}
