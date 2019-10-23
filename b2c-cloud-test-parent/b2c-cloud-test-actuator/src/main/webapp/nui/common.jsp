<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String skin="skin1";
	String contextPath=request.getContextPath();
%>

<link id="css_skin" rel="stylesheet" type="text/css" href="<%=contextPath%>/nui/skins/<%=skin %>/css/style.css"/>
<link id="css_icon" rel="stylesheet" type="text/css" href="<%=contextPath%>/nui/icons/icon.css"/>
<script type="text/javascript" src="<%=contextPath%>/nui/nui.js"></script>
<script type="text/javascript" src="<%=contextPath%>/js/swfupload.js"></script>
<script type="text/javascript">
//缓存原有方法
	mini._ajax = mini.ajax;
	//添加 payload 转换方法
	mini.payload = function(isPayload) {
	        if (isPayload) {
	                mini.ajax = function(_options) {
	                		_options.dataType = "json";
	                        _options.contentType = "application/json; charset=utf-8";
	                        _options.data = JSON.stringify(_options.data);
	                        return mini._ajax(_options)
	                }
	        }else{
	                mini.ajax = mini._ajax;
	        }
	}

	/* 设置超时跳转 */
	/**
    $.ajaxSetup({
        contentType : "application/x-www-form-urlencoded;charset=utf-8",
        complete : function(XMLHttpRequest, textStatus) {
            var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus"); // 通过XMLHttpRequest取得响应头，sessionstatus，
            if (sessionstatus == "timeout") {
                // 如果超时就处理 ，指定要跳转的页面
                nui.alert("会话超时,请重新登陆","系统提示");
                window.location.replace("login.jsp");
            }
        }
    });
	**/

	/* 设置ajax头 */
    $.ajaxSetup({
        contentType : "application/x-www-form-urlencoded;charset=utf-8"
    });
    /* 设置超时跳转 20180621*/
    $(document).ajaxComplete(function(event, XMLHttpRequest, settings) {
        var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus"); // 通过XMLHttpRequest取得响应头，sessionstatus，
        if (sessionstatus == "timeout") {
            // 如果超时就处理 ，指定要跳转的页面
            nui.alert("会话超时,请重新登陆","系统提示");
            window.location.replace("<%=contextPath %>/login.html");
        }
    });
</script>
<script>
	(function(){
		nui.context='<%=contextPath %>'
	})();

	var data={};
	nui.DataTree.prototype.dataField='data';//兼容改造
	//全局兼容改造datagrid的load方法
	mini.payload(true);
</script>
