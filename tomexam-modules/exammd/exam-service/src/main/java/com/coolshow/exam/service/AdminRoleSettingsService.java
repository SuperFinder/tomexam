package com.coolshow.exam.service;

import java.util.List;

/**
 * Created by BISMARCK on 17.7.17.
 */
public interface AdminRoleSettingsService {
  List findAll();

  List findByP(Integer ptype);
}
