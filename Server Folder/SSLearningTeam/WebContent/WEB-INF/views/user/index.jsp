<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon/logo.png" type="image/x-icon" />
	<title>听说在线学习平台 | 用户首页</title>
	<!-- Tell the browser to be responsive to screen width -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<script>
$(function(){
	var storage=window.localStorage;
	//获取个人信息
	$.ajax({
	    type:'get',
	    url:'${pageContext.request.contextPath}/user/user/getUserInfo',
	    dataType:'json',
	    data:{
	        'userId':${user.userId}
	    },
	    success:function(r){
	        if(r.status==true){
	        		storage.userId = r.info.userId;
	        		storage.userSex = r.info.userSex;
	        		storage.userName = r.info.userName;
	        		storage.userPassword = r.info.userPassword;
	        		storage.userAvatarUrl = r.info.userAvatarUrl;
	        		storage.userPhoneNumber = r.info.userPhoneNumber;
	        		storage.userPermission = r.info.userPermission;
	        		location.href="/SSLearningTeam/userpages/index.html"
	        }else{
	            alert("请求错误")
	        }
	    }
	});
})
</script>
<body>
</body>
</html>