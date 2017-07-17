package com.coolshow.exam.common;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by ouzj on 2017/7/17.
 */
public enum  Singleton {

  INSTANCE;

  private Map<String, Object> singletonMap = new HashMap();

  public static Singleton getInstance()
  {

    return INSTANCE;
  }

  public <T> T getSingletonObject(Class<T> clazz)
  {
    Object t = null;
    if (clazz != null) {
      String key = clazz.getName();
      if (this.singletonMap.containsKey(key)) {
        t = this.singletonMap.get(key);
      }
      if (t == null) {
        try {
          t = clazz.newInstance();
          this.singletonMap.put(key, t);
        } catch (InstantiationException e) {
          e.printStackTrace();
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
    return (T) t;
  }
}