<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 模拟试题添加</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
<style type="text/css">
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}
.col-top {
	margin-top: 30px;

}
label {
	color: #ab0351
}
</style>
</head>
<script>
	/*加载rateType*/
	function getRateType() {
		var languageTypeId = $("#languageType").val();
		$("#rateType").empty();
		$
				.ajax({
					type : "get",
					url : "${pageContext.request.contextPath}/ratetype/user/getratetypebylanguagetypeid",
					data : {
						"languageTypeId" : languageTypeId
					},
					success : function(data) {
						console.log(data)
						$('#rateType').append(
								"<option value='' selected='selected' >"
										+ '请选择' + "</option>");
						var info = data.info;
						for (var i = 0; i < info.length; i++) {
							$('#rateType').append(
									"<option value='" + info[i].rateTypeId + "' >"
											+ info[i].rateName + "</option>");
						}
					},
					error : function() {
						alert("加载类别类型失败");
					}
				});
	};
</script>

<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content-header">
			<div class="container-fluid">
				<!-- 添加模拟测试套题课程 -->
				
						<div class="card card-primary  card-outline">
							<div class="card-header">
								<h3 class="card-title">添加模拟测试套题课程</h3>
							</div>
							<div class="col-sm col-xs col-md-6 col-center-block">
								<form action="${pageContext.request.contextPath}/train/admin/addSimulatedTest"
									method="POST" enctype="multipart/form-data">
									<br/>
									<label style="color:#307df6">请选择语言类别：</label> 
									<select class="form-control" name="languageTypeId"
										id="languageType" onchange="getRateType()">
										<option value="">--请选择--</option>
										<c:forEach items="${languageTypes}" var="languageType">
											<option value="${languageType.languageTypeId}">${languageType.languageName}</option>
										</c:forEach>
									</select><br/> 
									<label style="color:#307df6">请选择类型类别：</label> 
									<select class="form-control" name="rateTypeId" id="rateType">
										<option value="">--请选择--</option>
									</select><br/>
									<label style="color:#307df6">请设置课程名称：</label> 
									<input class="form-control" type="text" name="testName" /><br/>
									<div class="form-group">
							                <label style="color:#307df6">请添加课程图标：</label>
							                <input type="file" class="form-control" name="instructionImg" />
										<div class="col-top">
											<button type="submit" class="btn btn-primary btn-block">提交</button>
										</div>
									</div>
								</form>
								</div>
						</div>
			</div>
		</section>
	</div>
</body>
</html>