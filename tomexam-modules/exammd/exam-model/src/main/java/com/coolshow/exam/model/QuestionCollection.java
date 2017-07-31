package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseQuestionCollection;
import com.jfinal.plugin.activerecord.Db;

import java.util.Date;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class QuestionCollection extends BaseQuestionCollection<QuestionCollection> {
  public static final QuestionCollection dao = Singleton.getInstance().getSingletonObject
      (QuestionCollection.class);

  //todo 系统时间
  public Integer add(Integer qid, Integer uid, Date cDate, Integer did) {

    return Db.update(getSql("questionCollection.add"), qid, uid, cDate, did);
  }

  public List findById(Integer did) {
    return dao.find(getSql("questionCollection.findById"), did);
  }

  public Integer delete(Integer id) {
    return Db.update(getSql("questionCollection.delete"), id);
  }

  public List find(String uid) {
    return dao.find(getSql("questionCollection.find"), uid);
  }
}
