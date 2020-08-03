package org.javamaster.b2c.selenium;

import org.javamaster.b2c.selenium.helper.BluemoonSeleniumHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrowserTests {
    @Autowired
    private BluemoonSeleniumHelper helper;
    // @Value("${local.server.port}")
    // private int port;

    @BeforeEach
    public void loginToSystem() {
        helper.loginToSystem("80546269", "qq123123");
    }

    @AfterEach
    public void closeBrowser() {
        helper.exitBrowser();
    }

    @Test
    public void bagCollect() throws Exception {
       helper.bagCollect("80546269");
        System.out.println();
    }

}
