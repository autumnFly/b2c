<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>洗涤套餐管理</title>
    <%@include file="/nui/common.jsp" %>
    <script src="${pageContext.request.contextPath}/js/common.js" type="text/javascript"></script>

    <script src="${pageContext.request.contextPath}/js/mock.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/wash/enterpriseItem/data/suite.js" type="text/javascript"></script>

</head>
<body style="overflow:hidden;width:100%;">
<div class="search-condition">
    <fieldset style="text-align:left;">
        <legend style="color:#3366CC" size="2">查询条件</legend>
        <div id="searchSuiteCondiForm">
            <table style="width:100%;height:100%;padding:0px!important;line-height:25px;border-collapse: collapse;border:none;padding-left:5px;">
                <tr style="background: none repeat scroll 0 0 #F8F8F8;">
                    <th align="right" width="5%">套餐编号：</th>
                    <td style="text-align:left;width:5%;">
                        <input id="suiteCode" name="suiteCode" class="nui-textbox" width="100%"/>
                    </td>

                    <th align="right" width="5%">套餐名称：</th>
                    <td style="text-align: left; width: 5%;">
                        <input id="suiteName" name="suiteName" class="nui-textbox" width="100%"/>
                    </td>
                    <th align="right" width="5%">状态：</th>
                    <td style="text-align: left; width: 5%;">
                        <input class="nui-dictcombobox nui-form-input" name="status" id="status"
                               allowInput="true" dictTypeId="SUITE_STATUS" showNullItem="true" emptyText="---请选择---"
                               nullItemText="---请选择---" width="100%" textField="dictName" valueField="dictID"/>
                    </td>
                    <td align="center" width="5%">
                        <a class="nui-button" onclick="searchSuite()" iconCls="icon-search">查询</a>
                        <a class="nui-button" onclick="reset()" iconCls="icon-reset">重置</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="https://tmallapi.bluemoon.com.cn/img/group1//M00/02/AC/wKjwDVvEKT-AEZVPAABs7WFJsHM027.jpg"
                             style="width:50px;height:50px;"/>
                        <img src="https://tmallapi.bluemoon.com.cn/img/group1//M00/02/B2/wKjwDVvUDmiADUHIAAD6yGsnxIo226.jpg"
                             style="width:50px;height:50px;"/>
                    </td>
                </tr>
            </table>
        </div>
    </fieldset>
</div>

<div style="width:100%;">
    <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
            <tr>
                <td style="width:100%;">
                    <a class="mini-button" iconCls="icon-add" onclick="openAddSuitePage()">新增</a>
                    <span class="separator"></span>
                    <a class="mini-button" iconCls="icon-search" onclick="openShowSuitePage()">查看</a>
                    <span class="separator"></span>
                    <a class="mini-button" iconCls="icon-edit" onclick="openEditSuitePage()">编辑</a>
                    <span class="separator"></span>
                    <a class="mini-button" iconCls="icon-edit" onclick="closeSuite()">关闭</a>
                    <span class="separator"></span>
                </td>
            </tr>
        </table>
    </div>
</div>

<div class="nui-fit" style="height: 60%">
    <div id="suiteDatagrid" class="nui-datagrid" style="width:100%;height:100%;"
         url="${pageContext.request.contextPath}/enterpriseItem/suite/getSuites" dataField="data"
         allowResize="true" pageSize="50" multiSelect="true" showPager="true" onselectionchanged=""
         allowCellValid="true" sortField="op_time" sortOrder="desc">
        <div property="columns">
            <div type="checkcolumn"></div>
            <div type="indexcolumn" align="center" headerAlign="center">序号</div>
            <div visible="false" field="id" align="center" headerAlign="center"></div>
            <div field="suiteCode" align="center" headerAlign="center">套餐编号</div>
            <div field="suiteName" align="center" headerAlign="center">套餐名称</div>
            <div field="marketPrice" align="center" headerAlign="center" renderer="Bluemoon.formatBackgroundMoney">
                市场价
            </div>
            <div field="status" align="center" headerAlign="center" renderer="gridBmwzDict">状态</div>
            <div field="opName" align="center" headerAlign="center">操作人</div>
            <div field="opCode" align="center" headerAlign="center">操作人编号</div>
            <div field="opTime" align="center" headerAlign="center" renderer="Bluemoon.formatDate"
                 visable="false">最后操作时间
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/enterprise/suite/suiteManager.js"></script>
</body>
</html>