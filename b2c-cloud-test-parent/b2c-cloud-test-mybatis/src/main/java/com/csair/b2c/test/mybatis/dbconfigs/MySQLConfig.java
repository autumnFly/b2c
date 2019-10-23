package com.csair.b2c.test.mybatis.dbconfigs;

import com.alibaba.druid.pool.DruidDataSource;
import com.csair.b2c.test.mybatis.SpecObjectFactory;
import com.csair.b2c.test.mybatis.enums.EnumBase;
import com.csair.b2c.test.mybatis.model.PhoneNumber;
import com.csair.b2c.test.mybatis.typehandler.EnumBaseTypeHandler;
import com.csair.b2c.test.mybatis.typehandler.PhoneNumberTypeHandler;
import com.csair.b2c.test.mybatis.utils.ClassUtils;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by yu on 2018/4/27.
 */
@Configuration
// jpa的配置
@EnableJpaRepositories(basePackages = "com.csair.b2c.test.mybatis.repository.mysql", transactionManagerRef = "mysqlTransactionManager", entityManagerFactoryRef = "mysqlEntityManagerFactory")
// mybatis的配置
@MapperScan(basePackages = "com.csair.b2c.test.mybatis.mapper.mysql", sqlSessionFactoryRef = "mysqlSqlSessionFactory", sqlSessionTemplateRef = "mysqlSqlSessionTemplate")
public class MySQLConfig implements TransactionManagementConfigurer {
    Logger logger = LoggerFactory.getLogger(getClass());
    //    @Value("${db.mysql.driverClassName}")
    private String driverClassName = "com.mysql.jdbc.Driver";
    //    @Value("${db.mysql.url}")
    private String url = BlueMoonConsts.Local.URL_SAKILA;
    //    @Value("${db.mysql.username}")
    private String username = BlueMoonConsts.Local.USERNAME;
    //    @Value("${db.mysql.password}")
    private String password = BlueMoonConsts.Local.PASSWORD;

    @Bean
    public DataSource mysqlDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        logger.info("mysqlDataSource start to create:driverClassName:{},url:{},username:{},password:{}"
                , driverClassName, url, username, password);
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(10000);
        dataSource.setDefaultAutoCommit(true);
        dataSource.setRemoveAbandoned(true);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("select sysdate from dual");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager mysqlTransactionManager() {
        return new DataSourceTransactionManager(mysqlDataSource());
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return mysqlTransactionManager();
    }

    @Bean
    public JdbcTemplate mysqlJdbcTemplate(@Qualifier("mysqlDataSource") DataSource mysqlDataSource) {
        return new JdbcTemplate(mysqlDataSource);
    }

    /**
     * mybatis配置的核心bean
     */
    @Bean
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource mysqlDataSource)
            throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(mysqlDataSource);
        final String MAPPER_LOCATION = "classpath*:mapper/mysql/**/*.xml";
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        // String configLocation = "classpath*:mybatis-config.xml";
        // sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResources(configLocation)[0]);

        // 只指定包名,则mybatis会自动为 JavaBean 注册一个小写字母开头的非完全限定的类名形式的别名
        sqlSessionFactoryBean.setTypeAliasesPackage("com.csair.b2c.test.mybatis.model");
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(Slf4jImpl.class);
        configuration.setCacheEnabled(true);
        // configuration.addMappers("com.mybatis3.mappers");
        // LogFactory.useLog4JLogging();
        configuration.setLazyLoadingEnabled(true);
        configuration.setObjectFactory(new SpecObjectFactory());

        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
        typeHandlerRegistry.register(PhoneNumber.class, JdbcType.VARCHAR, new PhoneNumberTypeHandler());
        sqlSessionFactoryBean.setConfiguration(configuration);
        // 找到EnumBase接口所在的包下所有实现该接口的枚举类
        Set<Class<?>> set = ClassUtils.getAllClassesFromPackage(EnumBase.class.getPackage().getName())
                .stream()
                .filter(clz -> clz.isEnum() && EnumBase.class.isAssignableFrom(clz))
                .collect(Collectors.toSet());
        // 动态注册所有实现了EnumBase接口的枚举类的类型转换器
        set.forEach(enumClass -> {
            EnumBaseTypeHandler handler = new EnumBaseTypeHandler(enumClass);
            typeHandlerRegistry.register(enumClass, JdbcType.TINYINT, handler);
            typeHandlerRegistry.register(enumClass, null, handler);
        });

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        return sqlSessionFactory;
    }

    @Bean
    public SqlSessionTemplate mysqlSqlSessionTemplate(
            @Qualifier("mysqlSqlSessionFactory") SqlSessionFactory mysqlSqlSessionFactory) {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(mysqlSqlSessionFactory);
        return sqlSessionTemplate;
    }

    /**
     * hibernate配置的核心bean
     */
    @Bean
    public LocalSessionFactoryBean mysqlLocalSessionFactoryBean(@Qualifier("mysqlDataSource") DataSource mysqlDataSource) {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(mysqlDataSource);
        factoryBean.setPackagesToScan("com.csair.b2c.test.mybatis.entity");
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        factoryBean.setHibernateProperties(properties);
        return factoryBean;
    }

    @Bean
    public JpaVendorAdapter mysqlJpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        return adapter;
    }

    /**
     * jpa配置的核心bean
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(
            @Qualifier("mysqlDataSource") DataSource mysqlDataSource,
            @Qualifier("mysqlJpaVendorAdapter") JpaVendorAdapter mysqlJpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(mysqlDataSource);
        // 指明使用哪个厂商的JPA实现
        bean.setJpaVendorAdapter(mysqlJpaVendorAdapter);
        bean.setPackagesToScan("com.csair.b2c.test.mybatis.entity");
        bean.setPersistenceUnitName("mysqlDataSource");
        return bean;
    }

}
