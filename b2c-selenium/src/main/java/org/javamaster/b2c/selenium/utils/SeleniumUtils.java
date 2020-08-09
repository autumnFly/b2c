package org.javamaster.b2c.selenium.utils;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/7
 */
public class SeleniumUtils {
    private static Logger logger = LoggerFactory.getLogger(SeleniumUtils.class);

    public static List<WebElement> findsByCssSelect(RemoteWebDriver driver, String cssSelect) {
        List<WebElement> list;
        while (true) {
            sleep();
            list = driver.findElementsByCssSelector(cssSelect);
            if (!list.isEmpty()) {
                break;
            }
            logger.error("findsByCssSelect list empty:" + cssSelect);
        }
        return list;
    }

    public static List<WebElement> findsByXpath(RemoteWebDriver driver, String xpath) {
        List<WebElement> list;
        while (true) {
            sleep();
            list = driver.findElementsByXPath(xpath);
            if (!list.isEmpty()) {
                break;
            }
            logger.error("findsByXpath list empty:" + xpath);
        }
        return list;
    }

    public static void waitEleDisappearById(RemoteWebDriver driver, String id) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        sleep();
        while (existsElementById(driver, id)) {
            sleep();
        }
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public static boolean existsElementById(RemoteWebDriver driver, String id) {
        try {
            driver.findElementById(id);
            return true;
        } catch (Exception e) {
            logger.error("existsElementById:" + id);
            return false;
        }
    }


    public static void waitEleDisappearByClassName(RemoteWebDriver driver, String className) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        sleep();
        while (existsElementByClassName(driver, className)) {
            sleep();
        }
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public static boolean existsElementByClassName(RemoteWebDriver driver, String className) {
        try {
            driver.findElementByClassName(className);
            return true;
        } catch (Exception e) {
            logger.error("existsElementByClassName:" + className);
            return false;
        }
    }


    public static void tryToClick(RemoteWebDriver driver, WebElement webElement) {
        while (true) {
            try {
                new WebDriverWait(driver, 3)
                        .until(elementToBeClickable(webElement))
                        .click();
                break;
            } catch (Exception e) {
                logger.error("tryToClick:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
        }
    }

    @SuppressWarnings("ALL")
    public static List<Map<String, Object>> executeAndTryToGetList(RemoteWebDriver driver, String script) {
        return (List<Map<String, Object>>) new WebDriverWait(driver, 8)
                .until(ExpectedConditions.jsReturnsValue(script));
    }

    public static Object executeAndTryToGetData(RemoteWebDriver driver, String script) {
        return new WebDriverWait(driver, 8)
                .until(new ExpectedCondition<Object>() {
                    @NullableDecl
                    @Override
                    public Object apply(@NullableDecl WebDriver webDriver) {
                        return ((JavascriptExecutor) driver).executeScript(script);
                    }
                });
    }

    public static void executeAndDoNothing(RemoteWebDriver driver, String script) {
        new WebDriverWait(driver, 8)
                .until(ExpectedConditions.javaScriptThrowsNoExceptions(script));
    }

    public static void switchToTargetFrameById(RemoteWebDriver driver, String frameId) {
        new WebDriverWait(driver, 8)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(frameId)));
    }


    public static void switchToTargetFrameBySrc(RemoteWebDriver driver, String src) {
        List<WebElement> list = driver.findElementsByTagName("iframe");
        for (WebElement webElement : list) {
            String eleSrc = webElement.getAttribute("src");
            if (!eleSrc.contains(src)) {
                continue;
            }
            switchToTargetFrame(driver, webElement);
            return;
        }
    }

    public static void switchToChildFrame(RemoteWebDriver driver) {
        while (true) {
            try {
                driver.switchTo().frame(0);
                sleep(2);
                break;
            } catch (Exception e) {
                logger.error("switchToChildFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToDefaultFrame(RemoteWebDriver driver) {
        while (true) {
            try {
                driver.switchTo().defaultContent();
                sleep(2);
                break;
            } catch (Exception e) {
                logger.error("switchToDefaultFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToParentFrame(RemoteWebDriver driver) {
        while (true) {
            try {
                driver.switchTo().parentFrame();
                sleep(2);
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToTargetFrame(RemoteWebDriver driver, WebElement webElement) {
        new WebDriverWait(driver, 8)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
    }


    public static void sleep() {
        sleep(1);
    }

    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ignored) {
        }
    }

}
