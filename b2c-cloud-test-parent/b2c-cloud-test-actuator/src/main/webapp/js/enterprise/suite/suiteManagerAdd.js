nui.parse();

var PAGE_ACTION_TAG = "";
var showDetail = nui.get("showDetail");

showDetail.setData([{id: 1, text: "开启"}, {id: 0, text: "关闭"}]);
showDetail.on("valuechanged", function (e) {

    $("tr.picShow").toggleClass("show");
    $("tr.picShow").toggleClass("hide");

});


var suiteDetailForm = new nui.Form("suiteDetailForm");

nui.payload(true);

var productDatagrid = nui.get("productDatagrid");

function openAddProductsPage() {
    nui.open({
        url: Bluemoon.CONTEXT_PATH + "/wash/enterpriseItem/suite/suiteManagerProductAdd.jsp",
        showMaxButton: false,
        title: "选择洗涤产品",
        width: '50%',
        height: '50%',
        ondestroy: function (action) {
            if (action === "confirm") {
                var iframe = this.getIFrameEl();
                var data = iframe.contentWindow.getData();
                data = nui.clone(data);
                for (var i = 0; i < data.length; i++) {
                    data[i].num = "请填写数量";
                }

                var curData = productDatagrid.getData();
                var noRepeatArray = Bluemoon.filterRepeatRecord(curData, data, Bluemoon.createEqualFunc("productSku"));
                curData = curData.concat(noRepeatArray);

                productDatagrid.setData(curData);
            }
        }
    });
}

function delProduct() {
    var rows = productDatagrid.getSelecteds();
    if (rows.length === 0) {
        nui.alert("请至少选择一条记录!", Bluemoon.CONSTANT.SYS_TIP);
        return;
    }
    nui.confirm("确定要删除选中的洗涤产品吗？", Bluemoon.CONSTANT.SYS_TIP, function (action) {
        if (action !== "ok") {
            return;
        }
        productDatagrid.removeRows(rows);
        nui.alert("删除成功!", Bluemoon.CONSTANT.SYS_TIP);
    });

}

function saveSuite() {

    try {
        // validateAll(suiteDetailForm, productDatagrid, showDetail);
    } catch (e) {
        nui.alert(e.message, Bluemoon.CONSTANT.WARM_TIP);
        return;
    }

    var data = suiteDetailForm.getData();
    productDatagrid.selectAll(false);
    data.products = productDatagrid.getSelecteds();
    data.marketPrice = parseFloat(data.marketPrice) * 100;
    data.showDetail = showDetail.value;

    for (var key in Bluemoon.imageHolder) {
        data[key] = Bluemoon.imageHolder[key].filterInPageProp();
    }

    var messagebox = nui.loading("数据保存中，请稍候……", Bluemoon.CONSTANT.SYS_TIP);
    $.ajax({
        url: Bluemoon.CONTEXT_PATH + "/enterpriseItem/suite/saveSuite",
        type: 'POST',
        data: nui.encode(data),
        cache: false,
        async: false,
        contentType: Bluemoon.CONSTANT.JSON_UTF8_VALUE,
        success: function (resJsonObj) {
            nui.hideMessageBox(messagebox);
            Bluemoon.reqSuccess(resJsonObj, "保存成功！", Bluemoon.CONSTANT.SYS_TIP);
        },
        error: function () {
            nui.hideMessageBox(messagebox);
            Bluemoon.reqError(Bluemoon.CONSTANT.SYS_TIP);
        }
    });

}

function fillSuiteDataToPage(selectedSuiteInfo) {

    nui.get("opName").setValue(selectedSuiteInfo.opName);
    nui.get("opCode").setValue(selectedSuiteInfo.opCode);
    nui.get("suiteCode").setValue(selectedSuiteInfo.suiteCode);
    nui.get("suiteName").setValue(selectedSuiteInfo.suiteName);

    var marketPrice = selectedSuiteInfo.marketPrice / 100;
    nui.get("marketPrice").setValue(Bluemoon.changePrice(marketPrice));

    fillImgToPage([].concat(selectedSuiteInfo.mainPicture), "mainPic", "trShowMainPic", 1);
    fillImgToPage(selectedSuiteInfo.specificsPicturesArray, "specificsPic", "trSpecificsPic", 6);
    fillImgToPage(selectedSuiteInfo.detailPicturesArray, "detailPic", "trDetailPic", 6);


    nui.get("showDetail").setValue(selectedSuiteInfo.showDetail);

    var reqJsonStr = nui.encode({suiteCode: selectedSuiteInfo.suiteCode});
    $.ajax({
        url: Bluemoon.CONTEXT_PATH + "/enterpriseItem/suite/getSuiteProductsBySuiteCode",
        type: "POST",
        data: reqJsonStr,
        cache: false,
        contentType: Bluemoon.CONSTANT.JSON_UTF8_VALUE,
        success: function (resJsonObj) {
            productDatagrid.setData(resJsonObj.data);
        }
    });

}

