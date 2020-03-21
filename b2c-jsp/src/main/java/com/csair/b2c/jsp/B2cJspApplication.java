package com.csair.b2c.jsp;

import com.csair.b2c.jsp.common.Global;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author yudong
 * @date 2020/3/18
 */
@SpringBootApplication
public class B2cJspApplication {

    public static void main(String[] args) {
        Global.context = SpringApplication.run(B2cJspApplication.class, args);
        System.out.println("http://localhost:8666/a/jstl/springJstlTest");
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
