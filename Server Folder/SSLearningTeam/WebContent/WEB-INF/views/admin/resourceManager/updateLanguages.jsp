<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 修改语言类别</title>
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
				<!--添加语言类别 -->
				<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
				<form action="${pageContext.request.contextPath}/language/admin/updatelanguage" enctype="multipart/form-data" method="POST">
				<input type="hidden" name="languageTypeId" value="${languageType.languageTypeId}">
					<label for="languageName">语言类型名称</label> 
					<input type="text" class="form-control" name="languageName" value="${languageType.languageName}" required="required">
					<label >原语言类型图标:</label>
					<img src="${languageType.languageIconUrl}" height="40px" width="60px"/>
					<div class="form-group">
						<label for="languageIcon">修改语言类型图标:</label>
						<div class="input-group">
						<input id="file" type="file" class=" btn btn-default" style="width:482px" name="languageIcon" >
				        
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
