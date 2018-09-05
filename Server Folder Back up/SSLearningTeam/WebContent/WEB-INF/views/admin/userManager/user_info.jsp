<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 用户详情页</title>
<!-- Tell the browser to be responsive to screen width -->
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
							<section class="content">
								<div class="container-fluid">
									<div class="row">
										<div class="col-md-3">

											<!-- 用户信息详情 -->
											<div class="card card-primary card-outline">
												<div class="card-body box-profile">
												<input type="hidden" name="userId" value="${user.userId}">
													<div class="text-center">
														<img class="profile-user-img img-fluid img-circle"
															src="${user.userAvatarUrl}">
													</div>
													<h3 class="profile-username text-center">${user.userName}</h3>
													<ul class="list-group list-group-unbordered mb-3">
														<li class="list-group-item"><b>性别</b> <a
															class="float-right" >${user.userSex }</a></li>
														<li class="list-group-item"><b>手机号</b> <a
															class="float-right" >${user.userPhoneNumber}</a>
														</li>
														
														<li class="list-group-item"><b>密码</b> <a
															class="float-right" style="width:140px">${user.userPassword }</a></li>
													</ul>
													<td><a class="btn btn-primary btn-block" href="javascript:void(0)" onclick="return del(${user.userId})">删除</a></td>
												</div>
											</div>
										</div>

										<div class="col-md-9">
											<div class="card">
												<div class="card-header p-2">
													<ul class="nav nav-pills">
														<li class="nav-item"><a class="nav-link active"
															href="#activity" data-toggle="tab">足迹</a></li>
														<li class="nav-item"><a class="nav-link"
															href="#settings" data-toggle="tab">修改用户信息</a></li>
													</ul>
												</div>
												<!--足迹-->
												<div class="card-body">
													<div class="tab-content">
														<div class="active tab-pane" id="activity">
															<ul class="timeline timeline-inverse">
															<!-- 历史记录 -->
																<li><i class="fa fa-envelope bg-primary"></i>
																
																	<div class="timeline-item">
																		<span class="time"><i class="fa fa-clock-o"></i>
																			2018/7/22 12:05</span>
																		<h3 class="timeline-header">
																			<a href="#">课程历史记录</a>
																		</h3>
																	
																		<div class="timeline-body">
																			<p>听力课程 英语四级 视听说教程2</p>
																			<p>学习了视听说5-7章的课程</p>
																		</div>
																		<div class="timeline-footer">
																			<a href="#" class="btn btn-primary btn-sm">查看详情</a>

																		</div>
																	</div></li>
																	 <!-- 打卡记录 -->
																<li><i class="fa fa-user bg-info"></i>
                                                                   
																	<div class="timeline-item">
																		<span class="time"><i class="fa fa-clock-o"></i>2018/7/23
																			19:00</span>

																		<h3 class="timeline-header no-border">
																			<a href="#">打卡</a>
																		</h3>
																		<div class="timeline-footer">
																			<a href="#" class="btn  btn-info btn-flat btn-sm">查看详情</a>
																		</div>
																	</div></li>
																	<!-- 意见反馈 -->
																<li><i class="fa fa-comments bg-warning"></i>

																	<div class="timeline-item">
																		<span class="time"><i class="fa fa-clock-o"></i>2018/8/10
																			8:30</span>

																		<h3 class="timeline-header">
																			<a href="#">意见反馈</a> 已审核
																		</h3>

																		<div class="timeline-body">英语课程讲的太快了</div>
																		<div class="timeline-footer">
																			<a href="#" class="btn btn-warning btn-flat btn-sm">查看详情</a>
																		</div>
																	</div></li>
																<!-- 收藏记录-->
																<li><i class="fa fa-clock-o bg-success"></i>
																	<div class="timeline-item">
																		<span class="time"><i class="fa fa-clock-o"></i>2018/8/12
																			14:30</span>

																		<h3 class="timeline-header">
																			<a href="#">收藏课程</a>
																		</h3>

																		<div class="timeline-body">收藏了日语阅读课程</div>
																		<div class="timeline-footer">
																			<a href="#" class="btn btn-success btn-flat btn-sm">查看详情</a>
																		</div>
																	</div></li>

															</ul>

														</div>
														<!--修改用户信息-->
														<div class="tab-pane" id="settings">
															<form class="form-horizontal" action="${pageContext.request.contextPath}/user/admin/updateUserInfoByAdmin" enctype="multipart/form-data" method="POST">
																<div class="form-group">
																<input type="hidden" name="userId" value="${user.userId}">
					
																	<label class="col-sm-2 control-label">用户名</label>

																	<div class="col-sm-10">
																		<input type="text" class="form-control"
																			 name="userName" value="${user.userName}">
																	</div>
																</div>
																<div class="form-group">
																	<label class="col-sm-2 control-label">性别</label>

																	<div class="col-sm-10">
																		<input type="text" class="form-control"
																			 name="userSex" value="${user.userSex }">
																	</div>
																</div>
																<div class="form-group">
																	<label  class="col-sm-2 control-label">用户手机号</label>

																	<div class="col-sm-10">
																		<input type="text" class="form-control"
																			 name="userPhoneNumber" value="${user.userPhoneNumber }">
																	</div>
																</div>
																<div class="form-group">
																	<label  class="col-sm-2 control-label"  >用户密码</label>

																	<div class="col-sm-10">
																		<input type="text" class="form-control"
																			 name="userPassword" value="${user.userPassword}">
																	</div>
																</div>
																<label >原头像:</label>
					                                           <img src="${user.userAvatarUrl}" height="40px" width="60px"/>
																<div class="form-group">
																	<label for="exampleInputFile"
																		class="col-sm-2 control-label">用户头像</label>
																	<div class="input-group">
																		<div class="custom-file col-sm-10">
																			<input class="form-control" type="file"  name="userAvatar" >
																		</div>
																	</div>
																</div>

																<div class="form-group">
																	<div class="col-sm-offset-2 col-sm-10">
																		<button type="submit" class="btn btn-danger">提交修改</button>
																	</div>
																</div>
															</form>
														</div>
														<!--修改用户信息结束 -->
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</section>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- DataTables -->
	<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap4.min.js"></script>
	<!-- SlimScroll -->
	<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>
	<!-- page script -->
	<script>
    $(function () {
      $("#example1").DataTable();
      $('#example2').DataTable({
        "paging": true,
        "lengthChange": false,
        "searching": false,
        "ordering": true,
        "info": true,
        "autoWidth": false
      });
    });
</script>
<script type="text/javascript">
		function del(id){
			var info = confirm("确认要删除该语言类别吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/user/admin/deleteUser?userId="+id,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  location.href="${pageContext.request.contextPath}/user/admin/userlist_manage/1";
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