<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 语言分类管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<jsp:include page="../leftNavigation.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="container-fluid">
				<!-- 语言分类列表 -->
				<div class="card">
              <div class="card-header">
               <a style="color:#b61a06" href="${pageContext.request.contextPath}/language/admin/toaddlanguages">
               <img alt="" src="../../../img/resource/add.png" width="24px" height="24px">&nbsp; 添加语言类型</a>
              </div>
				<div class="card-body">
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr style="text-align: center; color: #490570">
								<th>语言类型编号</th>
								<th>语言名称</th>
								<th>图标</th>
								<th colspan="2" style="text-align: center;">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="languageType" items="${languageTypes}" varStatus="status">
								<tr style="text-align: center">
									<td>${status.count}</td>
									<td>${languageType.languageName}</td>
									<td><img src="${languageType.languageIconUrl}" height="25px" width="25px" /></td>
									<td><a href="${pageContext.request.contextPath}/language/admin/toupdatelanguages?languageTypeId=${languageType.languageTypeId}">修改</a></td>
									<td><a href="${pageContext.request.contextPath}/language/admin/deletelanguage?languageTypeId=${languageType.languageTypeId}" onclick="return del()">删除</a></td>
								</tr>
							</c:forEach>
					</table>
					<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<li class="page-item"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
				</div>
			</div>
		</section>
	</div>
	
	<!--
	<div>${pageName }</div>
	<div>${languageTypes}</div>
	  --> 
	<script type="text/javascript">
		function del(){
			return confirm("确认要删除该语言类别吗？")
		}
		</script>
		
</body>
</html>