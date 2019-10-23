<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增套餐</title>
    <%@include file="/nui/common.jsp" %>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script src="${pageContext.request.contextPath}/js/fileupload.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/lrz.mobile.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/common.js" type="text/javascript"></script>
</head>
<body style="overflow: hidden; width: 100%;">

<div class="search-condition">
    <fieldset style="text-align:left;">
        <legend style="color:#3366CC" size="2">查询条件</legend>
        <div id="searchProductCondiForm">
            <table style="width:100%;height:100%;padding:0px!important;line-height:25px;border-collapse: collapse;border:none;padding-left:5px;">
                <tr style="background: none repeat scroll 0 0 #F8F8F8;">
                    <th align="right" width="5%">产品SKU：</th>
                    <td style="text-align:left;width:5%;">
                        <input id="productSku" name="productSku" class="nui-textbox" width="100%"/>
                    </td>
                    <th align="right" width="5%">产品名称：</th>
                    <td style="text-align: left; width: 5%;">
                        <input id="productName" name="productName" class="nui-textbox" width="100%"/>
                    </td>
                    <td align="center" width="2%">
                        <a class="nui-button" onclick="searchProducts()" iconCls="icon-search">查询</a>
                    </td>
                    <td align="center" width="2%">
                        <a class="nui-button" onclick="reset()" iconCls="icon-reset">重置</a>
                    </td>
                    <td align="center" width="2%">
                        <a class="nui-button" onclick="selectProducts()">选择</a>
                    </td>
                </tr>
            </table>
        </div>
    </fieldset>
</div>

<div class="nui-fit" style="height: 60%">
    <div id="productDatagrid" class="nui-datagrid" style="width:100%;height:100%;"
         url="${pageContext.request.contextPath}/enterpriseItem/product/getProducts" dataField="data"
         allowResize="true" pageSize="10" multiSelect="true" showPager="true" onselectionchanged=""
         allowCellValid="true">
        <div property="columns">
            <div type="checkcolumn"></div>
            <div visible="false" field="id" align="center" headerAlign="center"></div>
            <div field="productSku" align="center" headerAlign="center">产品SKU</div>
            <div field="productName" align="center" headerAlign="center">产品名称</div>
            <div field="marketPrice" align="center" headerAlign="center" renderer="Bluemoon.formatBackgroundMoney">市场价格</div>
        </div>
    </div>
</div>

<script type="text/javascript">
    Bluemoon.CONTEXT_PATH = "${pageContext.request.contextPath}";
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/enterprise/suite/suiteManagerProductAdd.js"></script>
</body>
</html>