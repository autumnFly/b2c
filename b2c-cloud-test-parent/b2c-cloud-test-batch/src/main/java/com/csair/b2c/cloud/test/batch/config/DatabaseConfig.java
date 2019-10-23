package com.csair.b2c.cloud.test.batch.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created on 2018/12/9.<br/>
 *
 * @author yudong
 */
@Configuration
public class DatabaseConfig {

    //    @Value("${db.mysql.driverClassName}")
    private String driverClassName = "com.mysql.jdbc.Driver";
    //    @Value("${db.mysql.url}")
    private String url = BlueMoonConsts.Local.URL_SAKILA;
    //    @Value("${db.mysql.username}")
    private String username = BlueMoonConsts.Local.USERNAME;
    //    @Value("${db.mysql.password}")
    private String password = BlueMoonConsts.Local.PASSWORD;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(2);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(10000);
        dataSource.setDefaultAutoCommit(true);
        dataSource.setRemoveAbandoned(true);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("select now()");
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.csair.b2c.**.model");
        bean.setTypeHandlersPackage("com.csair.b2c.cloud.test.user.handler");

        final String MAPPER_LOCATION = "classpath*:mapper/**/*.xml";
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager mysqlTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
