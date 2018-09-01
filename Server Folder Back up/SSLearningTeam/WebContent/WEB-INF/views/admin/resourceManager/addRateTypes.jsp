<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 添加语言类别</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
<!-- 自定义样式 -->
<style>
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}
.col-top {
	margin-top: 50px;

}
label{ color: #007BFF}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
			<section class="content-header">
				<div class="container-fluid ">
					<!--添加语言类别 -->
					<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
					<form action="${pageContext.request.contextPath}/ratetype/admin/addratetypes" enctype="multipart/form-data" method="POST">
						<label>请选择语言类别</label> 
						<select class="form-control" name="languageTypeId" >
							<c:forEach items="${languageTypes}" var="language">
								<option value="${language.languageTypeId }" >${language.languageName }</option>
							</c:forEach>
						</select> 
						<label for="rateName">类别类型名称</label>
						 <input type="text" class="form-control" id="rateName" placeholder="请填写类别类型名称" name="rateName" required="required">
						<div class="form-group">
							<label for="rateIconUrl">添加类别类型图标</label>
							<input id="file" type="file" class=" btn  btn-default" style="width:482px" name="rateIcon" required="required">
				           
                             <div class="col-top">
							<button type="submit" class="btn btn-primary float-right">提交</button>
						    </div>
						</div>
					</form>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- /.content -->
		</div>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
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
