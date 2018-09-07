<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>听说在线学习平台 | 课程修改</title>
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
						<div class="card card-info collapsed-card card-outline">
							<div class="card-header">
								<h3 class="card-title">修改口语课程</h3>

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
									<form action="${pageContext.request.contextPath }/course/admin/updateOralCourse" method="POST" enctype="multipart/form-data">
											请选择语言类别：
											<select name="languageTypeId" id="languageType" onchange="getRateType()">
						                        <option value="${oralCourse.languageType.languageTypeId}">${oralCourse.languageType.languageName }</option>
						                        <c:forEach items="${languageTypes}" var="languageType">
						                        		<option value="${languageType.languageTypeId}">${languageType.languageName}</option>
						                        </c:forEach>
						                    </select>
										<br/>请选择类型类别：
											<select name="rateTypeId" id="rateType">
												<option value="${oralCourse.rateType.rateTypeId}">${oralCourse.rateType.rateName}</option>
											</select>
										<br/>请设置课程名称：<input type="text" name="courseName" value="${oralCourse.courseName}"/>
										<br/>请输入中文内容：<textarea name="courseChineseContent" rows="10" cols="30"/>${oralCourse.courseChineseContent}</textarea>
										<br/>请输入英文内容：<textarea name="courseEnglishContent" rows="10" cols="30"/>${oralCourse.courseEnglishContent}</textarea>
										<br/>下载量：<input type="text" name="downloadNum" value="${oralCourse.downloadNum}"/>
										<br/>原课程图标：<img src="${oralCourse.instructionImgUrl }" height="30px" width="30px"/>
										<br/>请添加课程图标：<input type="file" name="instructionImg"/>
										<input type="hidden" name="courseId" value="${oralCourse.courseId}"/>
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