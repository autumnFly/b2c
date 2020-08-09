package org.javamaster.b2c.selenium.service;

import io.appium.java_client.android.AndroidDriver;
import static org.javamaster.b2c.selenium.utils.SeleniumUtils.sleep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/6
 */
public class AppiumSmsService {

    private AndroidDriver<WebElement> driver;

    public AppiumSmsService() {
        DesiredCapabilities capabilities = capabilities();
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSms() {
        driver.sendSMS("10086", "message from Appium");
        sleep(2);
        driver.quit();
    }

    private DesiredCapabilities capabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("automationName", "Appium");
        return capabilities;
    }

}
