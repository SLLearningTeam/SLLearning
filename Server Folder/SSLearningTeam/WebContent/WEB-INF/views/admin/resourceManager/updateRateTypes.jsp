<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 修改语言类别</title>
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

label {
	color: #7e0675
}
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="content-wrapper">
		<section class="content-header">
			<div class="container-fluid ">
				<!--添加语言类别 -->
				<div class="col-sm-6 col-xs-6 col-md-6 col-center-block col-top">
					<form
						action="${pageContext.request.contextPath}/ratetype/admin/updateratetype"
						enctype="multipart/form-data" method="POST">
						<input type="hidden" name="rateTypeId" value="${rateType.rateTypeId}"> 
						<label>请选择语言类别</label> 
							<select class="form-control" name="languageTypeId">
							<option value="${rateType.languageType.languageTypeId}">${rateType.languageType.languageName }</option>
							<c:forEach items="${languageTypes}" var="languageType">
								<option value="${languageType.languageTypeId}">${languageType.languageName }</option>
							</c:forEach>
						</select> 
						<label for="rateName">类别类型名称</label> <input type="text"
							class="form-control" name="rateName" value="${rateType.rateName}" required="required">
						<label for="rateIcon">原类别类型图标</label><br> <img
							src="${rateType.rateIconUrl}" height="30px" width="30px" />
						<div class="form-group">
							<label for="rateIcon">类别类型图标</label> <input class="form-control" type="file"  name="rateIcon" >
							<div class="col-top">
								<button type="submit" class="btn btn-primary float-right">提交</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</section>
	</div>
</body>
</html>
