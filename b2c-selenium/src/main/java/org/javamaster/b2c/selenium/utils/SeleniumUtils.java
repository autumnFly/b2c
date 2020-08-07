package org.javamaster.b2c.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
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

    public static void waitEleDisappearById(RemoteWebDriver driver, String id) {
        sleep(2);
        while (true) {
            try {
                new WebDriverWait(driver, 0).until(presenceOfElementLocated(By.id(id)));
                sleep(1);
            } catch (Exception e) {
                logger.error("waitEleDisappearById:{},{},{}", id, e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                break;
            }
        }
    }


    public static void waitEleDisappearByClassName(RemoteWebDriver driver, String className) {
        sleep(2);
        while (true) {
            try {
                new WebDriverWait(driver, 0).until(presenceOfAllElementsLocatedBy(By.className(className)));
                sleep(1);
            } catch (Exception e) {
                logger.error("waitEleDisappearByClassName:{},{},{}", className, e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                break;
            }
        }
    }

    public static void tryToClick(RemoteWebDriver driver, WebElement webElement) {
        while (true) {
            try {
                new WebDriverWait(driver, 2)
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
        List<Map<String, Object>> mapList;
        while (true) {
            try {
                mapList = (List<Map<String, Object>>) driver.executeScript(script);
                if (!mapList.isEmpty()) {
                    break;
                }
            } catch (Exception e) {
                logger.error("executeAndTryToGetList:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
        return mapList;
    }

    public static Object executeAndTryToGetData(RemoteWebDriver driver, String script) {
        Object object;
        while (true) {
            try {
                object = driver.executeScript(script);
                if (object != null) {
                    break;
                }
            } catch (Exception e) {
                logger.error("executeAndTryToGetData:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
        return object;
    }

    public static void executeAndDoNothing(RemoteWebDriver driver, String script) {
        while (true) {
            try {
                driver.executeScript(script);
                break;
            } catch (Exception e) {
                logger.error("executeAndDoNothing:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToChildFrame(RemoteWebDriver driver) {
        while (true) {
            try {
                driver.switchTo().frame(0);
                sleep();
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
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToDefaultFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToTargetFrameById(RemoteWebDriver driver, String frameId) {
        while (true) {
            try {
                driver.switchTo().frame(frameId);
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrameById:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
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

    public static void switchToParentFrame(RemoteWebDriver driver) {
        while (true) {
            try {
                driver.switchTo().parentFrame();
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public static void switchToTargetFrame(RemoteWebDriver driver, WebElement webElement) {
        while (true) {
            try {
                driver.switchTo().frame(webElement);
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
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
