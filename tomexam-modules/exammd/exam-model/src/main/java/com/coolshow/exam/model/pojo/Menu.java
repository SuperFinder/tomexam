package com.coolshow.exam.model.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ouzj on 2017/7/7.
 */
public class Menu implements Serializable {
  private int mid;
  private String menuTitle;
  private List<MenuItem> menuItems;
  private String privilegeCode;
  private String group;

  public Menu(int mid, String menuTitle, List<MenuItem> menuItems, String privilegeCode, String group) {
    this.mid = mid;
    this.menuTitle = menuTitle;
    this.menuItems = menuItems;
    this.privilegeCode = privilegeCode;
    this.group = group;
  }

  public Menu(int mid, String menuTitle, List<MenuItem> menuItems, String privilegeCode) {
    this.mid = mid;
    this.menuTitle = menuTitle;
    this.menuItems = menuItems;
    this.privilegeCode = privilegeCode;
  }

  public int getMid() {
    return mid;
  }

  public void setMid(int mid) {
    this.mid = mid;
  }

  public String getMenuTitle() {
    return menuTitle;
  }

  public void setMenuTitle(String menuTitle) {
    this.menuTitle = menuTitle;
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public String getPrivilegeCode() {
    return privilegeCode;
  }

  public void setPrivilegeCode(String privilegeCode) {
    this.privilegeCode = privilegeCode;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Menu{" +
        "mid=" + mid +
        ", menuTitle='" + menuTitle + '\'' +
        ", menuItems=" + menuItems +
        ", privilegeCode='" + privilegeCode + '\'' +
        ", group='" + group + '\'' +
        '}';
  }
}
