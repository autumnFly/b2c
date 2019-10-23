nui.parse();

var suiteDatagrid = nui.get("suiteDatagrid");
var searchSuiteCondiForm = new nui.Form("searchSuiteCondiForm");

searchSuite();

function searchSuite() {
    var data = searchSuiteCondiForm.getData(true, true);
    suiteDatagrid.load(data);
}

function reset() {
    searchSuiteCondiForm.reset();
}

//业务字典显示中文名的方法
function gridBmwzDict(e) {
    var dictText = nui.getDictText("SUITE_STATUS", e.value);
    return dictText;
}

function openAddSuitePage() {
    nui.open({
        url: nui.context + "/wash/enterpriseItem/suite/suiteManagerAdd.jsp",
        showMaxButton: false,
        title: "洗涤套餐管理>>新增",
        width: '60%',
        height: '67%',
        ondestroy: function (action) {
            if (action == "success") {
                searchSuite();
            }
        }
    });
}


function openShowSuitePage() {
    var rows = suiteDatagrid.getSelecteds();
    if (rows.length == 0) {
        nui.alert("请至少选择一条数据进行操作！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    if (rows.length > 1) {
        nui.alert("只能选择一条数据进行查看！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    nui.open({
        url: nui.context + "/wash/enterpriseItem/suite/suiteManagerAdd.jsp",
        showMaxButton: false,
        title: "洗涤套餐管理>>查看",
        width: '60%',
        height: '67%',
        onload: function () {
            var iframe = this.getIFrameEl();
            var selectedSuiteInfo = rows[0];
            selectedSuiteInfo.action = "show";
            iframe.contentWindow.setData(selectedSuiteInfo);
        },
        ondestroy: function (action) {
            if (action == "success") {
                searchSuite();
            }
        }
    });

}

function openEditSuitePage() {
    var rows = suiteDatagrid.getSelecteds();
    if (rows.length == 0) {
        nui.alert("请至少选择一条数据进行操作！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    if (rows.length > 1) {
        nui.alert("只能选择一条数据进行编辑！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    var status = rows[0].status;
    if (status === 0) {
        nui.alert("无效状态不能编辑！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }

    nui.open({
        url: nui.context + "/wash/enterpriseItem/suite/suiteManagerAdd.jsp",
        showMaxButton: false,
        title: "洗涤套餐管理>>编辑",
        width: '60%',
        height: '67%',
        onload: function () {
            var iframe = this.getIFrameEl();
            var selectedSuiteInfo = rows[0];
            selectedSuiteInfo.action = "edit";
            iframe.contentWindow.setData(selectedSuiteInfo);
        },
        ondestroy: function (action) {
            if (action == "success") {
                searchSuite();
            }
        }
    });

}

function closeSuite() {
    var rows = suiteDatagrid.getSelecteds();
    if (rows.length == 0) {
        nui.alert("请至少选择一条数据进行操作！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    if (rows.length > 1) {
        nui.alert("只能选择一条数据进行关闭！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }

    if (rows[0].status === 0) {
        nui.alert("无效状态不能关闭！", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }

    nui.confirm("是否确定对选中套餐进行关闭操作？", "关闭", function (action) {
            if (action == "ok") {
                var messagebox = nui.loading("套餐关闭中，请稍候……", Bluemoon.CONSTANT.WARM_TIP);
                $.ajax({
                    url: nui.context + "/enterpriseItem/suite/closeSuite",
                    type: "POST",
                    data: nui.encode({suiteCode: rows[0].suiteCode}),
                    cache: false,
                    contentType: Bluemoon.CONSTANT.JSON_UTF8_VALUE,
                    success: function (resJsonObj) {
                        nui.hideMessageBox(messagebox);
                        if (resJsonObj.responseCode == 0) {
                            nui.alert("关闭成功！", Bluemoon.CONSTANT.WARM_TIP);
                            searchSuite();
                        } else {
                            nui.alert(resJsonObj.responseMsg, Bluemoon.CONSTANT.WARM_TIP);
                        }
                    },
                    error: function () {
                        nui.hideMessageBox(messagebox);
                        Bluemoon.reqError(Bluemoon.CONSTANT.WARM_TIP);
                    }
                });
            }
        }
    );

}