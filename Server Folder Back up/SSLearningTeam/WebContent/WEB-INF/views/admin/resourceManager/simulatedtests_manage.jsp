<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	  <title>听说在线学习平台 | 模拟套题管理</title>
	  <!-- Tell the browser to be responsive to screen width -->
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <jsp:include page="../leftNavigation.jsp"></jsp:include>
	</head>
	<script>
	/*加载rateType*/
	function getRateType() {
	    var languageTypeId = $("#languageType").val();
	    $("#rateType").empty();
	    $.ajax({
	        type: "get",
	        url: "${pageContext.request.contextPath}/ratetype/user/getratetypebylanguagetypeid",
	        data: {"languageTypeId": languageTypeId},
	        success: function (data) {
	            $('#rateType').append("<option value='' selected='selected' >" + '请选择' + "</option>");
	            var info = data.info;
	            for (var i = 0; i < info.length; i++) {
	                $('#rateType').append("<option value='" + info[i].rateTypeId + "' >" + info[i].rateName + "</option>");
	            }
	        },
	        error: function () {
	            alert("加载类别类型");
	        }
	    });
	};
</script>
<script>
	var selectSimulatedTestId;
	var courseType;
	function addQuestion(simulatedTestId,courseType){
		if(simulatedTestId == 'exist'){
			courseType = $("#chooseCourse").val();
		}else{
			selectSimulatedTestId = simulatedTestId;	
			window.courseType = courseType;
		}
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/train/admin/getAllQuestionByCourseType",
	  		  data:{
	  			  "courseType":courseType
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				var infos;
	  				var courseIds = new Array();
	  				var questions = result.info;
	  				var tag = 0;
	  				var insertInfo = "";
	  				for(var i=0;i<questions.length;i++){
	  					tag = 0;
	  					for(var m=0;m<courseIds.length;m++){
	  						if(questions[i].courseId == courseIds[m].courseId){
	  							courseIds[m].questionNames.push(questions[i].questionContent);
		  						tag = 1;
	  						}
	  					}
	  					if(tag == 0){
	  						var courseInfos = {};
	  						courseInfos.courseId = questions[i].courseId;
	  						var array = new Array();
	  						array.push(questions[i].questionContent);
	  						courseInfos.questionNames = array;
	  						courseIds.push(courseInfos);
	  					}
	  				}
	  				for(var i=0;i<courseIds.length;i++){
	  					var questionNames = courseIds[i].questionNames;
	  					insertInfo+=createDIV(courseIds[i].courseId,questionNames);
	  				}
	  				insertInfo+="<br/><input type='text' class='form-control' id='testQuestionName' placeholder='请输入问题的别名'/>";
	  			  }else{
	  				$("#modalInfo").html(result.info);
	  			  }
	  			  $("#modalInfo").html(insertInfo);
	  		  }
	  		});
		$('#myModal').modal('show');
	}
	
	function createDIV(courseId,questionsNames){
		var divInfo = "<div><input type='radio' class='radio-primary' name='question' value='"+courseId+"'><label style='color:#307df6;font-size:18px;margin-left:10px;'>课程编号:"+courseId+"</label><br/>";
		var innerInfo="";
		for(var i=0;i<questionsNames.length;i++){
			innerInfo+="<label style='color:#307df6;font-size:15px;margin-left:25px;'>"+questionsNames[i]+"</label><br/>"
		}
	 	var lastInfo = "</div>";
	 	var all = divInfo+innerInfo+lastInfo;
	 	return all;
	}
	
	function closeModal(){
		$('#myModal').modal('hide')
	}
	
	function submitModal(){
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/train/admin/addTestQuestion",
	  		  data:{
	  			  "courseType":courseType,
	  			  "courseId":$("input[name='question']:checked").val(),
	  			  "testQuestionName":$("#testQuestionName").val(),
	  		  	  "simulatedTestId":selectSimulatedTestId
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  					alert(result.info)
	  			  }else{
	  					alert(result.info)
	  			  }
	  		  }
	  		});
		$('#myModal').modal('hide'); 
	} 

	function getAllQuestion(simulatedTestId){
		var needSimulatedTestId = simulatedTestId;
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/train/admin/getAllTestQuestionBySimulatedTest",
	  		  data:{
	  		  	  "simulatedTestId":needSimulatedTestId
	  		  },
	  		  success: function(result){
	  			  if(result.status){
	  				    var infoQuestionDiv="";
	  				  	for(var i=0;i<result.info.length;i++){
	  				  		infoQuestionDiv+=createQuestionInfoDIV(result.info[i].testQuestionId,result.info[i].testQuestionName);
	  				  	}
	  				  	console.log(infoQuestionDiv)
	  					$("#AllCourseInfoResult").html(infoQuestionDiv);
	  					$('#myModal2').modal('show'); 
	  			  }else{
	  					$("#AllCourseInfoResult").html(result.info);
	  					$('#myModal2').modal('show'); 
	  			  }
	  		  }
	  		});
	}
	
	function createQuestionInfoDIV(testQuestionId,testQuestionName){
		var info = "<div style='margin:10px'><input type='button' class='btn btn-danger' onclick='deleteTestQuestion(this,"+testQuestionId+")' value='移除问题'/><label style='padding-left:10px;color:#307df6'>"+testQuestionName+"</label></div>";
		return info;
	}
	
	function deleteTestQuestion(button,testQuestionId){
		$.ajax({
	  		  type: 'get',
	  		  url: "${pageContext.request.contextPath}/train/admin/deleteTestQuestion",
	  		  data:{
	  		  	  "testQuestionId":testQuestionId
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
</script>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<!-- 类别类型分类 -->
		<section class="content">
			<div class="container-fluid">
			<div class="card">
			<div class="card-header">
			  
               <a style="color:#a4042a" href="${pageContext.request.contextPath}/train/admin/toAddSimulatedTest">
               <img alt="" src="../../../img/resource/add.png" width="24px" height="24px">&nbsp;&nbsp;添加模拟套题</a>
              </div>
				<div class="card-body table-responsive p-0">
					<table class="table table-hover table-bordered">
						<tr style="text-align: center; color: #570250">
							<th>试题编号</th>
							<th>语言类别</th>
							<th>类别类型</th>
							<th>课程名称</th>
							<th>课程图标</th>
							<th colspan="4">操作</th>
						</tr>
						<c:forEach var="simulatedTests" items="${simulatedTests}" varStatus="status">
							<tr style="text-align: center">
								<td>${status.count}</td>
								<td>${simulatedTests.languageType.languageName }</td>
								<td>${simulatedTests.rateType.rateName }</td>
								<td>${simulatedTests.testName }</td>
								<td><span class="tag tag-success">
								<img src="${simulatedTests.instructionImgUrl}" height="25px" width="25px" /> </span></td>
								<td>
									<!-- 按钮触发模态框 -->
									<input type="button" class="btn btn-success" onclick="addQuestion(${simulatedTests.simulatedTestId},'listeningcourse')" value="添加试题"/>
								</td>
								<td>
									<input type="button" class="btn btn-primary" onclick="getAllQuestion(${simulatedTests.simulatedTestId})" value="查看试题"/>
								</td>
								<td><a class="btn btn-warning" href="${pageContext.request.contextPath}/train/admin/toUpdateSimulatedTest?simulatedTestId=${simulatedTests.simulatedTestId}">修改</a></td>
								<td><a class="btn btn-danger" href="javascript:void(0)" onclick="return del(${simulatedTests.simulatedTestId})">删除</a></td>
								</tr>
						</c:forEach>
					</table>
				</div>
				<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${totalPages}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/train/admin/simulatedtests_manage/${count.index}">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>
	<!-- 添加模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">
						请选择课程
					</h4>
				</div>
				<div class="modal-body" id="coursesInfo">
					请选择试题课程类型
					 <select id="chooseCourse" onchange="addQuestion('exist')">
						<option value="listeningcourse">听力课程</option>
						<option value="oralcourse">口语课程</option>
						<option value="readingcourse">阅读课程</option>
					</select> 
					<div id="modalInfo"></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" onclick="closeModal()" id="closeBtn">关闭</button>
					<button type="button" class="btn btn-primary" onclick="submitModal()" id="submitChoose">
						添加课程
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
	
	<!-- 查看和删除问题模态框（Modal） -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">
						模拟套题的题目内容
					</h4>
				</div>
				<div class="modal-body" id="AllCourseInfoResult">
					
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
	<script type="text/javascript">
	function del(id){
		var info = confirm("确认要删除该模拟套题吗？");
		if(info){
			$.ajax({
				  type: 'get',
				  url: "${pageContext.request.contextPath}/train/admin/deleteSimulatedTest?simulatedTestId="+id,
				  success: function(result){
					  if(result.status){
						  alert(result.info);
						  location.href="${pageContext.request.contextPath}/train/admin/simulatedtests_manage/1";
					  }else{
						alert(result.info);
					  }
				  },
				  error:function(result){
					  alert("删除失败");
				  }
				});
		}
	}
		</script>
</body>
</html>