<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 添加语言类别</title>
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
	margin-top: 50px;

}
label{ color: #7e0675}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
			<section class="content  ">
				<div class="container-fluid ">
					<!--添加语言类别 -->
					<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
						<form action="${pageContext.request.contextPath}/language/admin/addlanguage" enctype="multipart/form-data" method="POST">
						<label for="languageName">语言类型名称</label>
						<input type="text" class="form-control" id="languageName" placeholder="请填写类别类型名称" name="languageName">
						<div class="form-group">
							<label for="languageIcon">语言类型图标</label>
							<div class="input-group">
								<div class="custom-file">
									<input type="file" class="custom-file-input" id="languageIcon" name="languageIcon">
									<label class="custom-file-label" for="rateIconUrl">请选择图标</label>
								</div>
							</div>
                             <div class="col-top">
							<button type="submit" class="btn btn-primary float-right">提交</button>
						    </div>
						</div>
						</form>
					</div>
				</div>
			</section>
		</div>
</body>
</html>
