package com.coolshow.exam.model;

import com.coolshow.exam.common.Singleton;
import com.coolshow.exam.model.base.BasePaperRandom;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class PaperRandom extends BasePaperRandom<PaperRandom> {
  private static final PaperRandom dao = Singleton.getInstance().getSingletonObject(PaperRandom.class).dao();
}
