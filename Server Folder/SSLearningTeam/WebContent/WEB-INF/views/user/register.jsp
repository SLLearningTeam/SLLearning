<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon/logo.png" type="image/x-icon" />
  <title>听说在线学习平台 | 用户注册</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="#"><b>听说 </b> 在线学习平台</a>
  </div>

  <div class="card">
    <div class="card-body register-card-body">
      <p class="login-box-msg">注册账户</p>

      <form action="#" method="post">
        <div class="form-group has-feedback">
          <span class="fa fa-user form-control-feedback" style="display: inline;margin-right:2%"></span>
          <input type="text" class="form-control" placeholder="请输入您的用户名" style="width:92%;display:inline">
        </div>
        <div class="form-group has-feedback">
        	  <span>请选择您的性别：&nbsp;&nbsp;</span>
          <input type="radio" class="flat-red" name="userSex" value="男" checked="checked">&nbsp;&nbsp;男
          <input type="radio" class="flat-red" name="userSex" value="女">&nbsp;&nbsp;女
        </div>
        <div class="form-group has-feedback">
        		<span class="fa fa-phone form-control-feedback" style="display: inline;margin-right:2%"></span>
        	    <input type="email" class="form-control" placeholder="请输入您的手机号" style="width:92%;display:inline">
        	  	<input type="button" class="btn btn-block btn-outline-secondary btn-lg" style="padding:0.4rem;margin-top:-6px;margin-right:2%;width:30%;display:inline;font-size: 0.8rem;margin-left:7%" value="发送验证码"><input type="text" class="form-control" placeholder="请填写验证码" style="margin-top:2%;width:60%;display:inline">
        </div>
        <div class="form-group has-feedback">
        	  <span class="fa fa-lock form-control-feedback" style="display: inline;margin-right:3%"></span>
          <input type="password" class="form-control" placeholder="请输入您的密码" style="width:92%;display:inline" >
        </div>
        <div class="form-group has-feedback">
        	  <span class="fa fa-lock form-control-feedback" style="display: inline;margin-right:3%"></span>
          <input type="password" class="form-control" style="width:92%;display:inline" placeholder="请重新输入您的密码">
        </div>
        <div class="form-group">
          <div class="input-group">
          	<div class="custom-file">
            		<input type="file" class="custom-file-input" id="exampleInputFile">
            		<label class="custom-file-label" for="exampleInputFile">请选择您的头像图片</label>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="checkbox icheck">
              <label>
                <input type="checkbox"> 同意 <a href="#">用户协议</a>
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block btn-flat">注册</button>
          </div>
          <!-- /.col -->
        </div>
      </form>

      <div class="social-auth-links text-center">
        <p>- OR -</p>
        <a href="#" class="btn btn-block btn-primary">
          <i class="fa fa-facebook mr-2"></i>
          Sign up using Facebook
        </a>
        <a href="#" class="btn btn-block btn-danger">
          <i class="fa fa-google-plus mr-2"></i>
          登录账号
        </a>
      </div>

      <a href="login.html" class="text-center">我已经拥有账户</a>
    </div>
    <!-- /.form-box -->
  </div><!-- /.card -->
</div>
<!-- /.register-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass   : 'iradio_square-blue',
      increaseArea : '20%' // optional
    })
  })
</script>
</body>
</html>
