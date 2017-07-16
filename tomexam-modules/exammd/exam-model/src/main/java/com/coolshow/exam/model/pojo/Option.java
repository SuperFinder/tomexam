package com.coolshow.exam.model.pojo;

import java.io.Serializable;

/**
 * Created by ouzj on 2017/7/7.
 */
public class Option implements Serializable {
  private String optionAlisa;
  private String optionContent;

  public String getOptionAlisa() {
    return optionAlisa;
  }

  public void setOptionAlisa(String optionAlisa) {
    this.optionAlisa = optionAlisa;
  }

  public String getOptionContent() {
    return optionContent;
  }

  public void setOptionContent(String optionContent) {
    this.optionContent = optionContent;
  }

  @Override
  public String toString() {
    return "Option{" +
        "optionAlisa='" + optionAlisa + '\'' +
        ", optionContent='" + optionContent + '\'' +
        '}';
  }
}
