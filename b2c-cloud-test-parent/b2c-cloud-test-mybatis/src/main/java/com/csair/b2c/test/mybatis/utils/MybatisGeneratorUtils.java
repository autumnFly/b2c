package com.csair.b2c.test.mybatis.utils;

import lombok.SneakyThrows;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yudong
 * @date 2019/5/29
 */
public class MybatisGeneratorUtils {

    public static void main(String[] args) {
        generate();
    }

    @SneakyThrows
    public static void generate() {
        List<String> warnings = new ArrayList<>();
        File configFile = ResourceUtils.getFile("classpath:mybatis-generator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        ShellCallback callback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println(warnings);
    }

}
