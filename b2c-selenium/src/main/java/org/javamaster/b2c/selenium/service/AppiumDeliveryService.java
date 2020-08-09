package org.javamaster.b2c.selenium.service;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.lang3.RandomStringUtils;
import static org.javamaster.b2c.selenium.utils.AppiumUtils.*;
import org.javamaster.b2c.selenium.utils.PropertiesUtils;
import static org.javamaster.b2c.selenium.utils.SeleniumUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/6
 */
@SuppressWarnings("ALL")
public class AppiumDeliveryService {
    private AndroidDriver driver;
    private Logger logger = LoggerFactory.getLogger(getClass());

    private boolean phoneAllow = false;
    private boolean storgeAllow = false;
    private boolean cameraAllow = false;

    public AppiumDeliveryService() {
        DesiredCapabilities capabilities = capabilities();
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void quit() {
        driver.quit();
    }

    public void appointmentCollect() {
        // 找到菜单点击进入
        enterMenu("预约收衣");
        switchToWebView("WEBVIEW_cn.com.bluemoon.delivery");
        // 点击+
        tryToClick(driver, findsByCssSelect(driver, "div.icon-scan").get(0));
        // 点击代下单创建
        tryToClick(driver, findsByCssSelect(driver, "div.item.item-1").get(0));
        // 输入手机号
        findsByCssSelect(driver, "input.bm-search__input").get(0).sendKeys("18826483963");
        driver.hideKeyboard();
        // 点击搜索
        tryToClick(driver, findsByCssSelect(driver, "div.bm-search__right").get(0));
        // 点击选择第一条记录
        tryToClick(driver, findsByCssSelect(driver, "div.item.item-end").get(0));
        // 点击选择地址
        tryToClick(driver, findsByCssSelect(driver, "div.seladdr").get(0));
        // 点击选择第一条地址
        tryToClick(driver, findsByCssSelect(driver, "li.aitem").get(0));
        driver.findElementByXPath("//input[@placeholder='请输入/扫描收衣袋二维码']")
                .sendKeys(RandomStringUtils.randomAlphanumeric(8) + "yu");
        driver.hideKeyboard();
        findsByCssSelect(driver, "textarea.remark-txt").get(0).sendKeys("这是收衣备注嗷嗷嗷");
        driver.hideKeyboard();
        // 点击衣物明细+
        tryToClick(driver, findsByCssSelect(driver, "div.btn-add").get(0));
        // 选择商品
        tryToClick(driver, findGoodsItem("旺旺"));
    }


    public void enterCabinManage(List<String> clothesCodes) {
        // 找到菜单点击进入
        enterMenu("入柜管理");
        if (!cameraAllow) {
            allowAuthorize();
            cameraAllow = true;
        }
        for (String clothesCode : clothesCodes) {
            // 点击手工输入
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
            AndroidElement androidElement = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
            // 输入衣物编码
            androidElement.sendKeys(clothesCode);
            driver.hideKeyboard();
            // 确定
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            // 点击手工输入
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
            String cupboardCode = findByIdAndGetText(driver, "cn.com.bluemoon.delivery:id/txt_code");
            androidElement = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
            // 输入分拨柜编码
            androidElement.sendKeys(cupboardCode);
            driver.hideKeyboard();
            // 确定
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            sleep(2);
        }
        back();
    }

    public void backOrderPackage() {
        enterMenu("还衣单打包");
        String expression = "cn.com.bluemoon.delivery:id/btn_pack";
        List<AndroidElement> list = driver.findElementsById(expression);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AndroidElement androidElement = list.get(0);
            // 点击打包
            tryToClick(driver, androidElement);
            if (!cameraAllow) {
                allowAuthorize();
                cameraAllow = true;
            }
            // 点击手工输入
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
            String cupboardCode = findByIdAndGetText(driver, "cn.com.bluemoon.delivery:id/txt_code");
            AndroidElement element = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
            // 输入分拨柜编码
            element.sendKeys(cupboardCode);
            driver.hideKeyboard();
            // 点击确定
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            List<String> clothesCodes = findsByIdAndGetText(driver, "cn.com.bluemoon.delivery:id/tv_back_code");
            // 点击扫描
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/img_right"));
            for (String clothesCode : clothesCodes) {
                // 点击手工输入
                tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
                element = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
                // 输入衣物编码
                element.sendKeys(clothesCode);
                driver.hideKeyboard();
                // 点击确定
                tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            }
            // 打印标签
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_print"));
            // 扫描标签
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_scan"));
            // 点击手工输入
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
            String code = findByIdAndGetText(driver, "cn.com.bluemoon.delivery:id/txt_code");
            element = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
            // 输入还衣单编码
            element.sendKeys(code);
            driver.hideKeyboard();
            // 点击确定
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            // 点击装箱
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_ok"));
            // 点击手工输入
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_input"));
            code = findByIdAndGetText(driver, "cn.com.bluemoon.delivery:id/txt_code");
            element = findById(driver, "cn.com.bluemoon.delivery:id/et_number");
            // 输入衣物箱号
            element.sendKeys(code);
            // 点击确定
            tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_sign"));
            sleep(2);
            list = driver.findElementsById(expression);
        }
        back();
    }

    private void back() {
        tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/img_back"));
    }

    public void login(String angelCode, String password) {
        if (!phoneAllow) {
            allowAuthorize();
            phoneAllow = true;
        }
        sleep();
        if (!storgeAllow) {
            allowAuthorize();
            storgeAllow = true;
        }
        findById(driver, "cn.com.bluemoon.delivery:id/et_user_name").sendKeys(angelCode);
        findById(driver, "cn.com.bluemoon.delivery:id/et_user_psw").sendKeys(password);
        tryToClick(driver, findById(driver, "cn.com.bluemoon.delivery:id/btn_login"));
    }

    private void allowAuthorize() {
        tryToClick(driver, driver.findElementById("com.android.permissioncontroller:id/permission_allow_button"));
    }

    private void enterMenu(String menuName) {
        AndroidElement androidElement;
        while (true) {
            swipeUp(driver);
            androidElement = findMenuItem(menuName);
            if (androidElement != null) {
                break;
            }
        }
        tryToClick(driver, androidElement);
    }

    private AndroidElement findMenuItem(String menuName) {
        List<AndroidElement> list = driver.findElementsById("cn.com.bluemoon.delivery:id/txt_menu_item");
        for (AndroidElement androidElement : list) {
            if (menuName.equals(androidElement.getText())) {
                return androidElement;
            }
        }
        return null;
    }

    private void switchToWebView(String name) {
        while (!existsWebView(name)) {
            sleep();
        }
        driver.context(name);
        sleep();
    }

    private boolean existsWebView(String name) {
        for (Object contextHandle : driver.getContextHandles()) {
            if (name.equals(contextHandle)) {
                return true;
            }
        }
        return false;
    }

    private WebElement findGoodsItem(String goodsName) {
        WebElement element = null;
        List<WebElement> list = findsByXpath(driver, "//div[@class='name']/span");
        for (WebElement webElement : list) {
            if (goodsName.equals(webElement.getText())) {
                element = webElement;
            }
        }
        assert element != null;
        return element;
    }

    private DesiredCapabilities capabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "cn.com.bluemoon.delivery");
        capabilities.setCapability("appActivity", ".AppStartActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("chromedriverExecutable", PropertiesUtils.getProp("webview.driver.path"));
        return capabilities;
    }

}
