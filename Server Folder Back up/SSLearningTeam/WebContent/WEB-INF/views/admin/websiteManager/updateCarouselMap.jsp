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
label{ color: #970046}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
			<section class="content-header  ">
				<div class="container-fluid ">
					<!--添加轮播图 -->
					<div class=" card-warning  card-outline  ">
					<div class="card-header ">
					
								<h3 class="card-title">修改轮播图信息</h3>
					</div>
							<div class="col-sm col-xs col-md-6 col-center-block">
						<form action="${pageContext.request.contextPath}/website/admin/updateCarouselMap" enctype="multipart/form-data" method="POST">
							
							<input type="hidden" name="carouselId" value="${carouselMap.carouselId}"/>
							<label>轮播图简介:</label>
							<input class="form-control" type="text" name="carouselInstruction" value="${carouselMap.carouselInstruction }"/>
							<div class="form-group">
							<label>轮播图链接:</label>
							<input class="form-control" type="text" name="carouselLinkUrl" value="${carouselMap.carouselLinkUrl }"/>
							</div>
							<div class="form-group">
							<label>轮播图原始图片:</label>
							<img src="${carouselMap.carouselImgUrl }" height="40" width="80"/>
							</div>
							<div class="form-group">
							<label>轮播图修改图片:</label>
							<input class="form-control" type="file" name="carouselImg" />
							<div class="col-top ">
							<button type="submit" class="btn btn-warning float-right">提交</button>
						</div>
						</div>
						</form>
						</div>
					</div>
				</div>
			</section>
		</div>
		
</body>
</html>
