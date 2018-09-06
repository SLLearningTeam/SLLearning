<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	    
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>听说在线学习平台 | 左侧导航栏和上方header栏 </title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/flat/blue.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker-bs3.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">回到首页</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link"></a>
      </li>
    </ul>

    <!-- 搜索 -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="请输入搜索内容" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fa fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="fa fa-comments-o"></i>
          <span class="badge badge-danger navbar-badge">3</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Brad Diesel
                  <span class="float-right text-sm text-danger"><i class="fa fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  John Pierce
                  <span class="float-right text-sm text-muted"><i class="fa fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Nora Silvester
                  <span class="float-right text-sm text-warning"><i class="fa fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="fa fa-clock-o mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="fa fa-bell-o"></i>
          <span class="badge badge-warning navbar-badge">15</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <span class="dropdown-item dropdown-header">15 Notifications</span>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fa fa-envelope mr-2"></i> 4 new messages
            <span class="float-right text-muted text-sm">3 mins</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fa fa-users mr-2"></i> 8 friend requests
            <span class="float-right text-muted text-sm">12 hours</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fa fa-file mr-2"></i> 3 new reports
            <span class="float-right text-muted text-sm">2 days</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#"><i
            class="fa fa-th-large"></i></a>
      </li>
    </ul>
  </nav>
  <!-- 左侧选项栏 -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Logo显示页 -->
    <a href="#" class="brand-link">
      <img src="${pageContext.request.contextPath}/dist/img/SL_logo.png" alt="SL Learning" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">听说在线学习平台</span>
    </a>

    <!-- 选项组 -->
    <div class="sidebar">
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- 首页 -->
          	<c:if test="${pageName=='indexPage'}">
            <li class="nav-item">
          		<a href="${pageContext.request.contextPath }/user/init" class="nav-link active">
          	</c:if>	
          	<c:if test="${pageName!='indexPage'}">
            <li class="nav-item">
          		<a href="${pageContext.request.contextPath }/user/init" class="nav-link">
          	</c:if>	
              <i class="nav-icon fa fa-dashboard"></i>
              <p>
                首页
              </p>
            </a>
          </li>
          <!-- 用户管理 -->
          <c:if test="${(pageName=='userListManage'||pageName=='userChartManage')}">
          		
          <li class="nav-item has-treeview menu-open">
            <a href="#" class="nav-link active" >
            	</c:if>
            <c:if test="${(pageName!='userListManage'&&pageName!='userChartManage')}">
            <li class="nav-item has-treeview">
          		<a href="#" class="nav-link">
          	</c:if>	
              <i class="nav-icon fa fa-edit"></i>
              <p>
                用户管理
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item active">
               <c:if test="${pageName=='userListManage' }">
                <a href="${pageContext.request.contextPath}/user/admin/userlist_manage/1" class="nav-link active">
               </c:if>
               <c:if test="${pageName!='userListManage' }">
               <a href="${pageContext.request.contextPath}/user/admin/userlist_manage/1" class="nav-link">
               </c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>查看用户列表</p>
                </a>
              </li>
              <li class="nav-item active">
              <c:if test="${pageName=='userChartManage' }">
                <a href="${pageContext.request.contextPath}/user/admin/toUserChart" class="nav-link active">
                </c:if>
                 <c:if test="${pageName!='userChartManage' }">
                  <a href="${pageContext.request.contextPath}/user/admin/toUserChart" class="nav-link ">
                </c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>查看用户分布</p>
                </a>
              </li>
            </ul>
          </li>
          <!-- 资源管理 -->
          	<c:if test="${(pageName=='languageManage'||pageName=='rateTypeManage'||pageName=='courseManage'||pageName=='trainManage')}">
          		<li class="nav-item has-treeview menu-open">
          		<a href="#" class="nav-link active">
          	</c:if>
            <c:if test="${(pageName!='languageManage'&&pageName!='rateTypeManage'&&pageName!='courseManage'&&pageName!='trainManage')}">
          		<li class="nav-item has-treeview">
          		<a href="#" class="nav-link">
          	</c:if>
              <i class="nav-icon fa fa-tree"></i>
              <p>
                资源管理
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
            	<li class="nav-item">
	            <c:if test="${pageName=='languageManage' }">
	          		<a href="${pageContext.request.contextPath}/language/admin/languages_manage/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='languageManage' }">
	          		<a href="${pageContext.request.contextPath}/language/admin/languages_manage/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理语言分类</p>
                </a>
              </li>
             	<li class="nav-item">
              	<c:if test="${pageName=='rateTypeManage' }">
	          		<a href="${pageContext.request.contextPath}/ratetype/admin/ratetypes_manages/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='rateTypeManage' }">
	          		<a href="${pageContext.request.contextPath}/ratetype/admin/ratetypes_manages/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理等级分类</p>
                </a>
              </li>
              	<li class="nav-item active">
              	<c:if test="${pageName=='courseManage' }">
	          		<a href="${pageContext.request.contextPath}/course/admin/courses_manage/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='courseManage' }">
	          		<a href="${pageContext.request.contextPath}/course/admin/courses_manage/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理课程信息</p>
                </a>
              </li>
              	<li class="nav-item active">
              	<c:if test="${pageName=='trainManage' }">
	          		<a href="${pageContext.request.contextPath}/train/admin/simulatedtests_manage/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='trainManage' }">
	          		<a href="${pageContext.request.contextPath}/train/admin/simulatedtests_manage/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理模拟套题</p>
                </a>
              </li>
            </ul>
          </li>

          <!-- 网站管理 -->
          <c:if test="${(pageName=='adminManage'||pageName=='downloadRecordingManage'||pageName=='recommendManage')}">
          		<li class="nav-item has-treeview menu-open">
          		<a href="#" class="nav-link active">
          	</c:if>
            <c:if test="${(pageName!='adminManage'&&pageName!='downloadRecordingManage'&&pageName!='recommendManage')}">
          		<li class="nav-item has-treeview">
          		<a href="#" class="nav-link">
          	</c:if>
              <i class="nav-icon fa fa-pie-chart"></i>
              <p>
                 网站管理
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
            	<li class="nav-item">
	            <c:if test="${pageName=='adminManage' }">
	          		<a href="${pageContext.request.contextPath}/advice/admin/advices_manage/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='adminManage' }">
	          		<a href="${pageContext.request.contextPath}/advice/admin/advices_manage/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>查看意见反馈</p>
                </a>
              </li>
              	<li class="nav-item active">
              	<c:if test="${pageName=='downloadRecordingManage' }">
	          		<a href="${pageContext.request.contextPath}/website/admin/getDownloadRecordings/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='downloadRecordingManage' }">
	          		<a href="${pageContext.request.contextPath}/website/admin/getDownloadRecordings/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理下载记录</p>
                </a>
              </li>
              	<li class="nav-item active">
              	<c:if test="${pageName=='recommendManage' }">
	          		<a href="${pageContext.request.contextPath}/website/admin/carouselMap_manage/1" class="nav-link active">
	          	</c:if>
	            <c:if test="${pageName!='recommendManage' }">
	          		<a href="${pageContext.request.contextPath}/website/admin/carouselMap_manage/1" class="nav-link">
	          	</c:if>
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>管理轮播资源</p>
                </a>
              </li>
            </ul>
          </li>
         </ul>
         
      </nav>
      <!-- 
      <c:if test="${not empty info}">
	 ${pageName}
	  </c:if>
       -->
    </div>
  </aside>
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.request.contextPath}/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>
</body>
</html>
