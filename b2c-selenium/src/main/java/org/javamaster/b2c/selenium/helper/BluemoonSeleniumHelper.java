package org.javamaster.b2c.selenium.helper;

import static java.util.stream.Collectors.toList;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/3
 */
@Component
public class BluemoonSeleniumHelper {
    private ChromeDriver browser;

    @PostConstruct
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yu\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        browser = new ChromeDriver();
        // browser.manage().window().maximize();
        // browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void exitBrowser() {
        browser.quit();
    }

    public void loginToSystem(String username, String password) {
        String baseUrl = "http://angelapi.bluemoon.com.cn/portal-admin/login.html";
        browser.get(baseUrl);
        findAndSetValue("username", username);
        findAndSetValue("password", password);
        findAndSetValue("rand", "8888");
        WebElement submitButton = browser.findElementById("onLogin");
        submitButton.click();
    }

    public void bagCollect(String angelCode) throws Exception {
        clickMenu("menu-first", "洗衣服务系统");
        clickMenu("menu-second", "收衣管理");
        clickMenu("menu-second", "收衣袋接收");
        // 点击接收收衣袋
        findFrameEleByFrameIdAndEleId("iframe_hotel_pack_receive_manager", "addExceptionClothes").click();
        findFrameByEleId("empCode$text").sendKeys(angelCode + Keys.ENTER);
    }

    public WebElement findFrameEleByFrameIdAndEleId(String frameId, String id) throws Exception {
        while (true) {
            browser.switchTo().defaultContent();
            try {
                browser.switchTo().frame(frameId);
                break;
            } catch (NoSuchFrameException ignored) {
                sleep();
            }
        }
        while (true) {
            try {
                return browser.findElementById(id);
            } catch (NoSuchElementException ignored) {
                sleep();
            }
        }
    }

    public WebElement findFrameByEleId(String id) throws Exception {
        WebElement webElement;
        while (true) {
            try {
                browser.switchTo().frame(0);
                break;
            } catch (NoSuchFrameException ignored) {
                sleep();
            }
        }

        while (true) {
            try {
                webElement = browser.findElementById(id);
                break;
            } catch (NoSuchElementException ignored) {
                sleep();
            }
        }
        return webElement;
    }

    public void findAndSetValue(String id, String value) {
        WebElement webElement = browser.findElementById(id);
        webElement.sendKeys(value);
    }


    public void clickMenu(String className, String menuName) throws Exception {
        List<WebElement> list;
        while (true) {
            list = browser.findElementsByClassName(className);
            if (!list.isEmpty()) {
                break;
            }
            sleep();
        }
        WebElement webElement = list.stream()
                .filter(webElement1 ->
                        menuName.equals(webElement1.getAttribute("title")))
                .collect(toList())
                .get(0);
        while (true) {
            try {
                webElement.click();
                break;
            } catch (WebDriverException ignored) {
                sleep();
            }
        }
    }

    private void sleep() throws Exception {
        TimeUnit.SECONDS.sleep(3);
    }
}
