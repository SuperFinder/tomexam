package com.coolshow.exam.config;

import com.coolshow.exam.model._MappingKit;
import com.coolshow.exam.route.MainRoute;
import com.jfinal.config.*;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.hikaricp.HikariCpPlugin;
import com.jfinal.template.Engine;

/**
 * Created by ouzj on 2017/7/7.
 */
public class JfinalConfig extends JFinalConfig {
  @Override
  public void configConstant(Constants me) {
    PropKit.use("config.properties");
    me.setDevMode(PropKit.getBoolean("devMode", false));
  }

  @Override
  public void configRoute(Routes me) {
    me.setBaseViewPath("/");
    me.add(new MainRoute());
  }

  @Override
  public void configEngine(Engine me) {

  }

  @Override
  public void configPlugin(Plugins me) {
    Prop prop = PropKit.use("jdbc.properties");
    HikariCpPlugin hp = new HikariCpPlugin(prop.get("jdbcUrl"), prop.get("user"),
        prop.get("password").trim());
    hp.setDriverClass("com.mysql.jdbc.Driver");
    me.add(hp);
    ActiveRecordPlugin arp = new ActiveRecordPlugin(hp);
    arp.setBaseSqlTemplatePath(PathKit.getRootClassPath());
    arp.addSqlTemplate("sql/all.sql");
    _MappingKit.mapping(arp);
    me.add(arp);
  }

  @Override
  public void configInterceptor(Interceptors me) {

  }

  @Override
  public void configHandler(Handlers me) {

  }

}
