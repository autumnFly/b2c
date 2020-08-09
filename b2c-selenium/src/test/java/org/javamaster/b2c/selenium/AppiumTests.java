package org.javamaster.b2c.selenium;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.javamaster.b2c.selenium.service.AppiumDeliveryService;
import org.javamaster.b2c.selenium.service.AppiumSmsService;
import org.javamaster.b2c.selenium.utils.PropertiesUtils;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;

/**
 * @author yudong
 * @date 2020/8/6
 */
public class AppiumTests {

    private static AppiumDriverLocalService service;

    @BeforeClass
    public static void initAndStart() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    @AfterClass
    public static void stop() {
        service.stop();
    }

    @Test
    public void calculator() {
        AppiumSmsService appiumSmsService = new AppiumSmsService();
        appiumSmsService.sendSms();
    }

    @Test
    public void delivery() {
        AppiumDeliveryService appiumDeliveryService = new AppiumDeliveryService();
        appiumDeliveryService.login(PropertiesUtils.getProp("angel.code"), PropertiesUtils.getProp("angel.password"));
        appiumDeliveryService.appointmentCollect();
    }

    @Test
    public void enterCabinManage() {
        AppiumDeliveryService appiumDeliveryService = new AppiumDeliveryService();
        appiumDeliveryService.login(PropertiesUtils.getProp("angel.code"), PropertiesUtils.getProp("angel.password"));
        appiumDeliveryService.enterCabinManage(Arrays.asList(
                "aykeuqayyu"
        ));
    }

    @Test
    public void backOrderPackage() {
        AppiumDeliveryService appiumDeliveryService = new AppiumDeliveryService();
        appiumDeliveryService.login(PropertiesUtils.getProp("angel.code"), PropertiesUtils.getProp("angel.password"));
        appiumDeliveryService.backOrderPackage();
    }

}
