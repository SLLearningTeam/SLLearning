<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 轮播图管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<jsp:include page="../leftNavigation.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="container-fluid">
				<!-- 语言分类列表 -->
				<div class="card-body">
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr style="text-align: center; color: #7b5b05">
								<th>轮播图编号</th>
								<th>轮播图简介</th>
								<th>轮播图链接地址</th>
								<th>轮播图图片</th>
								<th colspan="2" style="text-align: center;">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="carouselMaps" items="${carouselMaps}" varStatus="status">
								<tr style="text-align: center">
									<td>${status.count}</td>
									<td>${carouselMaps.carouselInstruction}</td>
									<td><a href="${carouselMaps.carouselLinkUrl }">${carouselMaps.carouselLinkUrl }</a></td>
									<td><img src="${carouselMaps.carouselImgUrl}" height="40" width="60" /></td>
									<td><a href="${pageContext.request.contextPath}/website/admin/toUpdateCarouselMap?carouselId=${carouselMap.carouselId}">修改</a></td>																	 
									<td><a href="${pageContext.request.contextPath}/website/admin/deleteCarouselMap?carouselId=${carouselMap.carouselId}" onclick="return del()">删除</a></td>
								</tr>
							</c:forEach>
					</table>
					<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${pageNumber}" step="1">
								<li class="page-item"><a class="page-link" href="#">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>
	<div>${pageName }</div>
	<div>${languageTypes}</div>
	<script type="text/javascript">
		function del(){
			return confirm("确认要删除该语言类别吗？")
		}
		</script>
</body>
</html>