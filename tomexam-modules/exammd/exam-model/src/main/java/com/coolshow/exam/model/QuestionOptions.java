package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseQuestionOptions;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;

import java.util.Arrays;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class QuestionOptions extends BaseQuestionOptions<QuestionOptions> {
  private static final QuestionOptions dao = Singleton.getInstance().getSingletonObject
      (QuestionOptions.class).dao();

  public Integer addOption() {
    String salisa = "A";
    Integer qid = 9889;
    String soption = "fuck";
    return Db.update(getSql("questionOptions.addOption"), salisa, qid, soption);
  }

  //  Integer qid, List<String> listOfOptions
  public int[] addOptions() {
    Integer qid = 8888;
    List<String> listOfOptions = Arrays.asList("aaa", "bbb", "ccc", "ddd");
    //String listOfOptions ="1234";
    SqlPara sqlPara = Db.getSqlPara("questionOptions.addOptions", Kv.by("qid", qid).set("options", listOfOptions));
    return Db.batch(get("questionOptions.addOptions"), 12);
    //
  }

  public Integer delete(Integer qid) {
    return Db.update(getSql("questionOptions.delete"), qid);
  }

  public List findById(Integer qid) {
    return dao.find(getSql("questionOptions.findById"), qid);
  }


  public List findInList(List lista) {

    return dao.find(getSql("questionOptions.findInList"), lista);
  }


}
