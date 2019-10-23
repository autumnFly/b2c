package cn.com.bluemoon.common.planner.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.csair.b2c.cloud.test.learn.java.utils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import static org.javamaster.b2c.config.BlueMoonConsts.WashingService.PASSWORD;
import static org.javamaster.b2c.config.BlueMoonConsts.WashingService.URL;
import static org.javamaster.b2c.config.BlueMoonConsts.WashingService.USERNAME;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.util.Properties;

/**
 * Created on 2019/3/20.<br/>
 *
 * @author yudong
 */
public class WashingServiceUtils {

    private static DruidDataSource dataSourceWashingService;

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;

    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory != null) {
            return sqlSessionFactory;
        }
        try {
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

            PageHelper pageHelper = new PageHelper();
            Properties properties = new Properties();
            properties.setProperty("reasonable", "true");
            properties.setProperty("supportMethodsArguments", "true");
            properties.setProperty("returnPageInfo", "check");
            properties.setProperty("params", "count=countSql");
            properties.setProperty("dialect", "MySQL");
            pageHelper.setProperties(properties);
            sessionFactory.setPlugins(new Interceptor[]{pageHelper});

            sessionFactory.setDataSource(getDatasourceWashingService());
            sessionFactory.setTransactionFactory(new JdbcTransactionFactory());
            sqlSessionFactory = sessionFactory.getObject();
            Configuration configuration = sqlSessionFactory.getConfiguration();
            configuration.addMappers("cn.com.bluemoon.common.planner.mapper");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        if (sqlSession != null) {
            return sqlSession;
        }
        sqlSession = getSqlSessionFactory().openSession();
        return sqlSession;
    }

    public static DruidDataSource getDatasourceWashingService() {
        if (dataSourceWashingService != null) {
            return dataSourceWashingService;
        }
        dataSourceWashingService = MybatisUtils.druidDataSource(URL, USERNAME, PASSWORD);
        return dataSourceWashingService;
    }

}
