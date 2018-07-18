<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 修改课程</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
	<!-- 自定义样式 -->
<style>
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}
.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}
.button1: hover{
    background-color: #4CAF50;
    color: white;
}
label{ color: #aa0129}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
		<div class="col-md-6  col-sm-6 col-xs-6 col-center-block">
	           <div class="card-body">
					<div class="tab-pane" id="timeline">
						<div class="form-group">
							<label for="inputName" class="col-sm control-label">阅读课程名称</label>

							<div class="col-sm">
								<input type="email" class="form-control" id="inputName">
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
								<textarea class="form-control" rows="3" ></textarea>
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
								<input type="email" class="form-control" id="inputEmail">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail" class="col-sm-6 control-label">图片链接</label>

							<div class="col-sm">
								<input type="email" class="form-control" id="inputEmail">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset col-sm">
								<button type="submit" class=" button1 ">提交</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	
</body>
</html>