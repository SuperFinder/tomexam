package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BaseQuestionOptions;
import com.jfinal.plugin.activerecord.Db;

import java.util.Arrays;
import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class QuestionOptions extends BaseQuestionOptions<QuestionOptions> {
  private static final QuestionOptions dao = Singleton.getInstance().getSingletonObject
      (QuestionOptions.class);

  public Integer addOption() {
    String salisa = "A";
    Integer qid = 9889;
    String soption = "fdd";
    return Db.update(getSql("questionOptions.addOption"), salisa, qid, soption);
  }

  //  Integer qid, List<String> listOfOptions
  public int[] addOptions(Object[][][] obj) {
    //QuestionOptions a = new QuestionOptions();
    //a.setSalisa("A").setQid(9999).setSoption("tw");
    //QuestionOptions b = new QuestionOptions();
    //b.setSalisa("B").setQid(9999).setSoption("zhengzhi");
    //QuestionOptions c = new QuestionOptions();
    //c.setSalisa("C").setQid(9999).setSoption("huise");
    //    List<QuestionOptions> listOfOptions = Arrays.asList(a, b, c);
    Integer qid = 8888;

    List<String> listOfOptions = Arrays.asList("aaa", "bbb", "ccc", "ddd");
    //String listOfOptions ="1234";
    return Db.batch(getSql("questionOptions.addOption"), obj, 5000);
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
