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
																		<h3 class="timeline-header">
																			<a href="#">浏览记录</a>
																		</h3>
																	
																		<div class="timeline-body" id="history"></div>
																		<div class="timeline-footer">
																			<a href="javascript:void(0)" class="btn btn-primary btn-sm" id="historyButton" onclick="getHistoryRecordingsByUser('${user.userId}')">加载更多</a>
																		</div>
																	</div></li>
																	 <!-- 打卡记录 -->
																<li><i class="fa fa-user bg-info"></i>
                                                                   
																	<div class="timeline-item">

																		<h3 class="timeline-header">
																			<a href="#">签到天数</a>
																		</h3>
																		<div class="timeline-body" id="signIn"></div>
																		<div class="timeline-footer">
																			<a href="javascript:void(0)" id="signInButton" class="btn  btn-info btn-flat btn-sm" onclick="changeSignInRecordingsByUser('${user.userId}')">编辑信息</a>
																		</div>
																	</div></li>
																	<!-- 意见反馈 -->
																<li><i class="fa fa-comments bg-warning"></i>

																	<div class="timeline-item">
																		<h3 class="timeline-header">
																			<a href="#">意见反馈</a>
																		</h3>

																		<div class="timeline-body" id="advice"></div>
																		<div class="timeline-footer">
																			<a href="javascript:void(0)" onclick="getAdviceRecordingsByUser('${user.userId}')" class="btn btn-warning btn-flat btn-sm" id="adviceButton">加载更多</a>
																		</div>
																	</div></li>
																<!-- 收藏记录-->
																<li><i class="fa fa-clock-o bg-success"></i>
																	<div class="timeline-item">
																		<h3 class="timeline-header">
																			<a href="#">课程订阅</a>
																		</h3>

																		<div class="timeline-body" id="subscription"></div>
																		<div class="timeline-footer">
																			<a href="javascript:void(0)" class="btn btn-success btn-flat btn-sm" id="subscriptionButton" onclick="getSubscriptionRecordingsByUser('${user.userId}')">加载更多</a>
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
	var historyAllPagesNum = 1;
	var historyCurrentPage = 0;
	var totalTimes = 0;
	var subscriptionAllPagesNum = 1;
	var subscriptionCurrentPage = 0;
	var adviceAllPagesNum = 1;
	var adviceCurrentPage = 0;
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
      getHistoryRecordingsByUser("${user.userId}");
      getSignInRecordingsByUser("${user.userId}");
      getSubscriptionRecordingsByUser("${user.userId}");
      getAdviceRecordingsByUser("${user.userId}");
    });
    
    //获得用户浏览历史
    function getHistoryRecordingsByUser(userId){
    		historyCurrentPage++;
    		if(historyCurrentPage<=historyAllPagesNum){
    			$.ajax({
    		  		  type: 'get',
    		  		  url: "${pageContext.request.contextPath}/course/admin/getHistoryRecordingOfUser/"+historyCurrentPage+"?userId="+userId,
    		  		  success: function(result){
    		  			  if(result.status){
    		  				  var info = result.info;
    		  				  historyCurrentPage = info.currentPage;
    		  				  historyAllPagesNum = info.pageNumber;
    		  				  var historyRecordings = info.historyRecordings;
    		  				  for(var i=0;i<historyRecordings.length;i++){
    		  					  $("#history").append("<p>"+"<a href=\"javascript:void(0)\" onclick=\"delUserHistory(this,"+historyRecordings[i].historyRecordingId+")\" class=\"btn btn-primary btn-sm\" style=\"margin-right:20px\">删除<\a>"+historyRecordings[i].course.languageType.languageName+"----"+historyRecordings[i].course.rateType.rateName+"----"+historyRecordings[i].course.courseName+"</p>");
    		  				  }
    		  				  if(historyCurrentPage>=historyAllPagesNum){
    		  					  $("#historyButton").attr("disabled",false);
    		  				  }
    		  			  }else{
    		  				alert(result.info);
    		  			  }
    		  		  }
    		  		});
    		}else{
    			alert("该用户浏览历史已全部显示完毕");
    		}
    }
    
    //获得用户签到天数
    function getSignInRecordingsByUser(userId){
			$.ajax({
		  		  type: 'get',
		  		  url: "${pageContext.request.contextPath}/user/admin/getUserSignInRecording?userId="+userId,
		  		  success: function(result){
		  			  if(result.status){
		  				  var info = result.info;
		  				  var signInId = info.signInId;
		  				  totalTimes = info.totalTimes;
		  				  var recentMark = info.recentMark;
		  				  if(recentMark == null){
		  				  	$("#signIn").append("该用户暂未签到");
		  				  	$("#signInButton").click(function(){
		  				  		alert("请注意：用户暂未签过到，无法修改用户签到信息！")
		  				  	});
		  				  }else{
		  					var signInRecommend = "用户已连续签到&nbsp;<b>"+totalTimes+"</b>&nbsp;天";
		  					$("#signIn").append(signInRecommend);
		  				  }
		  			  }else{
		  				alert(result.info);
		  			  }
		  		  }
		  		});
		}
     //修改用户签到天数
     function changeSignInRecordingsByUser(userId){
    	 	var changeTimes = prompt("请输入您想修改的签到天数");
    	 	if((changeTimes!="")&&(changeTimes!=null)){
    	 		$.ajax({
  		  		  type: 'get',
  		  		  url: "${pageContext.request.contextPath}/user/admin/updateSignInRecording?userId="+userId+"&&totalTimes="+changeTimes,
  		  		  success: function(result){
  		  			  if(result.status){
  		  				  alert(result.info);
  		  				  totalTimes = changeTimes;
  		  				  var signInRecommend = "用户已连续签到&nbsp;<b>"+totalTimes+"</b>&nbsp;天";
		  					$("#signIn").html(signInRecommend);
  		  			  }else{
  		  				alert(result.info);
  		  			  }
  		  		  }
  		  		});
    	 	}else{
    	 		alert("修改失败，请重试")
    	 	}	
     }
   
   //获得指定用户意见反馈
     function getAdviceRecordingsByUser(userId){
    	 	adviceCurrentPage++;
     		if(adviceCurrentPage<=adviceAllPagesNum){
     			$.ajax({
     		  		  type: 'get',
     		  		  url: "${pageContext.request.contextPath}/advice/user/getAdviceByUserId/"+adviceCurrentPage+"?userId="+userId,
     		  		  success: function(result){
     		  			  if(result.status){
     		  				  var info = result.info;
     		  				  adviceCurrentPage = info.currentPage;
     		  				  adviceAllPagesNum = info.pageNumber;
     		  				  var adviceRecordings = info.adviceInfoList;
     		  				  for(var i=0;i<adviceRecordings.length;i++){
     		  					  $("#advice").append("<p>"+"<a href=\"javascript:void(0)\" onclick=\"delUserAdvice(this,"+adviceRecordings[i].adviceId+")\" class=\"btn btn-warning btn-flat btn-sm\" style=\"margin-right:20px\">删除<\a>"+adviceRecordings[i].adviceInfo+"</p>");
     		  				  }
     		  				  if(subscriptionCurrentPage>=subscriptionAllPagesNum){
     		  					  $("#adviceButton").attr("disabled",false);
     		  				  } 
     		  			  }else{
     		  				alert(result.info);
     		  			  }
     		  		  }
     		  		});
     		}else{
     			alert("该用户反馈的意见已全部显示完毕");
     		}
     }
   
     
   //获得用户订阅课程
     function getSubscriptionRecordingsByUser(userId){
    	 	subscriptionCurrentPage++;
     		if(subscriptionCurrentPage<=subscriptionAllPagesNum){
     			$.ajax({
     		  		  type: 'get',
     		  		  url: "${pageContext.request.contextPath}/course/admin/getSubscriptionRecordingOfUser/"+subscriptionCurrentPage+"?userId="+userId,
     		  		  success: function(result){
     		  			  if(result.status){
     		  				  var info = result.info;
     		  				  subscriptionCurrentPage = info.currentPage;
     		  				  subscriptionAllPagesNum = info.pageNumber;
     		  				  var subscriptionRecordings = info.subscriptionRecordings;
     		  				  for(var i=0;i<subscriptionRecordings.length;i++){
     		  					 $("#subscription").append("<p>"+"<a href=\"javascript:void(0)\" onclick=\"delUserSubscription(this,"+subscriptionRecordings[i].subscriptionRecordingId+")\" class=\"btn btn-success btn-flat btn-sm\" style=\"margin-right:20px\">删除<\a>"+subscriptionRecordings[i].course.languageType.languageName+"----"+subscriptionRecordings[i].course.rateType.rateName+"----"+subscriptionRecordings[i].course.courseName+"</p>");
     		  				  }
     		  				  if(subscriptionCurrentPage>=subscriptionAllPagesNum){
     		  					  $("#subscriptionButton").attr("disabled",false);
     		  				  }
     		  			  }else{
     		  				alert(result.info);
     		  			  }
     		  		  }
     		  		});
     		}else{
     			alert("该用户订阅课程已全部显示完毕");
     		}
     }
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
		function delUserHistory(dom,historyId){
			var info = confirm("确认要删除该用户的历史记录吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/course/admin/deleteHistoryRecording?historyRecordingId="+historyId,
					  success: function(result){
						  if(result.status){
							  alert("删除成功");
							  $(dom).parent().remove();
						  }else{
							alert(result.info);
						  }
					  }
					});
			}
		}
		
		//删除意见
		function delUserAdvice(dom,adviceId){
			var info = confirm("确认要删除该用户反馈的意见吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/advice/admin/deleteAdvice?adviceId="+adviceId,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  $(dom).parent().remove();
						  }else{
							alert(result.info);
						  }
					  }
					});
			}
		}
		
		//删除订阅
		function delUserSubscription(dom,subscriptionRecordingId){
			console.log(subscriptionRecordingId);
			var info = confirm("确认要删除该用户的订阅记录吗？");
			if(info){
				$.ajax({
					  type: 'get',
					  url: "${pageContext.request.contextPath}/course/admin/deleteSubscriptionRecording?subscriptionRecordingId="+subscriptionRecordingId,
					  success: function(result){
						  if(result.status){
							  alert(result.info);
							  $(dom).parent().remove();
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