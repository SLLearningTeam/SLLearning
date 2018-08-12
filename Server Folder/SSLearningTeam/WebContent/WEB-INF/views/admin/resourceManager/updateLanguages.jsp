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
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
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
label{ color:#bb3e09}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
			<section class="content  ">
				<div class="container-fluid ">
					<!--添加语言类别 -->
					<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
						<label for="rateName">语言类型名称</label>
						 <input type="text" class="form-control" id="rateName" >
						<div class="form-group">
							<label for="rateIconUrl">语言类型图标</label>
							<div class="input-group">
								<div class="custom-file">
									<input type="file" class="custom-file-input" id="rateIconUrl">
									<label class="custom-file-label" for="rateIconUrl"></label>
								</div>
							</div>
                             <div class="col-top ">
							<button type="submit" class="btn btn-warning float-right">提交</button>
						    </div>
						</div>
					</div>
				</div>
			</section>
		</div>
	
</body>
</html>
