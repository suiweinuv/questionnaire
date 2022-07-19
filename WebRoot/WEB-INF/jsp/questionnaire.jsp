<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>智办互联</title>
    <link rel="favicon.ico" href="img/favicon.ico"  type="image/x-icon" />
	<link rel="icon" href="img/favicon.ico"  type="image/x-icon" />
	<link rel="shortcut icon" href="img/favicon.ico"  />
	<meta name="renderer" content="webkit"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link type="text/css" rel="stylesheet" href="css/questionnaire.css">
	<link type="text/css" rel="stylesheet" href="css/general.css" />
	
  </head>
  
  <body style="height:100%;">
  <canvas id="canvas"></canvas> 
  <div class="page">
   	<h1 >智办互联--找办公空间就GO了<br>
		用户试用申请
	</h1>
	
	<img src="img/logo.png" class="logo">

   	<div class="center">
		您好！我们是北京智办互联科技有限公司,此次问卷调查的目的是为了了解贵司的业务区域和服务楼宇<br>
		以便我们对智办互联平台进行内容调整以及双方未来的合作。我们将以职业态度对您交回的问卷严格保密<br>
		您对问卷的认真填写将会对我们工作有着莫大的帮助！非常感谢您的参与！希望可以得到您的反馈！

 	</div>
 	<h3 class="center">
 	智办用户信息卡
 	</h3>
 	<form method="post" action="<%=basePath%>questionnaire/save"   id="form_1" onsubmit=" return check_form()">
   <div  class="center">
   		<label class="required">公司名称</label>
   		<div class="center_right"  >
   		<input type="text" name="company_name" id="company_name" >
   		
   		<span class="blank"></span>
   		<label>公司人数</label>
   		<input type="text" name="company_people_num" >
   		</div>
   </div>
   <div  class="center">
   
   		<label>公司地址</label>
   		<div class="center_right" >
   		<input type="text" name="company_add">
   		<span class="blank"></span>
   		<label>公司电话</label>
   		<input type="text" name="company_tel" >
   		</div>
   </div>
   <div  class="center">
   		<label class="required">填表人</label>
   		<div class="center_right" >
   		<input type="text" name="contact_name" id="contact_name">
   		<span class="blank"></span>
   		<label class="required">手机号</label>
   		<input type="text" name="contact_phone" class="phone" id="contact_phone">
   		</div>
   </div>
   <div  class="center">
   		<label >邀请人</label>
   		<div class="center_right" >
   		<input type="text" name="inviter" >
   		
   		</div>
   </div>
  
   <div  class="center">
   		<label>服务区域</label>
   		<div class="yixuanquyu">
   		
   		<select  class="middle_1" id="qu">
	   		<option value="-1">--请选择--</option>
	   		<c:if test="${!empty listArea }">
				<c:forEach items="${listArea}" var="list">
				<option value="${list.id }">${list.name }</option>
				</c:forEach>
			</c:if>
   		</select>
		
		<select class="middle_1" id="jiedao">
   			<option value="-1">--请选择--</option>
   		</select>
   		
   		<input class="search" type="button" value="添加"  id="search">
   		<span class="blank_1">可选1—5个</span>
   		</div>
   </div>
   <div  class="center">
   		<label>已选区域</label>
   		<div class="yixuanquyu">
   		
   		<span class="blank_1" id="blank_1">单击可删除</span>
   		</div>
   </div>
    
    <div  class="center">
   		<label class="beizhu">备注</label>
   		<textarea name="remarks"></textarea>
   </div>
	
 	<div class="middle_div">
		 	<h3 class="center">
		 	意向管理楼宇申请表
		 	</h3>
		 <select  class="middle" id="qu_1" style=" display:none">
	   		<option value="-1">--请选择--</option>
	   		<c:if test="${!empty listArea }">
				<c:forEach items="${listArea}" var="list">
				<option value="${list.id }">${list.name }</option>
				</c:forEach>
			</c:if>
   		</select>
		
		<select class="middle" id="jiedao_1" style=" display:none">
   			<option value="-1">--请选择--</option>
   		</select>
   		<div class="search_xzl">
	   		<input class="middle_input"type="text" placeholder="请输入大厦名字..." id="xzl_input"  >
	   		<input class="search"type="button" value="搜索" id="search_1">
	   	</div>
 	</div>
 	<div class="jieguo" id="jieguo">
 		
 	</div>
 	<div style="text-align: center;">
 	<h3>已选大厦</h3><span class="blank_2">点击可删除</span>
 	</div>
 	<div class="yixuandasha">
	 	<span id="blank_2"></span>
 	</div>
 	<input type="hidden" name="ip" value="<%=request.getRemoteAddr() %>  ">
 	<div class="submit_div">
 	<input type="submit" class="submit" id='tijiao' value="提交">
	</div>
 	
  </form>
  
  <div class="bottom_text">
北京智办互联科技有限公司<br>
联系电话：010-82606165<br>
如有疑问请发送邮件到：zhioffice@163.com<br>
公司网址:<a href="http://www.zhioffice.com" target="_blank">www.zhioffice.com</a>
感谢您的参与



  
  </div>
</div>

  </body>
 
</html>

<script type="text/javascript" src="js/background.js" ></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
<script type="text/javascript" src="js/linkage.js" ></script>
<script type="text/javascript" src="js/check.js" ></script>

<script type="text/javascript" src="js/layer/layer.js" ></script>
<script type="text/javascript" src="js/general.js" ></script>

<script type="text/javascript">
 alert_3("请使用非ie浏览器打开本网页");
</script>

