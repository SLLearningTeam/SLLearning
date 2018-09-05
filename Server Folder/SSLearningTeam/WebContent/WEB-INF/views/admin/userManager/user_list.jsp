<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 用户列表页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="row" style="padding-top: 15px">
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<table id="example1" class="table table-bordered table-striped">
								
									<tr style="text-align: center; color: #aa1603">
										<th>用户编号</th>
										<th>用户名</th>
										<th>性别</th>
										<th>密码</th>
										<th>头像</th>
										<th>手机号码</th>
										
										<th colspan="2" style="text-align: center;">查看详情</th>
									</tr>
								
								<c:forEach var="user" items="${users}" varStatus="status">
								<tr style="text-align: center ">
									<td>${status.count}</td>
									<td>${user.userName}</td>
									<td>${user.userSex }</td>
									<td>${user.userPassword }</td>
									<td><img src="${user.userAvatarUrl}" height="25px" width="25px" /></td>
									<td>${user.userPhoneNumber}</td>
									
									<td><a href="${pageContext.request.contextPath}/user/admin/getUserInfo?userId=${user.userId}">
									<img src="../../../img/resource/see.png" height="28" width="28" />
									</a></td>
									
								</tr>
							</c:forEach>			
							</table>
						</div>
						<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${pageNumeber}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/user/admin/userlist_manage/${count.index}">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
					</div>
				</div>
			</div>
		</section>
	</div>

</body>
</html>