/**
 *
 * @param imgArr 图片数组,[{data:?,inPage:?}]
 * @param inputId input类型为file的元素id
 * @param showAreaId 图片展示区域tr的id
 * @param imgNum 图片允许的最大张数
 */
function fillImgToPage(imgArr, inputId, showAreaId, imgNum) {
    if (Bluemoon.imageHolder[inputId] == null) {
        Bluemoon.imageHolder[inputId] = new Bluemoon.Image(imgNum);
    }
    Bluemoon.imageHolder[inputId].fillInPageProp(imgArr, imgNum);
    Bluemoon.imageHolder[inputId].showPic(showAreaId);
}

function setData(selectedSuiteInfo) {

    PAGE_ACTION_TAG = selectedSuiteInfo.action;

    selectedSuiteInfo = nui.clone(selectedSuiteInfo);
    nui.get("opTime").setValue(nui.formatDate(new Date(selectedSuiteInfo.opTime), Bluemoon.CONSTANT.DATE_LONG_PATTERN));

    fillSuiteDataToPage(selectedSuiteInfo);

    if (selectedSuiteInfo.showDetail === 0) {
        $("tr.show").addClass("hidden");
        $("tr.hidden").removeClass("show");
    }

    var originalColor = $(":input").css("background");
    $(":input").css("background", "#EEEEEE");

    if (selectedSuiteInfo.action === "edit") {

        $("input#mainPic").css("background", "#FFFFFF");
        $("input[name=suiteName]").css("background", originalColor);
        $("input#goodsInfo_specificsPic").css("background", "#FFFFFF");
        $("input#goodsInfo_detailPic").css("background", "#FFFFFF");
        $("input[name=marketPrice]").attr("disabled", "disabled");
        $("#addProductButton,#delProductButton").css("visibility", "hidden");
        $("input[name=numInput]").attr("disabled", "disabled");

    } else if (selectedSuiteInfo.action === "show") {

        $(":input").attr("disabled", "disabled");
        $("#mainButtonArea,#specificsButtonArea,#detailButtonArea").css("visibility", "hidden");
        $("img.delbtn").css("visibility", "hidden");
        $("#addProductButton,#delProductButton").css("visibility", "hidden");
        $("input[name=numInput]").attr("disabled", "disabled");
        $("#save_bt").css("display", "none");

        $("#cancel_bt>span").text("返回");
        $("#cancel_bt").bind("click", function (e) {
            Bluemoon.closeWindow("close");
        });
    }
}

function uploadFile(inputId, imgNum, showAreaId) {

    try {
        if (Bluemoon.imageHolder[inputId] === undefined) {
            Bluemoon.imageHolder[inputId] = new Bluemoon.Image(imgNum);
        }
        Bluemoon.imageHolder[inputId].addPathOrBase64DataAndShow(inputId, showAreaId, 100);
    } catch (e) {
        nui.alert(e.message, Bluemoon.CONSTANT.SYS_TIP);
    } finally {
        $("#" + inputId)[0].value = null;
    }

}

function setCellReadOnly(cell) {
    if (PAGE_ACTION_TAG === "show" || PAGE_ACTION_TAG === "edit") {
        cell.column.readOnly = true;
    }
    return cell.value;
}

function validateAll(suiteDetailFormObj, productDatagridObj, showDetailObj) {
    suiteDetailFormObj.validate();
    if (!suiteDetailFormObj.isValid()) {
        throw new Error("有必填字段未填写或者不符合填写规范");
    }

    var file = suiteDetailForm.getData().file;
    if (file.pic_mainPic_1 === "" || file.pic_mainPic_1 === null) {
        throw new Error("请选择主图图片");
    }

    if (showDetailObj.value === "1") {
        var specificsBool = false;
        var detailBool = false;
        for (var key in file) {
            if (key.indexOf("specificsPic") != -1) {
                if (file[key] !== "" && file[key] !== null) {
                    specificsBool = true;
                }
            } else if (key.indexOf("detailPic") != -1) {
                if (file[key] !== "" && file[key] !== null) {
                    detailBool = true;
                }
            }
        }
        if (!specificsBool) {
            throw new Error("请至少添加一张细节图");
        }
        if (!detailBool) {
            throw new Error("请至少添加一张详情图");
        }
    }

    productDatagridObj.selectAll(false);
    var proDatas = productDatagridObj.getSelecteds();
    if (proDatas.length == 0) {
        throw new Error("请选择产品信息");
    }

    var reg = /(^[1-9]\d*$)/;
    for (var i = 0; i < proDatas.length; i++) {
        if (!reg.test(proDatas[i].num)) {
            throw new Error("数量请输入正整数");
        }
    }

}