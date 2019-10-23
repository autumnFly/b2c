<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>新增套餐</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <%@include file="/nui/common.jsp" %>
</head>
<script src="${pageContext.request.contextPath}/js/fileupload.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/lrz.mobile.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/common.js" type="text/javascript"></script>
<style type="text/css">
    .nui-fit {
        border: 0;
        background: none;
        cursor: default;
    }

    .show {
        display: table-row;
    }

    .hide {
        display: none;
    }

    #showImg {
        z-index: 9999;
        width: 450px;
        height: 300px;
        position: absolute;
        left: 50%;
        top: 50%;
        margin-left: -325px;
        margin-top: -225px;
    }

</style>
<body>
<div style="height: 100%;">
    <form id="suiteDetailForm">
        <div id="codeInfo">
            <table>
                <tr>
                    <th style="padding: 5px 0px 5px 5px; width: 10%;" align="right">操作人：</th>
                    <td align="left" style="width: 15%;"><input
                            class="nui-textbox nui-form-input" name="opName"
                            id="opName" enabled="false" value="${sessionScope.user.realName}"/></td>
                    <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">操作人编号：</th>
                    <td align="left" style="width: 15%;"><input
                            class="nui-textbox nui-form-input" name="opCode"
                            id="opCode" enabled="false" value="${sessionScope.user.account}"/></td>
                    <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">操作时间：</th>
                    <jsp:useBean id="now" class="java.util.Date"/>
                    <td align="left" style="width: 20%;">
                        <input id="opTime"
                               class="nui-textbox nui-form-input"
                               name="opTime"
                               value="<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss" />"
                               enabled="false"
                               id="opTime"/>
                    </td>
                    <th style="padding: 5px 0px 5px 5px; width: 1%;" align="right"></th>
                </tr>
            </table>
            <fieldset>
                <legend>
                    <strong style="size: 20px;">商品信息</strong>
                </legend>
                <table style="width: 100%;">
                    <tr>
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">套餐编号<span
                                style="color: red;">*</span>：
                        </th>
                        <td align="left" style="width: 30%;">
                            <input
                                    class="nui-textbox" name="suiteCode"
                                    id="suiteCode" enabled="false"
                                    emptyText="自动生成"/>
                        </td>
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">套餐名称<span
                                style="color: red;">*</span>：
                        </th>
                        <td align="left" style="border-top: 1px #cccccc solid;" colspan="3">
                            <input class="nui-textbox"
                                   width="94%" required="true" vtype="maxLength:10"
                                   name="suiteName" maxLengthErrorText="不能超过{0}个字符"
                                   id="suiteName"
                                   emptyText="不超过10个汉字"/>
                        </td>
                    </tr>
                    <tr>
                        <th
                                style="padding: 5px 0px 5px 5px; border-top: 1px #cccccc solid;"
                                align="right">市场价<span style="color: red">&nbsp;*</span>：
                        </th>
                        <td align="left" style="border-top: 1px #cccccc solid;" colspan="3">
                            <input class="nui-textbox"
                                   vtype="maxLength:9" maxLengthErrorText="不能超过{0}位"
                                   name="marketPrice" id="marketPrice"
                                   required="true" vtype="float" onblur="Bluemoon.formatInputMoney(this)"
                                   emptyText="两位小数点，正整数"/>
                        </td>
                    </tr>
                    <tr>
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">套餐主图<span
                                style="color: red;">*</span>：
                        </th>
                        <td align="left" colspan="3" id="mainButtonArea">
                            <div align="left">
                                <input accept="image/*" type="file" class="picFile" id="mainPic"/>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <a class="nui-button" iconCls="icon-upload"
                                   onclick="uploadFile('mainPic',1,'trShowMainPic')">上传</a>
                                <span size="1">&nbsp;&nbsp;&nbsp;&nbsp;建议图片尺寸：200*200px，不大于100k</span>
                            </div>
                        </td>
                    </tr>
                    <!-- 展示图片区域 -->
                    <tr id="trShowMainPic">
                        <th></th>
                        <td colspan="7"></td>
                    </tr>
                    <tr>
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">查看详情<span
                                style="color: red;">*</span>：
                        </th>
                        <td>
                            <div id="showDetail" name="showDetail" class="mini-radiobuttonlist" repeatItems="2"
                                 repeatLayout="table"
                                 repeatDirection="horizontal"
                                 textField="text" valueField="id" value="1">
                            </div>
                        </td>
                    </tr>

                    <tr class="picShow show">
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">套餐细节图<span
                                style="color: red;">*</span>：
                        </th>
                        <td align="left" colspan="7" id="specificsButtonArea">
                            <input accept="image/*" type="file" class="picFile" id="specificsPic"/>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a class="nui-button" iconCls="icon-upload" style="height:19px;"
                               onclick="uploadFile('specificsPic',6,'trSpecificsPic')">上传</a>
                            <span size="1">&nbsp;&nbsp;&nbsp;&nbsp;建议图片宽为750px，高不超过750px，单张不大于200k，最多6张</span>
                        </td>
                    </tr>
                    <!-- 展示图片区域 -->
                    <tr id="trSpecificsPic" class="picShow show">
                        <th></th>
                        <td colspan="7"></td>
                    </tr>

                    <tr class="picShow show">
                        <th style="padding: 5px 0px 5px 5px; width: 15%;" align="right">套餐详情图<span
                                style="color: red;">*</span>：
                        </th>
                        <td align="left" colspan="7" id="detailButtonArea">
                            <input accept="image/*" type="file" class="picFile" id="detailPic"/>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a class="nui-button" iconCls="icon-upload" style="height:19px;"
                               onclick="uploadFile('detailPic',6,'trDetailPic')">上传</a>
                            <span size="1">&nbsp;&nbsp;&nbsp;&nbsp;建议图片宽为750px，高不超过750px，单张不大于200k，最多8张</span>
                        </td>
                    </tr>
                    <!-- 展示图片区域 -->
                    <tr id="trDetailPic" class="picShow show">
                        <th></th>
                        <td colspan="7"></td>
                    </tr>
                </table>
            </fieldset>
            <fieldset style="height: 200px;">
                <legend>
                    <strong style="size: 20px;">产品信息</strong>
                </legend>
                <a class="mini-button" id="addProductButton" iconCls="icon-add" onclick="openAddProductsPage()">添加产品</a>
                <a class="mini-button" id="delProductButton" iconCls="icon-cancel" onclick="delProduct()">删除</a>

                <div class="nui-fit">
                    <div id="productDatagrid" class="nui-datagrid" style="width:100%;height:100%;"
                         dataField="products" showPageIndex="false" showPageSize="false"
                         allowCellEdit="true" allowCellSelect="true"
                         allowResize="true" showPager="false" multiSelect="true" allowCellValid="true">
                        <div property="columns">
                            <div type="checkcolumn"></div>
                            <div visible="false" field="id" align="center" headerAlign="center"></div>
                            <div field="productName" align="center" headerAlign="center">产品名称</div>
                            <div field="productSku" align="center" headerAlign="center">产品SKU</div>
                            <div field="marketPrice" align="center" headerAlign="center"
                                 renderer="Bluemoon.formatBackgroundMoney">市场价
                            </div>
                            <div field="num" name="num" align="center" headerAlign="center" cellStyle="color:#999999;"
                                 renderer="setCellReadOnly">
                                数量
                                <span style="color: red">*</span>
                                <input property="editor" class="mini-textbox"/>
                            </div>
                        </div>
                    </div>
                </div>

            </fieldset>
            <div class="nui-toolbar" style="padding: 0px;"
                 borderStyle="border:0;">
                <table width="100%">
                    <tr style="background: none repeat scroll 0 0 #F8F8F8;">
                        <td style="text-align: center;">
                            <a class="nui-button" iconCls="icon-ok" id="save_bt" name="save_bt"
                               onclick="saveSuite()">保存</a>
                            &nbsp;&nbsp;&nbsp;
                            <a class="nui-button" iconCls="icon-cancel" id="cancel_bt"
                               onclick="Bluemoon.onCancel()">取消</a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </form>
</div>
<div id="showImg" style="display: none;">
    <<img src="" style="width:650px;height:450px;"/>
</div>

<script type="text/javascript">
    Bluemoon.CONTEXT_PATH = "${pageContext.request.contextPath}";
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/enterprise/suite/suiteManagerAdd.js"></script>
</body>
</html>