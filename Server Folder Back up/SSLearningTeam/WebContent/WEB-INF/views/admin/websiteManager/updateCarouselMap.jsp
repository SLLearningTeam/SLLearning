<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 修改轮播图</title>
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
					<!--添加轮播图 -->
					<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
						<form action="${pageContext.request.contextPath}/website/admin/updateCarouselMap" enctype="multipart/form-data" method="POST">
							<h3>请修改轮播图信息</h3>
							<input type="hidden" name="carouselId" value="${carouselMap.carouselId }"/>
							轮播图简介:<input type="text" name="carouselInstruction" value="${carouselMap.carouselInstruction }"/>
							<br/>轮播图链接:<input type="text" name="carouselLinkUrl" value="${carouselMap.carouselLinkUrl }"/>
							<br/>轮播图原始图片:<img src="${carouselMap.carouselImgUrl }" height="40" width="100"/>
							<br/>轮播图修改图片:<input type="file" name="carouselImg" />
							<br/><input type="submit" value="提交" />
						</form>
					</div>
				</div>
			</section>
		</div>
</body>
</html>
