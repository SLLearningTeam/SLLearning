<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 课程添加</title>
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
				<!-- 添加阅读课程 -->
				<div class="row">
					<div class="col-md">
						<div class="card card-success  card-outline">
							<div class="card-header">
								<h3 class="card-title">添加口语课程</h3>
							</div>
							<!-- /.card-header -->
							<div class="card-body">
								<div class="tab-pane">
									<form action="${pageContext.request.contextPath }/course/admin/addOralCourse" method="POST" enctype="multipart/form-data">
											请选择语言类别：
											<select name="languageTypeId" id="languageType" onchange="getRateType()">
						                        <option value="">--请选择--</option>
						                        <c:forEach items="${languageTypes}" var="languageType">
						                        		<option value="${languageType.languageTypeId}">${languageType.languageName}</option>
						                        </c:forEach>
						                    </select>
										<br/><label>请选择类型类别：</label>
											<select name="rateTypeId" id="rateType">
												<option value="">--请选择--</option>
											</select>
										<br/><label>请设置课程名称：</label><input type="text" name="courseName" required="required"/>
										<br/><label>请输入中文内容：</label><textarea name="courseChineseContent" rows="10" cols="30" required="required"/></textarea>
										<br/><label>请输入英文内容：</label>请输入英文内容：<textarea name="courseEnglishContent" rows="10" cols="30" required="required"/></textarea>
										<br/><label>请添加课程图标：<label><input type="file" name="instructionImg" required="required"/>
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