package org.javamaster.dubbo.transaction1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yudong
 * @date 2020/6/29
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
@ComponentScan("org.javamaster")
// @ImportResource({"classpath:tcc-transaction.xml"})
public class DubboTransaction1Application {

    public static void main(String[] args) {
        System.setProperty("spring.dubbo.scan", "org.javamaster");
        SpringApplication.run(DubboTransaction1Application.class, args);
    }

    // @Bean
    // public TransactionRepository transactionRepository() {
    //     SpringJdbcTransactionRepository springJdbcTransactionRepository = new SpringJdbcTransactionRepository();
    //     springJdbcTransactionRepository.setDataSource(dataSource());
    //     return springJdbcTransactionRepository;
    // }
    //
    // public DataSource dataSource() {
    //     DruidDataSource dataSource = new DruidDataSource();
    //     dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    //     dataSource.setUrl(BlueMoonConsts.Local.URL_SAKILA);
    //     dataSource.setUsername(BlueMoonConsts.Local.USERNAME);
    //     dataSource.setPassword(BlueMoonConsts.Local.PASSWORD);
    //     dataSource.setInitialSize(10);
    //     dataSource.setMaxActive(20);
    //     dataSource.setMaxWait(10000);
    //     dataSource.setDefaultAutoCommit(true);
    //     dataSource.setRemoveAbandoned(true);
    //     dataSource.setTestOnBorrow(true);
    //     dataSource.setValidationQuery("select now()");
    //     return dataSource;
    // }

}