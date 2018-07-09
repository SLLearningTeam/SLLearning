<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>听说在线学习平台 | 登录</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/adminlte.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  <style>
  	.error{
  		color:red
  	}
  </style>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="#"><b>听说 </b> 在线学习平台</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">请输入您的管理员账号</p>
      <form action="${pageContext.request.contextPath}/user/login" method="post" id="loginForm">
        <div class="form-group has-feedback">
          <input name="userPhoneNumber" type="text" class="form-control" placeholder="请输入您的手机号">
        </div>
        <div class="form-group has-feedback">
          <input name="userPassword" type="password" class="form-control" placeholder="请输入您的密码">
        </div>
        <div class="row">
          <div class="col-8">
            <div class="checkbox icheck">
              <label>
                <!-- <input name="userPermission" type="radio" value="0" checked="checked">&nbsp;&nbsp;普通账户
                <input name="userPermission" type="radio" value="1">&nbsp;&nbsp;管理账户 -->
                <input type="checkbox">&nbsp;&nbsp;记住账户
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
          </div>
          <!-- /.col -->
        </div>
      </form>

      <div class="social-auth-links text-center mb-3">
        <p>- OR -</p>
        <a href="#" class="btn btn-block btn-primary">
          <i class="fa fa-facebook mr-2"></i>&nbsp;使用Facebook账号登录
        </a>
        <a href="#" class="btn btn-block btn-danger">
          <i class="fa fa-google-plus mr-2"></i>&nbsp;使用Google+账号登录
        </a>
      </div>
      <!-- /.social-auth-links -->
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<!-- validate -->
<script src="${pageContext.request.contextPath}/js/plugins/validation/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/validation/messages_zh.js"></script>

<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass   : 'iradio_square-blue',
      increaseArea : '20%' // optional
    })
    $.validator.addMethod("isMobile", function(value, element) {
		var length = value.length;
 		var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
		return this.optional(element) || (length == 11 && mobile.test(value));
	}, "请填写正确的手机号码");
    $('#loginForm').validate({
    		rules:{
    			userPhoneNumber:{
    				required:true,
    				maxlength:11,
    				number:true,
    				// 自定义方法：校验手机号在数据库中是否存在
    				// checkPhoneExist : true,
    				isMobile:true
    			},
    			userPassword:{
    				required:true,
    				minlength:6,
    				maxlength:20
    			}
    		},
    		messages:{
    			userPhoneNumber:{
    				required:"请输入手机号",
    				minlength:"请填写正确的手机号码",
    				number:"请输入正确的手机号"
    			},
    			userPassword:{
    				required:"请输入密码",
    				minlength:"请输入至少6位密码",
    				maxlength:"您输入的密码过长"
    			}
    		}
    	})
  })
</script>
</body>
</html>
