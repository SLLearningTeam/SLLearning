<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 课程添加</title>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker-bs3.css">
<style type="text/css">
label {
	color: #ab0351
}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
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
								<div class="tab-pane" id="timeline">
									<div class="form-group">
										<label for="inputName" class="col-sm control-label">阅读课程名称</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputName"
												placeholder="请填写课程名称">
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm">
											<label>请选择语言类别</label> <select class="form-control">
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
										<div class="col-sm">
											<label>请选择语言类别类型</label> <select class="form-control">
												<option>四级</option>
												<option>六级</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程内容</label>
										<div class="col-sm">
											<textarea class="form-control" rows="3" placeholder="请填写课程内容"></textarea>
										</div>
									</div>


									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程资源图标</label>
										<div class="col-sm">
											<div class="custom-file">
												<input type="file" class="custom-file-input"
													id="exampleInputFile"> <label
													class="custom-file-label" for="exampleInputFile">请选择图标</label>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程下载量</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写课程下载量">
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写链接">
										</div>
									</div>

									<div class="form-group">
										<div class="col-sm-offset col-sm">
											<button type="submit" class="btn btn-info">提交</button>
										</div>
									</div>
								</div>
							</div>
						</div>
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

							</div>

							<div class="card-body">
								<!-- 添加听力-->
								<div class="tab-pane" id="timeline">

									<div class="form-group">
										<label for="inputName" class="col-sm control-label">课程名称</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputName"
												placeholder="请填写课程名称">
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm">
											<label>请选择语言类别</label> <select class="form-control">
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
										<div class="col-sm">
											<label>请选择语言类别类型</label> <select class="form-control">
												<option>四级</option>
												<option>六级</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程内容</label>
										<div class="col-sm">
											<textarea class="form-control" rows="3" placeholder="请填写课程内容"></textarea>
										</div>
									</div>


									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程资源图标</label>
										<div class="col-sm">
											<div class="custom-file">
												<input type="file" class="custom-file-input"
													id="exampleInputFile"> <label
													class="custom-file-label" for="exampleInputFile">请选择图标</label>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程下载量</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写课程下载量">
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写链接">
										</div>
									</div>


									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-8">
											<button type="submit" class="btn btn-warning">提交</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
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
							</div>
							<!-- /.card-header -->
							<div class="card-body">
								<!-- 添加口语 -->
								<div class="tab-pane" id="timeline">
									<div class="form-group">
										<label for="inputName" class="col-sm control-label">课程名称</label>
										<div class="col-sm">
											<input type="email" class="form-control" id="inputName"
												placeholder="请填写课程名称">
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm">
											<label>请选择语言类别</label> <select class="form-control">
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
										<div class="col-sm">
											<label>请选择语言类别类型</label> <select class="form-control">
												<option>四级</option>
												<option>六级</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程内容</label>
										<div class="col-sm">
											<textarea class="form-control" rows="3" placeholder="请填写课程内容"></textarea>
										</div>
									</div>


									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程资源图标</label>
										<div class="col-sm">
											<div class="custom-file">
												<input type="file" class="custom-file-input"
													id="exampleInputFile"> <label
													class="custom-file-label" for="exampleInputFile">请选择图标</label>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm control-label">课程下载量</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写课程下载量">
										</div>
									</div>
									<div class="form-group">
										<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

										<div class="col-sm">
											<input type="email" class="form-control" id="inputEmail"
												placeholder="请填写链接">
										</div>
									</div>

									<div class="form-group">
										<div class="col-sm-offset col-sm">
											<button type="submit" class="btn btn-danger">提交</button>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/dist/js/adminlte.js"></script>
</body>
</html>