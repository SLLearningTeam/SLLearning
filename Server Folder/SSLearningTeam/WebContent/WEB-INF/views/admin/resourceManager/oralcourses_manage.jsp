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
												<th colspan="4">操作</th>
											</tr>
											<%request.setAttribute("number",1); %>
                                           	<c:forEach var="oralcourse" items="${courses.oralCourses}">
												<tr style="text-align: center">
													<td>${number}</td>
													<%request.setAttribute("number",((int)request.getAttribute("number")+1)); %>
													<td>${oralcourse.courseName}</td>
													<td>${oralcourse.languageType.languageName}</td>
													<td>${oralcourse.rateType.rateName}</td>
													<td><a href="javascript:void(0)" onclick="showAddCourseQuestion('oralcourse',${oralcourse.courseId},this)" class="btn btn-success">添加问题</a></td>
													<td><a href="javascript:void(0)" onclick="showAllCourseQuestion('oralcourse',${oralcourse.courseId},this)" class="btn btn-primary">查看问题</a></td>
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
	<!-- 添加模态框（Modal） -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">
						请添加问题
					</h4>
				</div>
				<div class="modal-body" id="coursesInfo">
					<input type="hidden" id="courseTypeModel" name="courseType">
					<input type="hidden" id="courseIdModel" name="courseId">
					请添加问题名称<input type="text" class="form-control" name="questionContent" id="questionContentModel"/>
					请添加问题A<input type="text" class="form-control" name="answerA" id="answerAModel"/>
					请添加问题B<input type="text" class="form-control" name="answerB" id="answerBModel"/>
					请添加问题C<input type="text" class="form-control" name="answerC" id="answerCModel"/>
					请添加问题D<input type="text" class="form-control" name="answerD" id="answerDModel"/>
					请选择准确答案<input type="radio" name="answerReal" value="1"/>&nbsp;A&nbsp;<input type="radio" name="answerReal" value="2"/>&nbsp;B&nbsp;<input type="radio" name="answerReal" value="3"/>&nbsp;C&nbsp;<input type="radio" name="answerReal" value="4"/>&nbsp;D&nbsp;<br/>
					请添加答案详解<input type="text" class="form-control" name="answerReason" id="answerReasonModel"/>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="addQuestionToCourse()">
						添加问题
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
	
	<!-- 添加模态框（Modal） -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">
						课程全部问题
					</h4>
				</div>
				<div class="modal-body" id="courseQuestionList">
					    本课程暂未添加课程问题
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
	<!-- 添加模态框（Modal） -->
	<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel3">
						请修改问题
					</h4>
				</div>
				<div class="modal-body" id="coursesInfo3">
					<input type="hidden" id="questionIdModel3" name="questionId">
					<input type="hidden" id="courseTypeModel3" name="courseType">
					<input type="hidden" id="courseIdModel3" name="courseId">
					请添加问题名称<input type="text" class="form-control" name="questionContent" id="questionContentModel3"/>
					请添加问题A<input type="text" class="form-control" name="answerA" id="answerAModel3"/>
					请添加问题B<input type="text" class="form-control" name="answerB" id="answerBModel3"/>
					请添加问题C<input type="text" class="form-control" name="answerC" id="answerCModel3"/>
					请添加问题D<input type="text" class="form-control" name="answerD" id="answerDModel3"/>
					请选择准确答案<input type="radio" name="answerReal" value="1"/>&nbsp;A&nbsp;<input type="radio" name="answerReal" value="2"/>&nbsp;B&nbsp;<input type="radio" name="answerReal" value="3"/>&nbsp;C&nbsp;<input type="radio" name="answerReal" value="4"/>&nbsp;D&nbsp;<br/>
					请添加答案详解<input type="text" class="form-control" name="answerReason" id="answerReasonModel3"/>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="changeQuestionToCourse()">
						修改问题
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
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
	

	function showAddCourseQuestion(courseType,courseId){
		$('#courseTypeModel').val(courseType);
		$('#courseIdModel').val(courseId);
		$('#myModal1').modal('show');
	}
	
	function showAllCourseQuestion(courseType,courseId){
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/course/admin/getAllQuestion",
	  		  data:{
	  		  	  "courseType":courseType,
	  		  	  "courseId":courseId
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				    var infoQuestionListDiv="";
	  				  	for(var i=0;i<result.info.length;i++){
	  				  		infoQuestionListDiv+=createQuestionListDIV(result.info[i].questionId,result.info[i].questionContent);
	  				  	}
	  				  	console.log(infoQuestionListDiv)
	  					$("#courseQuestionList").html(infoQuestionListDiv);
	  					$('#myModal2').modal('show'); 
	  			  }else{
	  					$("#courseQuestionList").html("本课程暂未添加课程问题");
	  					$('#myModal2').modal('show'); 
	  			  }
	  		  }
	  		});
	}
	
	function addQuestionToCourse(){
		var courseType = $('#courseTypeModel').val();
		var courseId = $('#courseIdModel').val();
		var questionContent = $('#questionContentModel').val();
		var answerA = $('#answerAModel').val();
		var answerB = $('#answerBModel').val();
		var answerC = $('#answerCModel').val();
		var answerD = $('#answerDModel').val();
		var answerReal = $('input[name="answerReal"]:checked').val();
		var answerReason = $('#answerReasonModel').val();
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/course/admin/addQuestion",
	  		  data:{
	  			"courseType":courseType,
	  			"courseId":courseId,
	  			"questionContent":questionContent,
	  			"answerA":answerA,
	  			"answerB":answerB,
	  			"answerC":answerC,
	  			"answerD":answerD,
	  			"answerReal":answerReal,
	  			"answerReason":answerReason
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				alert(result.info);
	  				$('#myModal1').modal('hide'); 
	  			  }else{
	  				alert(result.info)
	  			  }
	  		  }
	  		});
	}
	
	function createQuestionListDIV(questionId,questionContent){
		var info = "<div style='margin:10px'><input type='button' class='btn btn-warning' onclick='changeTestQuestion(this,"+questionId+")' value='查看问题'/><input type='button' class='btn btn-danger' style='margin-left:10px;' onclick='deleteTestQuestion(this,"+questionId+")' value='移除问题'/><label style='padding-left:10px;color:#307df6'>"+questionContent+"</label></div>";
		return info;
	}
	
	function deleteTestQuestion(button,questionId){
	   $.ajax({
  		  type: 'get',
  		  url: "${pageContext.request.contextPath}/course/admin/deleteQuestion",
  		  data:{
  		  	  "questionId":questionId
  		  },
  		  success: function(result){
  			  if(result.status){
  				$(button).parent().remove();
  			  }else{
  				alert(result.info);
  			  }
  		  }
  		}); 
	}
	
	function changeTestQuestion(button,questionId){
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/course/admin/toChangeQuestion",
	  		  data:{
	  			"questionId":questionId
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				$('#questionIdModel3').val(result.info.questionId);
	  				$('#courseTypeModel3').val(result.info.courseType);
	  				$('#courseIdModel3').val(result.info.courseId);
	  				$('#questionContentModel3').val(result.info.questionContent);
	  				$('#answerAModel3').val(result.info.answerA);
	  				$('#answerBModel3').val(result.info.answerB);
	  				$('#answerCModel3').val(result.info.answerC);
	  				$('#answerDModel3').val(result.info.answerD);
	  				var num = result.info.answerReal-1;
	  				$('#myModal3 input[name="answerReal"]').eq(num).attr("checked", true);
	  				$('#answerReasonModel3').val(result.info.answerReason);
	  				$('#myModal3').modal('show'); 
	  			  }else{
	  				alert(result.info)
	  			  }
	  		  }
	  		});
	}
	
	function changeQuestionToCourse(){
		var questionId = $('#questionIdModel3').val();
		var courseType = $('#courseTypeModel3').val();
		var courseId = $('#courseIdModel3').val();
		var questionContent = $('#questionContentModel3').val();
		var answerA = $('#answerAModel3').val();
		var answerB = $('#answerBModel3').val();
		var answerC = $('#answerCModel3').val();
		var answerD = $('#answerDModel3').val();
		var answerReal = $('#myModal3 input[name="answerReal"]:checked').val();
		var answerReason = $('#answerReasonModel3').val();
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/course/admin/changeQuestion",
	  		  data:{
	  			"questionId":questionId,
	  			"courseType":courseType,
	  			"courseId":courseId,
	  			"questionContent":questionContent,
	  			"answerA":answerA,
	  			"answerB":answerB,
	  			"answerC":answerC,
	  			"answerD":answerD,
	  			"answerReal":answerReal,
	  			"answerReason":answerReason
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				alert(result.info);
	  				$('#myModal3').modal('hide'); 
	  			  }else{
	  				alert(result.info)
	  			  }
	  		  }
	  		});
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