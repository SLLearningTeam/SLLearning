<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	margin-bottom:15px;
}
</style>
</head>
<script>
	function toAddOralCourse(){
		location.href="${pageContext.request.contextPath}/course/admin/toAddOralCourse";
	}
</script>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content">
			<div class="container-fluid">
				<!-- Small boxes (Stat box) -->
				<div class="col-xs col-sm col-md">
					<div class="card ">
						<div class="card-header p-2 ">
							
							<!-- 课程导航 -->
							<ul class="nav nav-pills ">
								<input type="button" class="btn btn-warning" style="margin-right:50px" value="添加课程" onclick="toAddOralCourse()"/>
								<li class="nav-item">
										<a class="nav-link" href="${pageContext.request.contextPath}/course/admin/courses_manage/1">
										综合课程列表
									</a>
								</li>
								<li class="nav-item">
										<a class="nav-link" href="${pageContext.request.contextPath}/course/admin/readingCourses_manage/1">
										阅读课程列表
									</a>
								</li>
								<li class="nav-item">
										<a class="nav-link" href="${pageContext.request.contextPath}/course/admin/listeningCourses_manage/1" >
										听力课程列表
									</a>
								</li>
								<li class="nav-item">
										<a class="nav-link active" href="${pageContext.request.contextPath}/course/admin/oralCourses_manage/1">
										口语课程列表
									</a>
								</li>
								
							</ul>
							
						</div>
						<!-- 阅读课程列表 -->
						<div class="card-body">
						<!-- 添加课程按钮 -->
							<div class="tab-content col-xs col-sm col-md">
								<div class="active tab-pane" id="activity"> 
										<table class="table table-hover table-bordered ">
											<tr style="text-align: center; color: #903d04">
												<th>课程编号</th>
												<th>课程名称</th>
												<th>语言类别</th>
												<th>类别类型</th>
												<th colspan="2">操作</th>
											</tr>
											<%request.setAttribute("number",1); %>
                                           	<c:forEach var="oralcourse" items="${courses.oralCourses}">
												<tr style="text-align: center">
													<td>${number}</td>
													<%request.setAttribute("number",((int)request.getAttribute("number")+1)); %>
													<td>${oralcourse.courseName}</td>
													<td>${oralcourse.languageType.languageName}</td>
													<td>${oralcourse.rateType.rateName}</td>
													<td><a href="${pageContext.request.contextPath}/course/admin/toUpdateOralCourse?courseId=${oralcourse.courseId}" class="btn btn-warning">修改</a></td>
													<td><a href="javascript:void(0)" onclick="delCourse('oralcourse',${oralcourse.courseId},this)" class="btn btn-danger">删除</a></td>
												</tr>
                                           	</c:forEach>
										</table>
								</div>
							</div>
								<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${totalPages}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/course/admin/courses_manage/${count.index}">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
							</div>	
						</div>
						
					</div>
				</div>
			</div>
		</section>
	</div>
	<script>
	function delCourse(courseType,courseId,dom){
		var info = confirm("确认要删除该课程吗？");
		if(info){
			if(courseType=='listeningcourse'){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/course/admin/deleteListeningCourse?courseId="+courseId,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  $(dom).parent().parent().remove();
						  }else{
							alert("删除失败");
						  }
					  }
					});
			}
			else if(courseType=='oralcourse'){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/course/admin/deleteOralCourse?courseId="+courseId,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  $(dom).parent().parent().remove();
						  }else{
							alert("删除失败");
						  }
					  }
					});
			}
			else{
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/course/admin/deleteReadingCourse?courseId="+courseId,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  $(dom).parent().parent().remove();
						  }else{
							alert("删除失败");
						  }
					  }
					});
			}
			
		}else{
			alert("删除失败");
		}
	}
	</script>
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