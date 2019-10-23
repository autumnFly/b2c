<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta charset="utf-8">
	<title>登录页面-蓝月亮</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	
	</head>
	<style type="text/css">
		/* CSS Document */
		*{margin:0px auto;pdding:0px;}
		body,html{margin:0px auto;padding:0px;width:100%;height:100%;
			background-attachment:fixed;
			background-size: cover;
			-webkit-background-size: cover;/* 兼容Webkit内核浏览器如Chrome和Safari */
			-o-background-size: cover;/* 兼容Opera */
			zoom: 1; }
				
		#login_div{margin:0px auto;width:auto;height:91%;}
			
		#left_div{
			height:100%;
			width:55%;
			float:left;
			background-color:#254ee4;
		}
		
		.img_div{
			text-align:center;
			position:absolute;
			top:50%;
			left:27.5%;
			margin-left:-193px;
			margin-top:-160px;
		}
		.img_div img{width:280px;}
		
		.img_div p{font-size:24px;color:white;font-family:"微软雅黑";padding-top:20px;}
		
		#right_div{
			height:100%;
			width:45%;
			float:left;
			background-color:#FFFFFF;
		}
		
		.input_div{
			text-align:center;
			position:absolute;
			top:50%;
			right:22.5%;
			margin-top:-220px;
			margin-right:-175px;
		}
		
		.input_div p{font-size:26px;font-family:"雅黑";color:#1840b8;margin-bottom:30px;}
		
		.div_input{width:350px;height:50px;border:2px solid #3c4da5;border-radius:8px;}
		.div_input img{width:22px;height:22px;}
		.p_input,img{margin-top:14px;line-height:22px;display:inline;}
		.p_input{width:160px;border-style:none;}
		.p_button{width:350px;height:50px;background:#ff9a0c;
			border-style:none;border-radius:8px;
			color:white;font-size:20px;font-family:"微软雅黑";}
		.error_text{width:350px;height:30px;line-height:30px;}
		.span-css{color:red;}
		
		.footer{
			width:100%;height:9%;
			text-align:center;
			background-color:#ebebeb;
		}
		.footer p{color:#1b40c5;line-height:20px;font-family:"雅黑";}
		.footer a:focus{outline:none;}
		.footer a{color:#1b40c5;font-size:14px;font-family:"雅黑";}
		.footer ul{text-align:center;margin:0;line-height:20px;padding:0;}
		
		/* WebKit browsers */
		::-webkit-input-placeholder {
			color: #999;
			font-size:14px;
			font-family:"雅黑";
		}
		/* Mozilla Firefox 4 to 18 */
		:-moz-placeholder {
			color: #999;
			opacity: 1;
			font-size:14px;
			font-family:"雅黑";
		}
		/* Mozilla Firefox 19+ */
		::-moz-placeholder {
			color: #999;
			opacity: 1;
			font-size:14px;
			font-family:"雅黑";
		}
		/* Internet Explorer 10+ */
		:-ms-input-placeholder {
			color: #999;
			font-size:14px;
			font-family:"雅黑";
		}
		#maskDiv{
			background-color:#333;
			display:none;
			width:100%;
			height:100%;
			top:0px;
			left:0px;
			opacity:0.6;
			z-index:999;
			position:fixed;
		}
		#input_verifyCode{
			background-color:#f2f2f2;
			display:block;
			width:360px;
			height:300px;
			z-index:9999;
			border-radius:5px;
			top:50%;
			left:50%;
			position:fixed;
			margin-top:-150px;
			margin-left:-180px;
		}
		#reset_passCode{
			background-color:#f2f2f2;
			display:block;
			width:360px;
			height:360px;
			z-index:9999;
			border-radius:5px;
			top:50%;
			left:50%;
			position:fixed;
			margin-top:-180px;
			margin-left:-180px;
		}
	</style>
	
<body>
	<div id="login_div">
    	<div id="left_div">
    		<div class="img_div">
	    		<img src="images/logo_03.png"/>
	    		<p>———  轻松清洁，优雅生活    ———</p>
    		</div>
    	</div>
    	<div id="right_div">
    		<div class="input_div">
    			<p>蓝月亮电商管理系统欢迎您</p>
    			<div class="div_input">
    				<div style="float:left;margin:0 20px 0 20px;">
	    				<img src="images/user_03.png" />
    				</div>
					<div style="float:left;">
						<input type="text" id="username" class="p_input" placeholder="请输入您的用户名"/>
					</div>
    			</div>
    			<div class="error_text">
					<span id="userText" class="span-css"></span>
				</div>
    			<div class="div_input">
    				<div style="float:left;margin:0 20px 0 20px;">
    					<img src="images/password_03.png" />
    				</div>
					<div style="float:left;">
	    				<input type="password" id="password" class="p_input" placeholder="请输入您的密码"/>
	    			</div>
    			</div>
    			<div class="error_text">
					<span id="passText" class="span-css"></span>
				</div>	
    			<div class="div_input">
    				<div style="float:left;margin:0 20px 0 20px;">
	    				<input type="text" id="rand" class="p_input" placeholder="请输入验证码"/>
	    			</div>
	    			<div style="float:left;">
	    				<IMG src="js/valiCodeImg.jsp" border=0  id="safecode" style="width:100px;height:24px;"/>
              			<img src="images/icon_refresh.png" style="width:22px;height:22px;" onclick="reloadcode()">
	    			</div>
    			</div>
    			<div class="error_text">
					<span id="randText" class="span-css"></span>
				</div>		
				<div class="error_text" style="text-align:right;line-height:15px;height:20px;">
					<a href="javascript:void(0)" onclick="resetPass()">忘记密码？</a>
				</div>
    			<div>
    				<button type="button" class="p_button" onclick="onLogin()" >登&nbsp;&nbsp;&nbsp;&nbsp;录</button>	
    			</div>
    		</div>
    	</div>
    </div>
    
    <div class="footer">
    	<div style="height:50%;padding-top:12px;">
	    	<ul>
	    		<a target="view_window" href="http://crm.bluemoon.com.cn">天使APP下载</a>
	    		<a>|</a>
	    		<a target="view_window" href="http://www.bluemoon.com.cn/index.asp">蓝月亮官网</a>
	    	</ul>
    	</div>
    	<div style="height:50%;">
    		<p>Copyright © 2016 BlueMoon New Buiness Limited All Right Reserved.</p>
    	</div>
    </div>
    
    <div id="maskDiv" style="display:none;"></div>
	
	<div id="input_verifyCode" style="display:none;">
		<div style="width:100%;height:70px;">
			<div style="padding-top:20px;margin-left:140px;float:left;"><span style="font-size:20px;font-family:雅黑;color:#808A87;line-height:20px;">找回密码</span></div>
			<div style="margin-top:10px;margin-left:110px;float:left;"><img src="images/close.png" onclick="closeDiv1()"/></div>
		</div>
		<div style="width:100%;height:60px;background-color:#FFFFFF;">
			<input type="text" style="height:59px;width:318px;border:none;margin-left:20px;font-size:18px;" id="empCode" maxlength="11" placeholder="请输入员工编码" />
		</div>
		<div style="width:100%;height:60px;background-color:#FFFFFF;">
			<input type="text" style="height:59px;width:318px;border:none;margin-left:20px;font-size:18px;" id="mobileNo" maxlength="11" placeholder="请输入手机号码" />
		</div>
		<div style="width:100%;height:120px;text-align:center;">
			<button type="button" style="background:#ff9a0c;border-style:none;border-radius:8px;color:white;font-size:14px;font-family:微软雅黑;width:150px;height:40px;margin-top:40px;" 
				onclick="getVerifyCode()" >获取验证码</button>
		</div>
	</div>
	
	<div id="reset_passCode" style="display:none;">
		<div style="width:100%;height:70px;">
			<div style="margin-top:10px;margin-left:15px;float:left;"><img src="images/back.png" onclick="backDiv1()"/></div>
			<div style="padding-top:20px;margin-left:110px;float:left;"><span style="font-size:20px;font-family:雅黑;color:#808A87;line-height:20px;">重置密码</span></div>
			<div style="margin-top:10px;margin-left:110px;float:left;"><img src="images/close.png" onclick="closeDiv2()"/></div>
		</div>
		<div style="width:100%;height:60px;background-color:#FFFFFF;">
			<input id="code" type="text" style="height:60px;width:218px;border:none;margin-left:20px;font-size:18px;" maxlength="4" placeholder="请输入短信验证码" />
			<input type="button" style="background:none;border:solid 1px blue;border-radius:5px;color:blue;font-size:14px;font-family:楷体;width:85px;height:30px;margin-top:15px;" 
				id="verifyCode" onclick="getVerifyCode()" value="再次获取"/>
		</div>
		<div style="width:100%;height:60px;background-color:#FFFFFF;">
			<input id="newPassword" type="password" style="height:60px;width:318px;border:none;margin-left:20px;font-size:18px;" maxlength="18" placeholder="请输入8-18位数字+字母密码" />
		</div>
		<div style="width:100%;height:60px;background-color:#FFFFFF;">
			<input id="newPassword1" type="password" style="height:60px;width:318px;border:none;margin-left:20px;font-size:18px;" maxlength="18" placeholder="请再次输入密码" />
		</div>
		<div style="width:100%;height:120px;text-align:center;">
			<button type="button" style="background:#ff9a0c;border-style:none;border-radius:8px;color:white;font-size:14px;font-family:微软雅黑;width:150px;height:40px;margin-top:40px;" 
				onclick="savePass()" >提&nbsp;&nbsp;&nbsp;&nbsp;交</button>
		</div>
	</div>


	<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="js/md5_32.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js"></script>
	
    <script type="text/javascript">
    	/* 控制跳转的页面防止session超时时 登录页在子页面中 */
    	if (window != top){
    		top.location.href = location.href;
    	}
    	
    	var countdown = 120;
    	
    	//捕获回车事件登录
    	document.onkeydown = function(event_e){    
	        if(window.event)    
	         event_e = window.event;    
	         var int_keycode = event_e.charCode||event_e.keyCode;    
	         if(int_keycode ==13){   
	         	onLogin();
	        }  
	    } 
    	//界面加载自动聚焦到用户名输入框
    	document.getElementById("username").focus();
		//使用ajax的方式提交登录信息，然后通过json数据格式将返回结果返回
		function onLogin(){
			var flag = dataValidate();
			if(flag == "" || flag == null ){
				var username = document.getElementById("username").value;
				var password = document.getElementById("password").value;
				password = hex_md5(password);
				var rand = document.getElementById("rand").value;
				var params= {account:username,password:password,rand:rand};
				params = JSON.stringify(params);
				$.ajax({
			         type: 'POST',
			         url: 'login/login',
			         dataType: "json",
            	 	 contentType:"application/json",
			         data:params,
			         success:function(data){
				         var isSuccess = data.isSuccess; 
				         if( isSuccess == true ){
			         		window.location.href="admin/index.jsp";
				         }else{
				         	alert(data.responseMsg);
				         	reloadcode();
				         } 
				     }
			     });   
			}
		}
		
		$(document).ready(function(){
			$("#maskDiv").hide();
			$("#reset_passCode").hide();
			$("#input_verifyCode").hide();
		});
		
		function resetPass(){
			$("#maskDiv").show();
			$("#input_verifyCode").show();
		}
		
		function closeDiv1(){
			$("#maskDiv").hide();
			$("#reset_passCode").hide();
			$("#input_verifyCode").hide();
		}
		
		//获取短信验证码
		function getVerifyCode(){
			var empCode = $("#empCode").val();
			var mobileNo = $("#mobileNo").val();
			if( empCode == null || empCode == "" || mobileNo == null || mobileNo == "" ){
				alert("请填写员工编码和手机号码！");
				return;
			}
			var re = /^[0-9A-Za-z]{1,11}$/;
			if( !re.test(empCode) ){
				alert("员工编码填写不正确，请重新输入");
				return;
			}
			var re = /^1[3|4|5|7|8]\d{9}$/;
			if( !re.test(mobileNo) ){
				alert("手机号码输入不正确，请重新输入");
				return;
			}
			var params= {account:empCode,mobileNo:mobileNo};
			params = JSON.stringify(params);
			$.ajax({
		         type: 'POST',
		         url: 'login/getVerifyCode',
		         dataType: "json",
        	 	 contentType:"application/json",
		         data:params,
		         success:function(data){
				 
			         var isSuccess = data.isSuccess; 
			         //if( isSuccess == true ){
					  var responseCode=data.responseCode;
					  if(isSuccess == true && responseCode==0){
			        	 $("#input_verifyCode").hide();
			 			 $("#reset_passCode").show();
			        	 reloadcode();
			        	 countdown = data.time;
			        	 settime();
			         }else{
			         	alert(data.responseMsg);
			         	reloadcode();
			         } 
			     }
		     });   
		}
		
		function backDiv1(){
			$("#reset_passCode").hide();	
			$("#input_verifyCode").show();
		}
		
		//关闭重置密码窗口
		function closeDiv2(){
			$("#maskDiv").hide();
			$("#reset_passCode").hide();
			$("#input_verifyCode").hide();
		}
		
		//验证码获取倒计时
		function settime(){
			if( countdown == 0 ){
				$("#verifyCode").removeAttr("disabled");
				$("#verifyCode").val("再次获取");
				return;
			}else{
				$("#verifyCode").attr("disabled","disabled");
				$("#verifyCode").val("（"+ countdown +"）秒");
				countdown--;
			}
			setTimeout(function(){
				settime()}
			,1000);
		}
		
		//提交新密码
		function savePass(){
			var mobileNo = $("#mobileNo").val();
			var code = $("#code").val();
			var newPassword = $("#newPassword").val();
			var newPassword1 = $("#newPassword1").val();
			if( code == null || code == "" ){
				alert("请输入短信验证码");
				return;
			}
			if( newPassword == null || newPassword == "" ){
				alert("请输入新密码");
				return;
			}else{
				var re = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,18}$/;
				if( !re.test(newPassword) ){
					alert("密码必须由8-18位数字和字母组合，请重新输入！");
					return;
				}
			}
			if( newPassword != newPassword1 ){
				alert("两次密码输入不一致，请确认！");
				return;
			}
			newPassword = hex_md5(newPassword);
			var params= {mobileNo:mobileNo,verifyCode:code,newPassword:newPassword};
			params = JSON.stringify(params);
			$.ajax({
		         type: 'POST',
		         url: 'login/resetPassword',
		         dataType: "json",
        	 	 contentType:"application/json",
		         data:params,
		         success:function(data){
			         var isSuccess = data.isSuccess; 
			         if( isSuccess == true ){
			        	 alert("重置密码成功");
			        	 closeDiv2();
			        	 reloadcode();
			         }else{
			         	alert(data.responseMsg);
			         	reloadcode();
			         } 
			     }
		     });   
		}
		
		
		function reloadcode(){
			var verify=document.getElementById('safecode');
			verify.setAttribute('src','js/valiCodeImg.jsp?'+Math.random());
			//这里必须加入随机数不然地址相同我发重新加载
		}
		
		function dataValidate(){
			document.getElementById("userText").innerHTML = "";
			document.getElementById("passText").innerHTML = "";
			document.getElementById("randText").innerHTML = "";
			var flag = "";
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			var rand = document.getElementById("rand").value;
			
			if(username == "" || username == null ){
				flag = "用户名不能为空";
				document.getElementById("userText").innerHTML = flag;
			}
			if( password == "" || password == null ){
				flag = "密码不能为空";
				document.getElementById("passText").innerHTML = flag;
			}else{
				var re = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,18}$/;
				if( !re.test(password) ){
					flag = "密码必须由8-18位数字和字母组合，如不符合安全要求请通过忘记密码重新设置！";
					alert(flag);
				}
			}
			if(rand == "" || rand == null ){
				flag = "验证码不能为空";
				document.getElementById("randText").innerHTML = flag;
			}
	
			return flag;
		}

				

	</script>
  </body>
</html>
