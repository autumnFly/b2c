package org.javamaster.b2c.selenium.helper;

import static java.util.stream.Collectors.toList;
import net.bytebuddy.utility.RandomString;
import org.javamaster.b2c.selenium.utils.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/8/3
 */
public class BluemoonSeleniumHelper {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private ChromeDriver browser;

    public BluemoonSeleniumHelper() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yu\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    public void exitBrowser() {
        browser.quit();
    }

    public void loginToSystem(String username, String password) throws Exception {
        String baseUrl = "http://angelapi.bluemoon.com.cn/portal-admin/login.html";
        browser.get(baseUrl);
        findByEleId("username").sendKeys(username);
        findByEleId("password").sendKeys(password);
        findByEleId("rand").sendKeys("8888");
        // 点击登录
        tryToClick(findByEleId("onLogin"));
    }

    public List<String> bagCollect(String angelCode) throws Exception {
        clickMenu("menu-first", "洗衣服务系统");
        clickMenu("menu-second", "收衣管理");
        clickMenu("menu-second", "收衣袋接收");
        // 切换到收衣袋接收iframe
        switchToTargetFrameById("iframe_hotel_pack_receive_manager");
        // 点击接收收衣袋
        tryToClick(findByEleId("addExceptionClothes"));
        // 切换到接收收衣袋iframe
        switchToChildFrame();
        // 输入转交人编码并点击enter健
        findByEleId("empCode$text").sendKeys(angelCode + Keys.ENTER);
        List<Map<String, Object>> mapList = executeAndTryToGetList("return grid.data");
        // 得到所有的收衣袋编码
        List<String> bagCodes = mapList.stream()
                .map(map -> map.get("packCode").toString())
                .collect(toList());
        for (String bagCode : bagCodes) {
            // 输入收衣袋编码并点击enter健
            findByEleId("searchPackCode$text").sendKeys(bagCode + Keys.ENTER);
            // 点击弹框(div)的确定按钮关闭弹框
            tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
        }
        // 点击完成收衣袋接收
        tryToClick(findByEleId("save_bt"));
        // 点击弹框(div)的确定按钮关闭弹框
        tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
        return bagCodes;
    }

    public List<String> bagCollectManage(int collectLimit) throws Exception {
        List<String> clothesCodes = new ArrayList<>();
        clickMenu("menu-first", "洗衣服务系统");
        clickMenu("menu-second", "收衣管理");
        clickMenu("menu-second", "收衣袋收衣管理");
        // 切换到收衣袋收衣管理iframe
        switchToTargetFrameById("iframe_hotel_clothes_receive_manager");
        for (int i = 0; i < collectLimit; i++) {
            // 固定选择第一条记录
            executeAndTryToSelectNuiGridRow("grid", 0);
            // 点击接收衣物
            tryToClick(findByEleId("receiveClothes"));
            clothesCodes.addAll(bagCollectManage());
            browser.switchTo().defaultContent();
            // 切换回收衣袋收衣管理iframe
            switchToTargetFrameById("iframe_hotel_clothes_receive_manager");
            waitMiniMaskDisappear();
        }
        return clothesCodes;
    }

    private List<String> bagCollectManage() throws Exception {
        List<String> clothesCodes = new ArrayList<>();
        // 切换到接收衣物iframe
        switchToTargetFrameBySrc("/wash/hotel/pack/clothesReceive.jsp");
        // 选择出库方式
        executeAndTryToSetNuiValue("outWays", "pick_up_out_way");
        List<Map<String, Object>> mapList = executeAndTryToGetList("return grid.data");
        for (int i = 0; i < mapList.size(); i++) {
            // 选择待登记衣物
            executeAndTryToSelectNuiGridRow("grid", i);
            // 点击登记衣物信息
            tryToClick(findByEleId("save_bt_1"));
            switchToParentFrame();
            // 切换到登记衣物iframe
            switchToTargetFrameBySrc("/wash/hotel/pack/clothesInfoAdd.jsp");
            String clothesCode = executeAndTryToGetNuiValue("clothesCode");
            if (StringUtils.isEmpty(clothesCode)) {
                // 没有衣物编码
                clothesCode = RandomString.make(8) + "yu";
                executeAndTryToSetNuiValue("clothesCode", clothesCode);
            }
            clothesCodes.add(clothesCode);
            // 选择折叠的包装方式
            executeAndTryToSetNuiValue("packageType", "fold");
            // 选择有瑕疵
            executeAndTryToSetNuiValue("hasFlaw", "1");
            // 选择瑕疵
            chooseCheckBox("flaw", Arrays.asList("200207104118191", "200207165223907"));
            // 选择有污渍
            executeAndTryToSetNuiValue("hasStain", "1");
            // 选择污渍
            chooseCheckBox("stain", Arrays.asList("160701144522651", "160701144740804", "160704105823293"));
            executeAndTryToSetNuiValue("removeableAttachment", "这是可拆卸附件啊");
            executeAndTryToSetNuiValue("mainColor", "这是主体色啊");
            // 选择样式
            executeAndTryToSetNuiValue("style", "stripe");
            executeAndTryToSetNuiValue("remark", "这算是衣物备注额");
            findByEleId("makeup").sendKeys("C:\\Users\\yu\\Pictures\\9bda5f3a079a0561bc256447991afeed.jpg");
            // 上传
            browser.executeScript("uploadFile('makeup')");
            // 点击保存
            tryToClick(findByEleId("save_btn"));
            switchToParentFrame();
            // 切换到接收衣物iframe
            switchToTargetFrameBySrc("/wash/hotel/pack/clothesReceive.jsp");
            // 点击弹框(div)确定按钮
            tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
            sleep();
            // 点击弹框(div)确定按钮
            tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
        }
        // 点击保存
        tryToClick(findByEleId("save_bt"));
        // 点击弹框(div)确定按钮
        tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
        // 点击取消按钮关闭接收衣物页面
        browser.executeScript("onCancel()");
        return clothesCodes;
    }

