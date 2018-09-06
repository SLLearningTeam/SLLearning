<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
<title>听说在线学习平台 | 查看意见反馈</title>
<style>
	.reback{
		margin-left:25px;
		margin-top:25px
	}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="container-fluid">
				<div class="card">
			<div class="reback">
				<h6>用户反馈列表</h6>
			</div>
					<div class="card-body">
					<table class="table table-bordered  table-hover">
							<tr style="text-align: center; color: #8b0481">
								<th>意见编号</th>
								<th>用户姓名</th>
								<th>意见详情</th>
								<th>发表时间</th>
								<th colspan="2" style="text-align: center;">操作</th>
							</tr>
						
							<c:forEach var="adviceInfoLists" items="${adviceInfoLists}" varStatus="status">
								<tr style="text-align: center">
									<td>${status.count}</td>
									<td>${adviceInfoLists.user.userName }</td>
									<td>${adviceInfoLists.adviceInfo}</td>
									<td>${adviceInfoLists.adviceSendTime}</td>																	 
									<td><a href="javascript:void(0)" onclick="return del(${adviceInfoLists.adviceId})">删除</a></td>
								</tr>
							</c:forEach>
					</table>
					</div>
					<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${pageNumeber}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/advice/admin/advices_manage/${count.index}">${count.index}</a></li>
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
			var info = confirm("确认要删除该意见反馈吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/advice/admin/deleteAdvice?adviceId="+id,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  location.href="${pageContext.request.contextPath}/advice/admin/advices_manage/1";
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
