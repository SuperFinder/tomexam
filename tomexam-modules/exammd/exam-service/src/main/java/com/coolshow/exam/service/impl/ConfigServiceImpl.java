package com.coolshow.exam.service.impl;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.Config;
import com.coolshow.exam.service.ConfigService;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public class ConfigServiceImpl implements ConfigService {
  private static final Config dao = Singleton.getInstance().getSingletonObject(Config.class).dao();

  /**
   * .
   *
   * @return 获取所有配置
   */
  public List findAll() {
    return dao.findAll();
  }

  /**
   * .
   *
   * @param id id
   * @return 根据id获取配置
   */
  public List findById(Integer id) {
    return dao.findById(id);
  }


  /**
   * .
   *
   * @param key key
   * @return 返回配置
   */
  public List findByKey(String key) {
    return dao.findByKey(key);
  }

  /**
   * .
   *
   * @param config 配置
   * @return 添加配置
   */
  public Integer add(Config config) {
    return dao.add(config);
  }

  /**
   * .
   *
   * @param configKey 配置key
   * @param configVal 配置值
   * @return 根据key修改配置
   */
  public Integer updateByConfigKey(String configVal, String configKey) {
    return dao.updateByConfigKey(configVal, configKey);
  }
}
