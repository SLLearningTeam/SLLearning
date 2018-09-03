<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 模拟套题修改</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../leftNavigation.jsp"></jsp:include>
<style type="text/css">
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
		<section class="content">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md">
						<div class="card card-info collapsed-card card-outline">
							<div class="card-header">
								<h3 class="card-title">修改模拟套题课程</h3>

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
									<form action="${pageContext.request.contextPath }/train/admin/updateSimulatedTest" method="POST" enctype="multipart/form-data">
											请选择语言类别：
											<select name="languageTypeId" id="languageType" onchange="getRateType()">
						                        <option value="${simulatedTest.languageType.languageTypeId}">${simulatedTest.languageType.languageName }</option>
						                        <c:forEach items="${languageTypes}" var="languageType">
						                        		<option value="${languageType.languageTypeId}">${languageType.languageName}</option>
						                        </c:forEach>
						                    </select>
										<br/>请选择类型类别：
											<select name="rateTypeId" id="rateType">
												<option value="${simulatedTest.rateType.rateTypeId}">${simulatedTest.rateType.rateName}</option>
											</select>
										<br/>请设置课程名称：<input type="text" name="testName" value="${simulatedTest.testName}"/>
										<br/>原课程图标：<img src="${simulatedTest.instructionImgUrl }" height="30px" width="30px"/>
										<br/>请添加课程图标：<input type="file" name="instructionImg"/>
										<input type="hidden" name="simulatedTestId" value="${simulatedTest.simulatedTestId}"/>
										<br/><input type="submit" value="提交"/>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>