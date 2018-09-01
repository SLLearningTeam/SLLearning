<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 课程管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">


<jsp:include page="../leftNavigation.jsp"></jsp:include>
<!-- 自定义样式 -->
<style type="text/css">
.left {
	float: right;
}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="container-fluid">
				<!-- Small boxes (Stat box) -->
				<div class="col-xs col-sm col-md">
					<div class="card ">
						<div class="card-header p-2 ">
							<!-- 添加课程按钮 -->
							<div class="left">
								<img src="./img/resource/add.png" height="25" width="25" />
							</div>
							<!-- 课程导航 -->
							<ul class="nav nav-pills ">
								<li class="nav-item"><a class="nav-link active"
									href="#activity" data-toggle="tab">阅读课程列表</a></li>
								<li class="nav-item"><a class="nav-link" href="#timeline"
									data-toggle="tab">听力课程列表</a></li>
								<li class="nav-item"><a class="nav-link" href="#settings"
									data-toggle="tab">口语课程列表</a></li>
							</ul>

						</div>
						<!-- 阅读课程列表 -->
						<div class="card-body">
							<div class="tab-content col-xs col-sm col-md">
								<div class="active tab-pane" id="activity">
									<form action="#" method="post">
										<table class="table table-hover table-bordered ">
											<tr style="text-align: center; color: #903d04">
												<th>课程编号</th>
												<th>课程名称</th>
												<th>语言类别</th>
												<th>类别类型</th>
											</tr>
											<tr style="text-align: center">
												<td>1</td>
												<td>英语阅读</td>
												<td>英语</td>
												<td>四级</td>
											</tr>

										</table>
									</form>
								</div>
								<!-- 听力课程列表-->
								<div class="tab-pane" id="timeline">
									<form action="#" method="post">
										<table class="table table-hover table-bordered">
											<tr style="text-align: center; color: #8a0480">
												<th>课程编号</th>
												<th>课程名称</th>
												<th>语言类别</th>
												<th>类别类型</th>
											</tr>
											<tr style="text-align: center">
												<td>1</td>
												<td>英语听力</td>
												<td>英语</td>
												<td>四级</td>
											</tr>
										</table>
									</form>
								</div>
								<!-- 口语课程列表 -->
								<div class="tab-pane" id="settings">
									<form action="#" method="post">
										<table class="table table-hover table-bordered">
											<tr style="text-align: center; color: #04746e">
												<th>课程编号</th>
												<th>课程名称</th>
												<th>语言类别</th>
												<th>类别类型</th>
											</tr>

											<tr style="text-align: center">
												<td>1</td>
												<td>英语口语</td>
												<td>英语</td>
												<td>四级</td>
											</tr>

										</table>
									</form>
								</div>
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

							<!-- /.tab-content -->
						</div>
						<!-- /.card-body -->
					</div>
				</div>
			</div>
		</section>
	</div>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button)
	</script>
	<!-- Bootstrap 4 -->
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Morris.js charts -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
	<!-- Sparkline -->
	<script
		src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- jQuery Knob Chart -->
	<script
		src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
	<!-- daterangepicker -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- datepicker -->
	<script
		src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<!-- Slimscroll -->
	<script
		src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script
		src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/dist/js/adminlte.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script
		src="${pageContext.request.contextPath}/dist/js/pages/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>
</body>
</html>