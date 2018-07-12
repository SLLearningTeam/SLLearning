<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 管理端 课程添加</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/iCheck/flat/blue.css">
<!-- Morris chart -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/morris/morris.css">
<!-- jvectormap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker-bs3.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">

		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#"><i class="fa fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link">回到首页</a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link"></a></li>
			</ul>

			<!-- 搜索 -->
			<form class="form-inline ml-3">
				<div class="input-group input-group-sm">
					<input class="form-control form-control-navbar" type="search"
						placeholder="请输入搜索内容" aria-label="Search">
					<div class="input-group-append">
						<button class="btn btn-navbar" type="submit">
							<i class="fa fa-search"></i>
						</button>
					</div>
				</div>
			</form>

			<!-- Right navbar links -->
			<ul class="navbar-nav ml-auto">
				<!-- Messages Dropdown Menu -->
				<li class="nav-item dropdown"><a class="nav-link"
					data-toggle="dropdown" href="#"> <i class="fa fa-comments-o"></i>
						<span class="badge badge-danger navbar-badge">3</span>
				</a>
					<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img
									src="${pageContext.request.contextPath}/dist/img/user1-128x128.jpg"
									alt="User Avatar" class="img-size-50 mr-3 img-circle">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										Brad Diesel <span class="float-right text-sm text-danger"><i
											class="fa fa-star"></i></span>
									</h3>
									<p class="text-sm">Call me whenever you can...</p>
									<p class="text-sm text-muted">
										<i class="fa fa-clock-o mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img
									src="${pageContext.request.contextPath}/dist/img/user8-128x128.jpg"
									alt="User Avatar" class="img-size-50 img-circle mr-3">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										John Pierce <span class="float-right text-sm text-muted"><i
											class="fa fa-star"></i></span>
									</h3>
									<p class="text-sm">I got your message bro</p>
									<p class="text-sm text-muted">
										<i class="fa fa-clock-o mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img
									src="${pageContext.request.contextPath}/dist/img/user3-128x128.jpg"
									alt="User Avatar" class="img-size-50 img-circle mr-3">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										Nora Silvester <span class="float-right text-sm text-warning"><i
											class="fa fa-star"></i></span>
									</h3>
									<p class="text-sm">The subject goes here</p>
									<p class="text-sm text-muted">
										<i class="fa fa-clock-o mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item dropdown-footer">See All
							Messages</a>
					</div></li>
				<!-- Notifications Dropdown Menu -->
				<li class="nav-item dropdown"><a class="nav-link"
					data-toggle="dropdown" href="#"> <i class="fa fa-bell-o"></i> <span
						class="badge badge-warning navbar-badge">15</span>
				</a>
					<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
						<span class="dropdown-item dropdown-header">15
							Notifications</span>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i
							class="fa fa-envelope mr-2"></i> 4 new messages <span
							class="float-right text-muted text-sm">3 mins</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i class="fa fa-users mr-2"></i>
							8 friend requests <span class="float-right text-muted text-sm">12
								hours</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i class="fa fa-file mr-2"></i>
							3 new reports <span class="float-right text-muted text-sm">2
								days</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item dropdown-footer">See All
							Notifications</a>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					data-widget="control-sidebar" data-slide="true" href="#"><i
						class="fa fa-th-large"></i></a></li>
			</ul>
		</nav>
		<!-- 左侧选项栏 -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Logo显示页 -->
			<a href="#" class="brand-link"> <img
				src="${pageContext.request.contextPath}/dist/img/SL_logo.png"
				alt="SL Learning" class="brand-image img-circle elevation-3"
				style="opacity: .8"> <span
				class="brand-text font-weight-light">听说在线学习平台</span>
			</a>

			<!-- 选项组 -->
			<div class="sidebar">
				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- 首页 -->
						<li class="nav-item"><a href="./index.html"
							class="nav-link active"> <i class="nav-icon fa fa-dashboard"></i>
								<p>首页</p>
						</a></li>
						<!-- 用户管理 -->
						<li class="nav-item has-treeview"><a href="#"
							class="nav-link"> <i class="nav-icon fa fa-edit"></i>
								<p>
									用户管理 <i class="right fa fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/userManager/userList.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>查看用户列表</p>
								</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
										class="fa fa-circle-o nav-icon"></i>
										<p>查看用户详情</p>
								</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
										class="fa fa-circle-o nav-icon"></i>
										<p>总览用户信息</p>
								</a></li>
							</ul></li>
						<li class="nav-item has-treeview"><a href="#"
							class="nav-link"> <i class="nav-icon fa fa-tree"></i>
								<p>
									资源管理 <i class="right fa fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/charts/chartjs.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理语言分类</p>
								</a></li>
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/charts/flot.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理等级分类</p>
								</a></li>
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/charts/inline.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理课程分类</p>
								</a></li>
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/charts/inline.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理课程内容</p>
								</a></li>
								<li class="nav-item"><a href="pages/charts/inline.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理考试内容</p>
								</a></li>
							</ul></li>
						<li class="nav-item has-treeview"><a href="#"
							class="nav-link"> <i class="nav-icon fa fa-pie-chart"></i>
								<p>
									网站管理 <i class="right fa fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a
									href="${pageContext.request.contextPath}/pages/websiteManager/ideaFeedback.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>查看意见反馈</p>
								</a></li>
								<li class="nav-item"><a href="pages/charts/flot.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>查看访问监控</p>
								</a></li>
								<li class="nav-item"><a
									href="pages/websiteManager/recommendResource.html"
									class="nav-link"> <i class="fa fa-circle-o nav-icon"></i>
										<p>管理推荐资源</p>
								</a></li>
							</ul></li>
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<!-- 添加阅读课程 -->
					<div class="row">
						<div class="col-md">
							<div class="card card-info collapsed-card card-outline">
								<div class="card-header">
									<h3 class="card-title">添加阅读课程</h3>

									<div class="card-tools">
										<button type="button" class="btn btn-tool"
											data-widget="collapse">
											<i class="fa fa-plus"></i>
										</button>
									</div>
									<!-- /.card-tools -->
								</div>
								<!-- /.card-header -->
								<div class="card-body">

									<!-- 添加阅读 -->
									<div class="tab-pane" id="timeline">
										<form class="form-horizontal" method=""
											enctype="multipart/form-data">
											<div class="form-group">
												<label for="inputName" class="col-sm-2 control-label">课程名称</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputName"
														placeholder="请填写听力课程名称">
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-8">
													<label>请选择语言类别</label> <select class="form-control">
														<option>英语</option>
														<option>日语</option>

													</select>
												</div>
											</div>

											<div class="form-group">
												<div class="col-sm-8">
													<label>请选择语言类别类型</label> <select class="form-control">
														<option>四级</option>
														<option>六级</option>
													</select>
												</div>
											</div>

											<!-- 选择要分类的语言 -->

											<div class="form-group">
												<div class="col-sm-8">
													<label>请选择要进行分类的语言</label> <select class="form-control">
														<option>英语</option>
														<option>日语</option>
														<option>俄语</option>
														<option>法语</option>
														<option>泰语</option>
														<option>德语</option>
													</select>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程内容</label>
												<div class="col-sm-8">
													<textarea class="form-control" rows="3"
														placeholder="请填写课程内容"></textarea>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-3 control-label">课程资源图标</label>
												<div class="col-sm-8">
													<div class="custom-file">
														<input type="file" class="custom-file-input"
															id="exampleInputFile"> <label
															class="custom-file-label" for="exampleInputFile">请选择图标</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程下载量</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写课程下载量">
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写链接">
												</div>
											</div>

											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-8">
													<button type="submit" class="btn btn-danger">提交</button>
												</div>
											</div>
										</form>

									</div>








								</div>
								<!-- /.card-body -->
							</div>
							<!-- /.card -->
						</div>
						<!-- 添加听力课程 -->
						<div class="col-md">
							<div class="card card-warning collapsed-card card-outline">
								<div class="card-header">
									<h3 class="card-title">添加听力课程</h3>

									<div class="card-tools">
										<button type="button" class="btn btn-tool"
											data-widget="collapse">
											<i class="fa fa-plus"></i>
										</button>
									</div>
									<!-- /.card-tools -->
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<!-- 添加阅读 -->
									<div class="tab-pane" id="timeline">
										<form class="form-horizontal" method=""
											enctype="multipart/form-data">
											<div class="form-group">
												<label for="inputName" class="col-sm-2 control-label">课程名称</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputName"
														placeholder="请填写听力课程名称">
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">语言类别</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写语言类别">
												</div>
											</div>
											<div class="form-group">
												<label for="inputName2" class="col-sm-2 control-label">类别类型</label>

												<div class="col-sm-8">
													<input type="text" class="form-control" id="inputName2"
														placeholder="请填写类别类型">
												</div>
											</div>
											<!-- 选择要分类的语言 -->

											<div class="form-group">
												<div class="col-sm-8">
													<label>请选择要进行分类的语言</label> <select class="form-control">
														<option>英语</option>
														<option>日语</option>
														<option>俄语</option>
														<option>法语</option>
														<option>泰语</option>
														<option>德语</option>
													</select>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程内容</label>
												<div class="col-sm-8">
													<textarea class="form-control" rows="3"
														placeholder="请填写课程内容"></textarea>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-3 control-label">课程资源图标</label>
												<div class="col-sm-8">
													<div class="custom-file">
														<input type="file" class="custom-file-input"
															id="exampleInputFile"> <label
															class="custom-file-label" for="exampleInputFile">请选择图标</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程下载量</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写课程下载量">
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写链接">
												</div>
											</div>

											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-8">
													<button type="submit" class="btn btn-danger">提交</button>
												</div>
											</div>
										</form>

									</div>

								</div>
								<!-- /.card-body -->
							</div>
							<!-- /.card -->
						</div>
						<!-- 添加口语课程 -->
						<div class="col-md">
							<div class="card card-danger collapsed-card card-outline">
								<div class="card-header">
									<h3 class="card-title">添加口语课程</h3>

									<div class="card-tools">
										<button type="button" class="btn btn-tool"
											data-widget="collapse">
											<i class="fa fa-plus"></i>
										</button>
									</div>
									<!-- /.card-tools -->
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<!-- 添加阅读 -->
									<div class="tab-pane" id="timeline">
										<form class="form-horizontal" method=""
											enctype="multipart/form-data">
											<div class="form-group">
												<label for="inputName" class="col-sm-2 control-label">课程名称</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputName"
														placeholder="请填写听力课程名称">
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">语言类别</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写语言类别">
												</div>
											</div>
											<div class="form-group">
												<label for="inputName2" class="col-sm-2 control-label">类别类型</label>

												<div class="col-sm-8">
													<input type="text" class="form-control" id="inputName2"
														placeholder="请填写类别类型">
												</div>
											</div>
											<!-- 选择要分类的语言 -->

											<div class="form-group">
												<div class="col-sm-8">
													<label>请选择要进行分类的语言</label> <select class="form-control">
														<option>英语</option>
														<option>日语</option>
														<option>俄语</option>
														<option>法语</option>
														<option>泰语</option>
														<option>德语</option>
													</select>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程内容</label>
												<div class="col-sm-8">
													<textarea class="form-control" rows="3"
														placeholder="请填写课程内容"></textarea>
												</div>
											</div>


											<div class="form-group">
												<label for="inputEmail" class="col-sm-3 control-label">课程资源图标</label>
												<div class="col-sm-8">
													<div class="custom-file">
														<input type="file" class="custom-file-input"
															id="exampleInputFile"> <label
															class="custom-file-label" for="exampleInputFile">请选择图标</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-2 control-label">课程下载量</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写课程下载量">
												</div>
											</div>
											<div class="form-group">
												<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

												<div class="col-sm-8">
													<input type="email" class="form-control" id="inputEmail"
														placeholder="请填写链接">
												</div>
											</div>

											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-8">
													<button type="submit" class="btn btn-danger">提交</button>
												</div>
											</div>
										</form>

									</div>
									<!-- 添加听力阅读结束 -->
								</div>
								<!-- /.card-body -->
							</div>

						</div>

					</div>
				</div>
		</div>
		</section>
	</div>
	<footer class="main-footer">
		<strong>Copyright &copy; 2018 <a href="#">听说 在线学习平台</a>.
		</strong>
		<div class="float-right d-none d-sm-inline-block">
			<b>Version</b>3.0
		</div>
	</footer>
	<!-- Control Sidebar -->
	<aside class="control-sidebar control-sidebar-dark">
		<!-- Control sidebar content goes here -->
	</aside>
	<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

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