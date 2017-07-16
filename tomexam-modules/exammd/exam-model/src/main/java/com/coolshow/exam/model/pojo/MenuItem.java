package com.coolshow.exam.model.pojo;

import java.io.Serializable;

/**
 * Created by ouzj on 2017/7/7.
 */
public class MenuItem implements Serializable {
  private int parentid;
  private String menuItemTitle;
  private String menuItemIcon;
  private String menuItemUrl;
  private String privelegeCode;

  public MenuItem(int parentid, String menuItemTitle, String menuItemIcon, String menuItemUrl, String privelegeCode) {
    this.parentid = parentid;
    this.menuItemTitle = menuItemTitle;
    this.menuItemIcon = menuItemIcon;
    this.menuItemUrl = menuItemUrl;
    this.privelegeCode = privelegeCode;
  }

  public int getParentid() {
    return parentid;
  }

  public void setParentid(int parentid) {
    this.parentid = parentid;
  }

  public String getMenuItemTitle() {
    return menuItemTitle;
  }

  public void setMenuItemTitle(String menuItemTitle) {
    this.menuItemTitle = menuItemTitle;
  }

  public String getMenuItemIcon() {
    return menuItemIcon;
  }

  public void setMenuItemIcon(String menuItemIcon) {
    this.menuItemIcon = menuItemIcon;
  }

  public String getMenuItemUrl() {
    return menuItemUrl;
  }

  public void setMenuItemUrl(String menuItemUrl) {
    this.menuItemUrl = menuItemUrl;
  }

  public String getPrivelegeCode() {
    return privelegeCode;
  }

  public void setPrivelegeCode(String privelegeCode) {
    this.privelegeCode = privelegeCode;
  }

  @Override
  public String toString() {
    return "MenuItem{" +
        "parentid=" + parentid +
        ", menuItemTitle='" + menuItemTitle + '\'' +
        ", menuItemIcon='" + menuItemIcon + '\'' +
        ", menuItemUrl='" + menuItemUrl + '\'' +
        ", privelegeCode='" + privelegeCode + '\'' +
        '}';
  }
}
