package com.coolshow.exam.config;

import com.jfinal.kit.PathKit;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.hikaricp.HikariCpPlugin;

import javax.sql.DataSource;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 在数据库表有任何变动时，运行一下 main 方法，极速响应变化进行代码重构
 */
public class JFinalDemoGenerator {
  /**
   * .
   * 获取数据库源
   *
   * @return 数据源
   */
  public static DataSource getDataSource() {
    Prop prop = PropKit.use("jdbc.properties");
    HikariCpPlugin hikariCpPlugin = new HikariCpPlugin(prop.get("jdbcUrl"), prop.get("user"),
        prop.get("password").trim());
    hikariCpPlugin.start();
    return hikariCpPlugin.getDataSource();
  }

  /**
   * .
   * 生成Model
   *
   * @param args args
   */
  public static void main(String[] args) {
    // base 所使用的包名
    String baseModelPackageName = "com.coolshow.exam.model.base";
    // base 文件保存路径
    String baseModelOutputDir = PathKit.getWebRootPath()
        + "/src/main/java/com/coolshow/exam/model/base";
    // model 所使用的包名 (MappingKit 默认使用的包名)
    String modelPackageName = "com.coolshow.exam.com.coolshow.exam.model";
    // model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
    String modelOutputDir = baseModelOutputDir + "/..";
    // 创建生成器
    Generator generator = new Generator(getDataSource(), baseModelPackageName, baseModelOutputDir,
        modelPackageName, modelOutputDir);
    // 设置是否生成链式 setter 方法
    generator.setGenerateChainSetter(false);
    // 添加不需要生成的表名
    generator.addExcludedTable("tm_test");
    // 设置是否在 Model 中生成 dao 对象
    generator.setGenerateDaoInModel(true);
    // 设置是否生成链式 setter 方法
    generator.setGenerateChainSetter(true);
    // 设置是否生成字典文件
    generator.setGenerateDataDictionary(true);
    // 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
    generator.setRemovedTableNamePrefixes("tm_");
    // 生成
    generator.generate();
  }
}




