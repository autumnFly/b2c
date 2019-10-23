package com.csair.b2c.test.mybatis.dbconfigs;

import com.csair.b2c.test.mybatis.SpecObjectFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by yu on 2018/4/27.
 */
@Configuration
// jpa的配置
@EnableJpaRepositories(basePackages = "com.csair.b2c.test.mybatis.repository.h2", transactionManagerRef = "h2TransactionManager", entityManagerFactoryRef = "h2EntityManagerFactory")
// mybatis的配置
@MapperScan(basePackages = "com.csair.b2c.test.mybatis.mapper.h2", sqlSessionFactoryRef = "h2SqlSessionFactory", sqlSessionTemplateRef = "h2SqlSessionTemplate")
public class H2Config {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    @Primary
    public DataSource h2DataSource() {
        DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql")
                .addScript("data.sql").build();
        logger.info("h2DataSource start to create:driverClassName:{},url:{},username:{},password:{}"
                , "", "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false", "sa", "");
        return dataSource;
    }

    @Bean
    @Primary
    public DataSourceTransactionManager h2TransactionManager(DataSource h2DataSource) {
        return new DataSourceTransactionManager(h2DataSource);
    }

    @Bean
    @Primary
    public JdbcTemplate h2JdbcTemplate(DataSource h2DataSource) {
        return new JdbcTemplate(h2DataSource);
    }

    /**
     * mybatis配置的核心bean
     */
    @Bean
    @Primary
    public SqlSessionFactory h2SqlSessionFactory(DataSource h2DataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(h2DataSource);
        final String MAPPER_LOCATION = "classpath*:mapper/h2/**/*.xml";
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        String configLocation = "classpath*:mybatis-config.xml";
        sessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResources(configLocation)[0]);
        sessionFactory.getObject().getConfiguration().setCacheEnabled(true);
        sessionFactory.getObject().getConfiguration().setLazyLoadingEnabled(true);
        sessionFactory.getObject().getConfiguration().setObjectFactory(new SpecObjectFactory());
        return sessionFactory.getObject();
    }

    @Bean
    @Primary
    public SqlSessionTemplate h2SqlSessionTemplate(SqlSessionFactory h2SqlSessionFactory) {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(h2SqlSessionFactory);
        return sqlSessionTemplate;
    }

    /**
     * hibernate配置的核心bean
     */
    @Bean
    public LocalSessionFactoryBean h2LocalSessionFactoryBean(DataSource h2DataSource) {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(h2DataSource);
        factoryBean.setPackagesToScan("com.csair.b2c.test.mybatis.entity");
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        factoryBean.setHibernateProperties(properties);
        return factoryBean;
    }

    /**
     * 指定使用哪个厂商的JPA实现
     */
    @Bean
    @Primary
    public JpaVendorAdapter h2JpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.H2);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
        return adapter;
    }

    /**
     * 使用LocalContainerEntityManagerFactoryBean之后persistence.xml文件就完全没有存在的必要了.
     * 创建容器管理类型的EntityManagerFactory
     * <p>
     * 只有使用LocalEntityManagerFactoryBean才会需要persistence.xml文件,这个文件必须位于类路径
     * META-INF目录下.创建应用管理类型的EntityManagerFactory
     * <p>
     * jpa配置的核心bean
     */
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean h2EntityManagerFactory(DataSource h2DataSource,
                                                                         JpaVendorAdapter h2JpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(h2DataSource);
        bean.setJpaVendorAdapter(h2JpaVendorAdapter);
        bean.setPackagesToScan("com.csair.b2c.test.mybatis.entity");
        bean.setPersistenceUnitName("h2DataSource");
        return bean;
    }

}