    public void sortingBeforeWash(List<String> clothesCodes) throws Exception {
        clickMenu("menu-first", "洗衣服务系统");
        clickMenu("menu-second", "洗前分拣管理");
        clickMenu("menu-third__name", "洗前分拣管理", "/wash/sortingCommunication/clothesSorting.jsp");
        // 切换到洗前分拣管理iframe
        switchToTargetFrameById("iframe_sorting_before_wash_manage");
        boolean noChoose = true;
        for (String clothesCode : clothesCodes) {
            // 输入衣物编码
            executeAndDoNothing(String.format("vue.$data.clothesCode='%s'", clothesCode));
            // 直接调用点击enter键触发的函数
            executeAndDoNothing("vue.getClothesInfoWithEnter()");
            waitEleDisappearById("divMask");
            if (noChoose) {
                noChoose = false;
                // 点击精洗
                tryToClick(findsByCssSelect(String.format("span[id='%s']", "191223130958787")).get(0));
            }
            // 点击确认
            tryToClick(findsByCssSelect("#layout1 > div.self-buttom-style > button").get(1));
            waitEleDisappearById("divMask");
        }
    }

    public void centerWashManager(int collectLimit) throws Exception {
        clickMenu("menu-first", "洗衣服务系统");
        clickMenu("menu-second", "洗护管理");
        clickMenu("menu-second", "洗衣中心洗护管理");
        // 切换到洗衣中心洗护管理iframe
        switchToTargetFrameById("iframe_wash_manager");
        for (int i = 0; i < collectLimit; i++) {
            // 选择记录
            executeAndTryToSelectNuiGridRow("grid", i);
            // 点击质检
            executeAndDoNothing("check()");
            // 切换到质检iframe
            switchToTargetFrameBySrc("/wash/washCenterManager/checkClothesInfo.jsp");
            // 点击淡化
            tryToClick(findsByCssSelect(String.format("#checkResultDiv > span[name='%s']", 3)).get(0));
            // 点击保存质检
            tryToClick(findsByCssSelect("#layout1 > div.self-buttom-style > button").get(2));
            waitEleDisappearByClassName("mini-tips-success");
            // 点击返回
            tryToClick(findsByCssSelect("#layout1 > div.self-buttom-style > button").get(0));
            switchToParentFrame();
            // 点击终检
            executeAndDoNothing("finalcheck()");
            // 切换到终检iframe
            switchToTargetFrameBySrc("/wash/washCenterManager/finalCheckClothesInfo.jsp");
            // 点击保存终检
            tryToClick(findsByCssSelect("#layout1 > div.self-buttom-style > button").get(1));
            // 点击弹框(div)的确定
            tryToClick(findsByCssSelect("div.mini-panel.mini-window.mini-window-drag span.mini-button-text").get(0));
            // 点击返回
            tryToClick(findsByCssSelect("#layout1 > div.self-buttom-style > button").get(0));
            switchToParentFrame();
        }
    }

