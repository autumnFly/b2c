/**
 * 放置通用的函数,属性等
 *
 * @author yudong
 */
var Bluemoon = {};
Bluemoon.CONSTANT = {
    WARM_TIP: "温馨提示",
    SYS_TIP: "系统信息",
    JSON_UTF8_VALUE: "application/json;charset=UTF-8",
    LOCAL_PICDATA_PREFIX: "data:image/jpeg;base64,",
    DATE_LONG_PATTERN: "yyyy-MM-dd HH:mm:ss"
};

Bluemoon.formatDate = function (cell) {
    var value = new Date(cell.value);
    return nui.formatDate(value, Bluemoon.CONSTANT.DATE_LONG_PATTERN);
};

Bluemoon.changePrice = function (value) {
    if (value == '') {
        value = '0.00';
    } else if (value == '0') {
        value = '0.00';
    } else if (value == '0.') {
        value = '0.00';
    } else if (/^0+\d+\.?\d*.*$/.test(value)) {
        value = value.replace(/^0+(\d+\.?\d*).*$/, '$1');
        value = inp.getRightPriceFormat(value).val;
    } else if (/^0\.\d$/.test(value)) {
        value = value + '0';
    } else if (!/^\d+\.\d{2}$/.test(value)) {
        if (/^\d+\.\d{2}.+/.test(value)) {
            value = value.replace(/^(\d+\.\d{2}).*$/, '$1');
        } else if (/^\d+$/.test(value)) {
            value = value + '.00';
        } else if (/^\d+\.$/.test(value)) {
            value = value + '00';
        } else if (/^\d+\.\d$/.test(value)) {
            value = value + '0';
        } else if (/^[^\d]+\d+\.?\d*$/.test(value)) {
            value = value.replace(/^[^\d]+(\d+\.?\d*)$/, '$1');
        } else if (/\d+/.test(value)) {
            value = value.replace(/^[^\d]*(\d+\.?\d*).*$/, '$1');
            ty = false;
        } else if (/^0+\d+\.?\d*$/.test(value)) {
            value = value.replace(/^0+(\d+\.?\d*)$/, '$1');
            ty = false;
        } else {
            value = '0.00';
        }
    }
    return value;
};

Bluemoon.formatBackgroundMoney = function (cell) {
    var value = Math.abs(cell.value) / 100;
    return nui.formatCurrency(value);
};

Bluemoon.formatInputMoney = function (th) {
    var v = th.value;
    v = Bluemoon.changePrice(v);
    th.setValue(v);
};

Bluemoon.onCancel = function () {
    nui.confirm("是否确认取消", "确定？", function (action) {
        if (action == "ok") {
            Bluemoon.closeWindow("cancel");
        }
    });
};

Bluemoon.closeWindow = function (action) {
    if (window.CloseOwnerWindow) {
        return window.CloseOwnerWindow(action);
    } else {
        window.close();
    }
};

Bluemoon.reqSuccess = function (resJsonObj, successMsg, titleMsg) {
    var isSuccess = resJsonObj.isSuccess;
    var responseMsg = resJsonObj.responseMsg;
    if (!isSuccess) {
        nui.alert(responseMsg, titleMsg);
        return;
    }
    nui.alert(successMsg, titleMsg, function () {
        window.CloseOwnerWindow("success");
    });
};

Bluemoon.reqError = function (titleMsg) {
    nui.alert("网络繁忙，请稍后再试。", titleMsg);
};

Bluemoon.createEqualFunc = function (uniqueKey) {
    return function (obj1, obj2) {
        if (obj1[uniqueKey] === obj2[uniqueKey]) {
            return true;
        } else {
            return false;
        }
    };
};

/**
 *从chooseArray数组筛选出不存在originArray中的记录
 * @param orignialArray
 * @param chooseArray
 * @param equalFunc 比较记录是否相等的函数
 * @returns 所有不重复的记录数组
 */
Bluemoon.filterRepeatRecord = function (orignialArray, chooseArray, equalFunc) {
    if (orignialArray.length === 0) {
        return chooseArray;
    }
    var noRepeatRecordArray = $.grep(chooseArray, function (chooseObj, index) {
        for (var i = 0; i < orignialArray.length; i++) {
            var originalObj = orignialArray[i];
            if (equalFunc(chooseObj, originalObj)) {
                return;
            }
        }
        return chooseObj;
    });
    return noRepeatRecordArray;
};

