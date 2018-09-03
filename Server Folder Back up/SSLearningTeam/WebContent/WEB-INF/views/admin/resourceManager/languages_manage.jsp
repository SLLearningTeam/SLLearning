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
					<table  class="table table-bordered table-hover">
						
							<tr style="text-align: center; color: #490570">
								<th>语言类型编号</th>
								<th>语言名称</th>
								<th>图标</th>
								<th colspan="2" style="text-align: center;">操作</th>
							</tr>
						
							<c:forEach var="languageType" items="${languageTypes}" varStatus="status">
								<tr style="text-align: center">
									<td>${status.count}</td>
									<td>${languageType.languageName}</td>
									<td><img src="${languageType.languageIconUrl}" height="25px" width="25px" /></td>
									<td><a href="${pageContext.request.contextPath}/language/admin/toupdatelanguages?languageTypeId=${languageType.languageTypeId}">修改</a></td>
									<td><a href="javascript:void(0)" onclick="return del(${languageType.languageTypeId})">删除</a></td>
								</tr>
							</c:forEach>
					</table>
					
				</div>
				<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${pageNumeber}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/language/admin/languages_manage/${count.index}">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>

	<script type="text/javascript">
		function del(id){
			var info = confirm("确认要删除该语言类别吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/language/admin/deletelanguage?languageTypeId="+id,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  location.href="${pageContext.request.contextPath}/language/admin/languages_manage/1";
						  }else{
							alert(result.info);
						  }
					  }
					});
			}
		}
		
		 </script>
		
</body>
</html>