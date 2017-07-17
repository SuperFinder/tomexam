package com.coolshow.exam.service;

import com.coolshow.exam.model.Config;
import com.jfinal.template.stat.ast.Return;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface ConfigService {
  /**
   *.
   * @return 获取所有配置
   */
  List findAll();

  /**
   *.
   * @param id id
   * @return 根据id获取配置
   */
  List findById(Integer id);


  /**
   *.
   * @param key key
   * @return 返回配置
   */
  List findByKey(String key);

  /**
   *.
   * @param config 配置
   * @return 添加配置
   */
  Integer add(Config config);

  /**
   *.
   * @param configKey 配置key
   * @param configVal 配置值
   * @return 根据key修改配置
   */
  Integer updateByConfigKey(String configVal, String configKey);
}
