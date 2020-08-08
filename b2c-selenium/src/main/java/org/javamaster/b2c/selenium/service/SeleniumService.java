package org.javamaster.b2c.selenium.service;

import static java.util.stream.Collectors.toList;
import net.bytebuddy.utility.RandomString;
import org.javamaster.b2c.selenium.utils.PropertiesUtils;
import static org.javamaster.b2c.selenium.utils.SeleniumUtils.*;
import org.javamaster.b2c.selenium.utils.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/3
 */
public class SeleniumService {

    private ChromeDriver driver;

    public SeleniumService() {
        System.setProperty("webdriver.chrome.driver", PropertiesUtils.getProp("driver.path"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public void exitBrowser() {
        driver.quit();
    }

    public void loginToSystem(String username, String password) {
        driver.get(PropertiesUtils.getProp("base.url"));
        driver.findElementById("username").sendKeys(username);
        driver.findElementById("password").sendKeys(password);
        driver.findElementById("rand").sendKeys("8888");
        // 点击登录
        tryToClick(driver, driver.findElementById("onLogin"));
    }

    public List<String> bagCollect(String angelCode) {
        clickMenu("洗衣服务系统");
        clickMenu("收衣管理");
        clickMenu("收衣袋接收");
        // 切换到收衣袋接收iframe
        switchToTargetFrameById(driver, "iframe_hotel_pack_receive_manager");
        // 点击接收收衣袋
        tryToClick(driver, driver.findElementById("addExceptionClothes"));
        // 切换到接收收衣袋iframe
        switchToChildFrame(driver);
        sleep(2);
        // 输入转交人编码并点击enter健
        driver.findElementById("empCode$text").sendKeys(angelCode + Keys.ENTER);
        List<Map<String, Object>> mapList = executeAndTryToGetList(driver, "return grid.data");
        // 得到所有的收衣袋编码
        List<String> bagCodes = mapList.stream()
                .map(map -> map.get("packCode").toString())
                .collect(toList());
        for (String bagCode : bagCodes) {
            // 输入收衣袋编码并点击enter健
            driver.findElementById("searchPackCode$text").sendKeys(bagCode + Keys.ENTER);
            // 点击弹框(div)的确定按钮关闭弹框
            tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
            sleep(1);
        }
        // 点击完成收衣袋接收
        tryToClick(driver, driver.findElementById("save_bt"));
        // 点击弹框(div)的确定按钮关闭弹框
        tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
        switchToDefaultFrame(driver);
        clickMenu("收衣管理");
        clickMenu("洗衣服务系统");
        return bagCodes;
    }

    public List<String> bagCollectManage(int collectLimit) {
        List<String> clothesCodes = new ArrayList<>();
        clickMenu("洗衣服务系统");
        clickMenu("收衣管理");
        clickMenu("收衣袋收衣管理");
        // 切换到收衣袋收衣管理iframe
        switchToTargetFrameById(driver, "iframe_hotel_clothes_receive_manager");
        sleep(2);
        for (int i = 0; i < collectLimit; i++) {
            // 固定选择第一条记录
            executeAndTryToSelectNuiGridRow("grid", 0);
            // 点击接收衣物
            tryToClick(driver, driver.findElementById("receiveClothes"));
            clothesCodes.addAll(bagCollectManage());
            switchToDefaultFrame(driver);
            // 切换回收衣袋收衣管理iframe
            switchToTargetFrameById(driver, "iframe_hotel_clothes_receive_manager");
        }
        switchToDefaultFrame(driver);
        clickMenu("收衣管理");
        clickMenu("洗衣服务系统");
        return clothesCodes;
    }

    private List<String> bagCollectManage() {
        List<String> clothesCodes = new ArrayList<>();
        // 切换到接收衣物iframe
        switchToTargetFrameBySrc(driver, "/wash/hotel/pack/clothesReceive.jsp");
        sleep(2);
        // 选择出库方式
        executeAndTryToSetNuiValue("outWays", "personal_out_way");
        List<Map<String, Object>> mapList = executeAndTryToGetList(driver, "return grid.data");
        for (int i = 0; i < mapList.size(); i++) {
            // 选择待登记衣物
            executeAndTryToSelectNuiGridRow("grid", i);
            // 点击登记衣物信息
            tryToClick(driver, driver.findElementById("save_bt_1"));
            switchToParentFrame(driver);
            // 切换到登记衣物iframe
            switchToTargetFrameBySrc(driver, "/wash/hotel/pack/clothesInfoAdd.jsp");
            String clothesCode = executeAndTryToGetNuiValue("clothesCode");
            if (StringUtils.isEmpty(clothesCode)) {
                // 填充衣物编码
                clothesCode = RandomString.make(8) + "yu";
                executeAndTryToSetNuiValue("clothesCode", clothesCode);
            }
            clothesCodes.add(clothesCode);
            String packageType = executeAndTryToGetNuiValue("packageType");
            if (StringUtils.isEmpty(packageType)) {
                // 选择折叠的包装方式
                executeAndTryToSetNuiValue("packageType", "fold");
            }
            // 选择有瑕疵
            executeAndTryToSetNuiValue("hasFlaw", "1");
            // 选择瑕疵
            chooseCheckBox("flaw", Arrays.asList("200207104118191", "200207165223907"));
            // 选择有污渍
            executeAndTryToSetNuiValue("hasStain", "1");
            // 选择污渍
            chooseCheckBox("stain", Arrays.asList("160701144522651", "160701144740804", "160704105823293"));
            String removeableAttachment = executeAndTryToGetNuiValue("removeableAttachment");
            executeAndTryToSetNuiValue("removeableAttachment", "这是可拆卸附件啊|" + removeableAttachment);
            String mainColor = executeAndTryToGetNuiValue("mainColor");
            executeAndTryToSetNuiValue("mainColor", "这是主体色啊|" + mainColor);
            // 选择样式
            executeAndTryToSetNuiValue("style", "stripe");
            String remark = executeAndTryToGetNuiValue("remark");
            executeAndTryToSetNuiValue("remark", "这算是衣物备注额|" + remark);
            driver.findElementById("makeup").sendKeys(PropertiesUtils.getPropListRandomOne("pic.paths"));
            // 上传
            executeAndDoNothing(driver, "uploadFile('makeup')");
            sleep(2);
            // 点击保存
            tryToClick(driver, driver.findElementById("save_btn"));
            switchToParentFrame(driver);
            // 切换到接收衣物iframe
            switchToTargetFrameBySrc(driver, "/wash/hotel/pack/clothesReceive.jsp");
            // 点击弹框(div)确定按钮
            tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
            sleep();
            // 点击弹框(div)确定按钮
            tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
        }
        // 点击保存
        tryToClick(driver, driver.findElementById("save_bt"));
        // 点击弹框(div)确定按钮
        tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
        // 点击取消按钮关闭接收衣物页面
        executeAndDoNothing(driver, "onCancel()");
        return clothesCodes;
    }

    public void sortingBeforeWash(List<String> clothesCodes) {
        clickMenu("洗衣服务系统");
        clickMenu("洗前分拣管理", "sorting_before_wash");
        clickMenu("洗前分拣管理", "sorting_before_wash_manage");
        // 切换到洗前分拣管理iframe
        switchToTargetFrameById(driver, "iframe_sorting_before_wash_manage");
        sleep(2);
        boolean noChoose = true;
        for (String clothesCode : clothesCodes) {
            // 输入衣物编码
            executeAndDoNothing(driver, String.format("vue.$data.clothesCode='%s'", clothesCode));
            // 直接调用点击enter键触发的函数
            executeAndDoNothing(driver, "vue.getClothesInfoWithEnter()");
            waitEleDisappearById(driver, "divMask");
            if (noChoose) {
                noChoose = false;
                // 点击精洗
                tryToClick(driver, findsByCssSelect(driver, String.format("span[id='%s']", "191223130958787")).get(0));
            }
            // 点击确认
            tryToClick(driver, driver.findElementsByCssSelector("#layout1 > div.self-buttom-style > button").get(1));
            waitEleDisappearById(driver, "divMask");
        }
        switchToDefaultFrame(driver);
        clickMenu("洗前分拣管理", "sorting_before_wash");
        clickMenu("洗衣服务系统");
    }

    public void centerWashManager(int collectLimit) {
        clickMenu("洗衣服务系统");
        clickMenu("洗护管理");
        clickMenu("洗衣中心洗护管理");
        // 切换到洗衣中心洗护管理iframe
        switchToTargetFrameById(driver, "iframe_wash_manager");
        sleep(2);
        for (int i = 0; i < collectLimit; i++) {
            // 选择记录
            executeAndTryToSelectNuiGridRow("grid", i);
            // 点击质检
            executeAndDoNothing(driver, "check()");
            // 切换到质检iframe
            switchToTargetFrameBySrc(driver, "/wash/washCenterManager/checkClothesInfo.jsp");
            // 点击淡化
            tryToClick(driver, driver.findElementByCssSelector(String.format("#checkResultDiv > span[name='%s']", 3)));
            // 点击保存质检
            tryToClick(driver, driver.findElementsByCssSelector("#layout1 > div.self-buttom-style > button").get(2));
            waitEleDisappearByClassName(driver, "mini-tips-success");
            // 点击返回
            tryToClick(driver, driver.findElementByCssSelector("#layout1 > div.self-buttom-style > button"));
            switchToParentFrame(driver);
            // 点击终检
            executeAndDoNothing(driver, "finalcheck()");
            // 切换到终检iframe
            switchToTargetFrameBySrc(driver, "/wash/washCenterManager/finalCheckClothesInfo.jsp");
            // 点击保存终检
            tryToClick(driver, driver.findElementsByCssSelector("#layout1 > div.self-buttom-style > button").get(1));
            // 点击弹框(div)的确定
            tryToClick(driver, driver.findElementByCssSelector("div.mini-panel.mini-window.mini-window-drag span.mini-button-text"));
            // 点击返回
            tryToClick(driver, driver.findElementByCssSelector("#layout1 > div.self-buttom-style > button"));
            switchToParentFrame(driver);
        }
        switchToDefaultFrame(driver);
        clickMenu("洗护管理");
        clickMenu("洗衣服务系统");
    }

    public void clickMenu(String menuName) {
        WebElement webElement = driver.findElementByXPath(String.format("//input[@id='%s']/..", menuName));
        tryToClick(driver, webElement);
        sleep();
    }

    public void clickMenu(String menuName, String value) {
        WebElement webElement = driver.findElementByXPath(String.format("//input[@id='%s' and @value='%s']/..", menuName, value));
        tryToClick(driver, webElement);
        sleep();
    }

    public String executeAndTryToGetNuiValue(String nuiName) {
        return executeAndTryToGetData(driver, String.format("return nui.get('%s').getValue()", nuiName)).toString();
    }

    public void executeAndTryToSetNuiValue(String nuiName, String value) {
        executeAndDoNothing(driver, String.format("nui.get('%s').setValue('%s')", nuiName, value));
    }

    public void executeAndTryToSelectNuiGridRow(String gridName, int rowIndex) {
        executeAndDoNothing(driver, String.format("%s.select(%s.getRow(%s))", gridName, gridName, rowIndex));

    }

    public void chooseCheckBox(String nuiName, List<String> itemKeys) {
        for (String itemKey : itemKeys) {
            executeAndDoNothing(driver, String.format("nui.get('%s').setSelected('%s')", nuiName, itemKey));
        }
    }

    public ChromeDriver getDriver() {
        return driver;
    }

}