Bluemoon.validatePic = function (fileObj, fileSize) {
    if (typeof fileObj == 'undefined') {
        throw new Error("请选择图片");
    }
    if (fileObj.size > 1024 * fileSize) {
        throw new Error("大小：不大于" + fileSize + "k；请重新上传");
    }
    if (!/image\/\w+/.test(fileObj.type)) {
        throw new Error("请选择图像类型的文件");
    }
};

Bluemoon.imageHolder = {};
Bluemoon.Image = function (maxNum) {
    // 保存图片的数组,结构[{data:"http://xxxx.img",inPage:false}]
    this.pathOrBase64Datas = [];
    // 允许的最大张数
    this.maxNum = maxNum;
    // 当前pathOrBase64Datas数组已持有的图片张数
    this.currentNum = 0;

    if (Bluemoon.Image.prototype.addPathOrBase64DataAndShow !== undefined) {
        return;
    }

    Bluemoon.Image.prototype.addPathOrBase64DataAndShow = function (inputId, showAreaId, fileSize) {

        if (this.currentNum === this.maxNum) {
            throw new Error("最多上传" + this.maxNum + "张图片");
        }

        var fileObj = $("#" + inputId)[0].files[0];
        Bluemoon.validatePic(fileObj, fileSize);

        var that = this;
        lrz(fileObj, {width: 500}, function (image) {
            that.pathOrBase64Datas[that.currentNum++] = {data: image.base64, inPage: false};
            that.showPic(showAreaId);
        });
    };

    Bluemoon.Image.prototype.showPic = function (showAreaId) {
        for (var i = 0; i < this.pathOrBase64Datas.length; i++) {

            if (this.pathOrBase64Datas[i].inPage) {
                // 此对象已经显示在页面,跳过
                continue;
            }
            this.pathOrBase64Datas[i].inPage = true;

            var that = this;
            var delImg = $('<img class="delbtn" style="width: 20px;height: 20px;position: absolute" src="../../../images/del.png" title="删除"/>')
                .data("imgIndex", i).bind("click", function () {
                    var otherThat = this;
                    nui.confirm("是否确认删除图片?", Bluemoon.CONSTANT.SYS_TIP, function (action) {
                        if (action !== "ok") {
                            return;
                        }
                        that.pathOrBase64Datas.splice($(otherThat).data("imgIndex"), 1);
                        $(otherThat).parent().remove();
                        that.currentNum--;
                    });
                });

            var uploadImg = $('<img class="bg-img" style="width: 110px;height: 110px;margin-bottom: 4px;"/>')
                .attr("src", this.pathOrBase64Datas[i].data).data("imgIndex", i).bind("click", function () {

                    // 点击显示大图
                    $("div#showImg").find("img")
                        .attr("src", that.pathOrBase64Datas[$(this).data("imgIndex")].data)
                        .end().css("display", "block")
                        .bind("click", function () {
                            // 点击大图时隐藏掉大图本身
                            $(this).css("display", "none");
                        });

                });

            var div = $("<div style='width:110px;display: inline;margin:2px;'></div>");
            div.append(delImg).append(uploadImg);

            $("#" + showAreaId).find("td").append(div);
        }
    };

    /**
     * 过滤掉inPage属性,返回易于处理的对象以便传给后端
     * @returns {{pathOrBase64Datas: *, maxNum: *, currentNum: *}}
     */
    Bluemoon.Image.prototype.filterInPageProp = function () {
        var arr = $.map(this.pathOrBase64Datas, function (item, index) {
            return item.data.replace(Bluemoon.CONSTANT.LOCAL_PICDATA_PREFIX, "");
        });
        return {
            pathOrBase64Datas: arr,
            maxNum: this.maxNum,
            currentNum: this.currentNum
        };

    };

    /**
     * 初始化image对象,填充回inPage属性
     * @param imgArr 图片数组
     * @param imgNum 图片允许的最大数量
     */
    Bluemoon.Image.prototype.fillInPageProp = function (imgArr, imgNum) {
        var arr = $.map(imgArr, function (item, index) {
            return {data: item, inPage: false};
        });
        this.pathOrBase64Datas = arr;
        this.maxNum = imgNum;
        this.currentNum = arr.length;
    };
};
