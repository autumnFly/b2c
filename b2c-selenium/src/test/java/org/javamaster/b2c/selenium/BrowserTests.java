package org.javamaster.b2c.selenium;

import org.javamaster.b2c.selenium.helper.BluemoonSeleniumHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author yudong
 * @date 2020/8/3
 */
public class BrowserTests {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private BluemoonSeleniumHelper helper = new BluemoonSeleniumHelper();

    @Before
    public void loginToSystem() throws Exception {
        helper.loginToSystem("80546269", "qq123123");
    }

    @After
    public void closeBrowser() {
        helper.exitBrowser();
    }

    @Test
    public void bagCollect() throws Exception {
        logger.info("{}", helper.bagCollect("80546269"));
    }

    @Test
    public void bagCollectManage() throws Exception {
        logger.info("{}", helper.bagCollectManage(1));
    }

    @Test
    public void sortingBeforeWash() throws Exception {
        List<String> clothesCodes = Arrays.asList("fWGaxj8ayu", "bPgFNeSuyu");
        helper.sortingBeforeWash(clothesCodes);
    }

    @Test
    public void centerWashManager() throws Exception {
        helper.centerWashManager(1);
    }


    @Test
    public void completeProcess() throws Exception {
        logger.info("{}", helper.bagCollect("80546269"));

        helper.switchToDefaultFrame();
        List<String> clothesCodes = helper.bagCollectManage(2);
        logger.info("{}", clothesCodes);

        helper.switchToDefaultFrame();
        helper.sortingBeforeWash(clothesCodes);

        helper.switchToDefaultFrame();
        helper.centerWashManager(clothesCodes.size());
    }
}