    public String executeAndTryToGetNuiValue(String nuiName) throws Exception {
        while (true) {
            try {
                return browser.executeScript(String.format("return nui.get('%s').getValue()", nuiName)).toString();
            } catch (WebDriverException e) {
                logger.error("tryToGetNuiValue:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
            sleep();
        }
    }

    public void executeAndTryToSetNuiValue(String nuiName, String value) throws Exception {
        while (true) {
            try {
                browser.executeScript(String.format("nui.get('%s').setValue('%s')", nuiName, value));
                break;
            } catch (Exception e) {
                logger.error("tryToSetNuiValue:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
            sleep();
        }
    }

    public void executeAndTryToSelectNuiGridRow(String gridName, int rowIndex) throws Exception {
        Object object = executeAndTryToGetData(String.format("return %s.getRow(%s)", gridName, rowIndex));
        logger.info("executeAndTryToSelectNuiGridRow:" + object.getClass().getSimpleName());
        browser.executeScript(String.format("%s.select(%s.getRow(%s))", gridName, gridName, rowIndex));
    }

    @SuppressWarnings("ALL")
    public List<Map<String, Object>> executeAndTryToGetList(String script) throws Exception {
        List<Map<String, Object>> mapList;
        while (true) {
            try {
                mapList = (List<Map<String, Object>>) browser.executeScript(script);
                if (!mapList.isEmpty()) {
                    break;
                }
            } catch (Exception e) {
                logger.error("executeAndTryToGetList:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
            sleep();
        }
        return mapList;
    }


    public Object executeAndTryToGetData(String script) throws Exception {
        Object object;
        while (true) {
            try {
                object = browser.executeScript(script);
                if (object != null) {
                    break;
                }
            } catch (Exception e) {
                logger.error("executeAndTryToGetData:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
            sleep();
        }
        return object;
    }

    public void executeAndDoNothing(String script) throws Exception {
        while (true) {
            try {
                browser.executeScript(script);
                break;
            } catch (Exception e) {
                logger.error("executeAndDoNothing:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
            }
            sleep();
        }
    }

    public void waitEleDisappearById(String id) throws Exception {
        sleep();
        while (existsElementById(id)) {
            sleep();
        }
    }

    public void waitEleDisappearByClassName(String className) throws Exception {
        sleep();
        while (existsElementByClassName(className)) {
            sleep();
        }
    }

    public void waitMiniMaskDisappear() throws Exception {
        waitEleDisappearByClassName("mini-mask");
    }

    public void chooseCheckBox(String nuiName, List<String> itemKeys) {
        for (String itemKey : itemKeys) {
            browser.executeScript(String.format("nui.get('%s').setSelected('%s')", nuiName, itemKey));
        }
    }

    public void switchToChildFrame() throws Exception {
        while (true) {
            try {
                browser.switchTo().frame(0);
                break;
            } catch (Exception e) {
                logger.error("switchToChildFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public void switchToDefaultFrame() throws Exception {
        while (true) {
            try {
                browser.switchTo().defaultContent();
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToDefaultFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public void switchToTargetFrameById(String frameId) throws Exception {
        while (true) {
            try {
                browser.switchTo().frame(frameId);
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrameById:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }


    public void switchToTargetFrameBySrc(String src) throws Exception {
        List<WebElement> list = browser.findElementsByTagName("iframe");
        for (WebElement webElement : list) {
            String eleSrc = webElement.getAttribute("src");
            if (!eleSrc.contains(src)) {
                continue;
            }
            switchToTargetFrame(webElement);
            return;
        }
    }

    private void switchToParentFrame() throws Exception {
        while (true) {
            try {
                browser.switchTo().parentFrame();
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    private void switchToTargetFrame(WebElement webElement) throws Exception {
        while (true) {
            try {
                browser.switchTo().frame(webElement);
                sleep();
                break;
            } catch (Exception e) {
                logger.error("switchToTargetFrame:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public WebElement findByEleId(String id) throws Exception {
        while (true) {
            try {
                return browser.findElementById(id);
            } catch (Exception e) {
                logger.error("findByEleId:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public boolean existsElementById(String id) {
        try {
            browser.findElementById(id);
            return true;
        } catch (Exception e) {
            logger.error("existsElementById:" + id);
            return false;
        }
    }

    public boolean existsElementByClassName(String className) {
        List<WebElement> list = browser.findElementsByClassName(className);
        return !list.isEmpty();
    }

    public List<WebElement> findsByCssSelect(String cssSelect) throws Exception {
        List<WebElement> list;
        while (true) {
            list = browser.findElementsByCssSelector(cssSelect);
            if (!list.isEmpty()) {
                break;
            }
            logger.error("findsByCssSelect list empty:" + cssSelect);
            sleep();
        }
        return list;
    }

    public List<WebElement> findsByClassName(String className) throws Exception {
        List<WebElement> list;
        while (true) {
            list = browser.findElementsByClassName(className);
            if (!list.isEmpty()) {
                break;
            }
            logger.error("findsByClassName list empty:" + className);
            sleep();
        }
        return list;
    }

    public void tryToClick(WebElement webElement) throws Exception {
        while (true) {
            try {
                webElement.click();
                break;
            } catch (Exception e) {
                logger.error("tryToClick:{},{}", e.getClass().getSimpleName(), e.getMessage().substring(0, 100));
                sleep();
            }
        }
    }

    public void clickMenu(String className, String menuName, String... urls) throws Exception {
        List<WebElement> list = findsByClassName(className);
        if (urls.length == 0) {
            WebElement webElement = list.stream()
                    .filter(webElement1 ->
                            menuName.equals(webElement1.getAttribute("title"))
                    )
                    .collect(toList())
                    .get(0);
            tryToClick(webElement);
        } else {
            String url = urls[0];
            WebElement webElement = list.stream()
                    .filter(webElement1 -> {
                                String eleUrl = webElement1.getAttribute("url");
                                return eleUrl != null && webElement1.getAttribute("url").contains(url);
                            }
                    )
                    .collect(toList())
                    .get(0);
            tryToClick(webElement);
        }
    }

    public void sleep() throws Exception {
        TimeUnit.SECONDS.sleep(2);
    }
}
