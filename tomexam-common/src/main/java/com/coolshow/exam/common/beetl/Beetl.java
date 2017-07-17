package com.coolshow.exam.common.beetl;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

/**
 * Created by BISMARCK on 17.7.16.
 */
public class Beetl {
  static void classPathRL()throws Exception{
    ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader();
    Configuration configuration  = Configuration.defaultConfiguration();
    GroupTemplate groupTemplate = new GroupTemplate(resourceLoader,configuration);
    Template template  =groupTemplate.getTemplate("/template/hello.btl");
    template.binding("name","beetl");
    String string = template.render();
  }
  
}
