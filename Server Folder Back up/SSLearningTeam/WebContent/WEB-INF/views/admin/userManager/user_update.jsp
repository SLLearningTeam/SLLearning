<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 修改个人信息</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
<!-- 自定义样式 -->
<style>
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

.col-top {
	margin-top: 60px;
}

label {
	color: #bb3e09
}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content-header  ">
			<div class="container-fluid ">
				<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
				<form action="${pageContext.request.contextPath}/user/admin/userlist_manage/1" enctype="multipart/form-data" method="POST">
				<input type="hidden" name="userId" value="${user.userId}">
					<label for="userName">用户名</label> 
					<input type="text" class="form-control" name="userName" value="${user.userName}" required="required">
					<label for="userSex">性别</label> 
					<input type="text" class="form-control" name="userSex" value="${user.userSex}" required="required">
					<label for="userPassword">密码</label> 
					<input type="text" class="form-control" name="userPassword" value="${user.userPassword}" required="required">
					<label for="userPhoneNumber">手机号码</label> 
					<input type="text" class="form-control" name="userPhoneNumber" value="${user.userPhoneNumber}" required="required">
					<label >原头像:</label>
					<img src="${user.userAvatarUrl}" height="40px" width="60px"/>
					<div class="form-group">
						<label for="userAvatarUrl">修改头像:</label>
						<div class="input-group">
						<input id="file" type="file" class=" btn btn-default" style="width:482px" name="userAvatarUrl" >
				        
						</div>
						<div class="col-top ">
							<button type="submit" class="btn btn-warning float-right">提交</button>
						</div>
					</div>
					</form>
				</div>
			</div>
		</section>
	</div>

</body>
</html>
