<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 添加轮播图</title>
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
			<section class="content-header   ">
				<div class="container-fluid ">
					<!--添加轮播图 -->
					<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
						<form action="${pageContext.request.contextPath}/website/admin/addCarouselMap" enctype="multipart/form-data" method="POST">
							
							<label>轮播图简介:</label>
							<input class="form-control" type="text" name="carouselInstruction" />
							<div class="form-group">
							<label>轮播图链接:</label>
							<input class="form-control" type="text" name="carouselLinkUrl" />
							</div>
							<div class="form-group">
							<label>轮播图图片:</label>
							<input class="form-control" type="file" name="carouselImg" />
							<div class="col-top">
							<button type="submit"  class="btn btn-info float-right">提交</button>
							</div>
						    </div>
						</form>
					</div>
				</div>
			</section>
		</div>
</body>
</html>
