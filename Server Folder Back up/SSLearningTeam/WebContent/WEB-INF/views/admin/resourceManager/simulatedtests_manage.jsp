<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
							<th colspan="2">操作</th>
						</tr>
						<c:forEach var="simulatedTest" items="${simulatedTests}" varStatus="status">
							<tr style="text-align: center">
								<td>${status.count}</td>
								<td>${languageType.languageTypeId }</td>
								<td>${rateType.rateTypeId }</td>
								<td>${simulatedTest.testName }</td>
								<td><span class="tag tag-success">
								<img src="${SimulatedTest.instructionImgUrl}" alt="picture" width=“25px” height="25px"> </span></td>
								<td><a href="${pageContext.request.contextPath}/train/admin/toUpdateSimulatedTest?simulatedTestId=${simulatedTest.simulatedTestId}">修改</a></td>
								<td><a href="javascript:void(0)" onclick="return del(${simulatedTest.simulatedTestId})">删除</a></td>
								</tr>
						</c:forEach>
					</table>
				</div>
				<!-- 分页 -->
					<div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<c:forEach varStatus="count" begin="1" end="${pageNumber}" step="1">
								<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/train/admin/simulatedtests_manage/${count.index}">${count.index}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script type="text/javascript">
	function del(id){
		var info = confirm("确认要删除该语言类别吗？");
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
				  }
				});
		}
	}
		</script>
</body>
</html>