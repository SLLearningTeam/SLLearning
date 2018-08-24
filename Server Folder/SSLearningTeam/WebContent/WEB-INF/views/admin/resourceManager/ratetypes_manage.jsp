<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 类别分类管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<jsp:include page="../leftNavigation.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<!-- 类别类型分类 -->
		<section class="content">
			<div class="container-fluid">
				<div class="card-body table-responsive p-0">
					<table class="table table-hover">
						<tr style="text-align: center; color: #930205">
							<th>类别类型编号</th>
							<th>语言类别</th>
							<th>类别类型名称</th>
							<th>类别类型图标</th>
							<th colspan="2">操作</th>
						</tr>
						<c:forEach var="rateType" items="${rateTypes}" varStatus="status">
							<tr style="text-align: center">
								<td>${status.count}</td>
								<td>${rateType.languageType.languageName }</td>
								<td>${rateType.rateName }</td>
								<td><span class="tag tag-success"><img
										src="${rateType.rateIconUrl}"
										alt="picture" width=“20px” height="20px"> </span></td>
								<td><a href="#">修改</a></td>
								<td><a href="#">删除</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
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
		</section>
	</div>
</body>
</html>