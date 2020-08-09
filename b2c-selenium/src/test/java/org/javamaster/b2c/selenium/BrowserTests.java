package org.javamaster.b2c.selenium;

import org.javamaster.b2c.selenium.service.SeleniumService;
import org.javamaster.b2c.selenium.utils.PropertiesUtils;
import org.junit.*;
import org.openqa.selenium.OutputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * @author yudong
 * @date 2020/8/3
 */
public class BrowserTests {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd-HH-mm-ss");
    private Logger logger = LoggerFactory.getLogger(getClass());
    private SeleniumService service = new SeleniumService();

    @Before
    public void loginToSystem() {
        service.loginToSystem(PropertiesUtils.getProp("angel.code"), PropertiesUtils.getProp("angel.password"));
    }

    @After
    public void closeBrowser() throws Exception {
        File srcFile = service.getDriver().getScreenshotAs(OutputType.FILE);
        File picDir = new File("pic");
        assert picDir.exists() || picDir.mkdir();
        File targetFile = new File(picDir, LocalDateTime.now().format(formatter) + ".png");
        Files.copy(srcFile.toPath(), targetFile.toPath());
        service.exitBrowser();
    }

    @Test
    public void bagCollect() {
        logger.info("{}", service.bagCollect(PropertiesUtils.getProp("angel.code")));
    }

    @Test
    public void bagCollectManage() {
        logger.info("{}", service.bagCollectManage(1));
    }

    @Test
    public void sortingBeforeWash() {
        List<String> clothesCodes = Arrays.asList(
                "tuohkigkyu",
                "irpliegsyu"
        );
        service.sortingBeforeWash(clothesCodes);
    }

    @Test
    public void centerWashManager() {
        service.centerWashManager(1);
    }


    @Test
    public void completeProcess() {
        List<String> bagCodes = service.bagCollect(PropertiesUtils.getProp("angel.code"));
        logger.info("{}", bagCodes);

        List<String> clothesCodes = service.bagCollectManage(bagCodes.size());
        logger.info("{}", clothesCodes);

        service.sortingBeforeWash(clothesCodes);

        service.centerWashManager(clothesCodes.size());
    }
}
