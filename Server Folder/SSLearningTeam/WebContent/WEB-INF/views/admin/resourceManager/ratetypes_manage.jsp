<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	  <title>听说在线学习平台 | 类别分类管理</title>
	  <!-- Tell the browser to be responsive to screen width -->
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet"
	href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
	</head>
	<body class="hold-transition sidebar-mini">
		<div class="wrapper">
		<!-- 类别类型分类 -->
			<section class="content">
				<div class="container-fluid">
					<div class="card-body table-responsive p-0">
						<table class="table table-hover">
							<tr style="text-align: center; color: #930205">
								<th>类别类型编号</th>
								<th>语言类别</th>
								<th>类别类型名称</th>
								<th>类别类型图标</th>
								<th colspan="2">操作</th>
							</tr>
							<tr style="text-align: center">
								<td>1</td>
								<td>英语</td>
								<td>四级</td>
								<td><span class="tag tag-success"><img
										src="https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1531362740&di=f74f8a48242f689f1ecd128d02e1aa62&src=http://up.zyxschool.com/mingxiao/20160429/14618955473241.jpg"
										alt="picture" width=“20px” height="20px"> </span></td>
								<td><a href="#">修改</a></td>
								<td><a href="#">删除</a></td>
							</tr>

						</table>
					</div>
					<!-- 分页 -->

					<div class="card-footer clearfix">

						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link" href="#">«</a></li>
							<li class="page-item"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#">»</a></li>
						</ul>
					</div>
				</div>
			</section>
		</div>
	</body>
</html>