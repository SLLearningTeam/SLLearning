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
  <style type="text/css">
  	.errorStyle{
  		color:red;
  		margin-left:7%;
  		margin-top:5px;
  		margin-bottom:0px;
  		font-size:1em;
  		font-family: Georgia;
  	}
  </style>
</head>
<body class="hold-transition register-page">
<!-- 遮罩层 -->
<div id="selffade" style="width:100%;height:100%;background-color:#fff;opacity:0.9;position: fixed;left: 0;top: 0;bottom:0;z-index: 99;text-align:center;margin:auto;vertical-align: middle;">
	<div id="loading" style="margin-top:300px;"><img src="${pageContext.request.contextPath}/img/icon/loading.gif"/></div>
</div>
<div class="register-box">
  <div class="register-logo">
    <a href="#"><b>听说 </b> 在线学习平台</a>
  </div>

  <div class="card">
    <div class="card-body register-card-body">
      <p class="login-box-msg" id="prompt">注册账户</p>

      <form id="registerForm" enctype='multipart/form-data'>
        <div class="form-group has-feedback">
          <span class="fa fa-user form-control-feedback" style="display: inline;margin-right:2%"></span>
          <input type="text" class="form-control" name="userName" placeholder="请输入您的用户名" style="width:92%;display:inline">
        </div>
        <div class="form-group has-feedback">
        	  <span>请选择您的性别：&nbsp;&nbsp;</span>
          <input type="radio" class="flat-red" name="userSex" value="男" checked="checked">&nbsp;&nbsp;男
          <input type="radio" class="flat-red" name="userSex" value="女">&nbsp;&nbsp;女
        </div>
        <div class="form-group has-feedback">
        		<span class="fa fa-phone form-control-feedback" style="display: inline;margin-right:2%"></span>
        	    <input type="text" class="form-control" name="userPhoneNumber" placeholder="请输入您的手机号" style="width:92%;display:inline">
        	    <div>
	        	  	<input type="button" id="sendChaphcha" class="btn btn-block btn-outline-secondary btn-lg" style="padding:0.4rem;margin-top:-6px;margin-right:2%;width:30%;display:inline;font-size: 0.8rem;margin-left:7%" value="发送验证码" onclick="clickSendChaphcha()">
	        	  	<input type="text" class="form-control" name="chaphcha" placeholder="请填写验证码" style="margin-top:2%;width:60%;display:inline"/>        	    
        	    </div>
        </div>
        <div class="form-group has-feedback">
        	  <span class="fa fa-lock form-control-feedback" style="display: inline;margin-right:3%"></span>
          <input type="password" class="form-control" name="userPassword" placeholder="请输入您的密码" style="width:92%;display:inline" >
        </div>
        <div class="form-group has-feedback">
        	  <span class="fa fa-lock form-control-feedback" style="display: inline;margin-right:3%"></span>
          <input type="password" class="form-control" name="checkPassword" style="width:92%;display:inline" placeholder="请重新输入您的密码">
        </div>
        <div class="form-group">
          <div class="input-group" id="userAvatarParent">
          	<div class="custom-file">
            		<input type="file" name="userAvatar" class="custom-file-input form-control" id="userAvatar" onchange="userAvatorChange()">
            		<label class="custom-file-label" for="userAvatar" id="fileName">请选择您的头像图片</label>
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
            <button type="submit" id="submitRegister" class="btn btn-primary btn-block btn-flat" onclick="registerSubmit()">注册</button>
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

      <a href="${pageContext.request.contextPath}/user/init" class="text-center">我已经拥有账户</a>
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
<!-- validate -->
<script src="${pageContext.request.contextPath}/js/plugins/validation/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/validation/messages_zh.js"></script>
<!-- require.js -->
<script src="${pageContext.request.contextPath}/js/require.js"></script>
<!-- AES加密 -->
<script src="${pageContext.request.contextPath}/js/aes.js"></script>
<!-- 自定义js文件 -->
<script src="${pageContext.request.contextPath}/js/selfdefine.js"></script>
<script>
  //用户头像变更函数
  function userAvatorChange(){
	var file = $('[name="userAvatar"]').val();
	var fileName = getFileName(file);
	$('#fileName').text(fileName);
  }
  
  //获取文件名函数
  function getFileName(file){
	  var pos=file.lastIndexOf("\\");
      return file.substring(pos+1);  
  }
  
  //验证手机号函数
  function checkUserPhone(userPhone){
  	var realPhone = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
  	if(realPhone.test(userPhone)){
  		return true;
  	}else{
  		return false;
  	}
  }
  
  //点击发送验证码请求
  function clickSendChaphcha(){
	  var $sendButton = $("#sendChaphcha");
	  var $userPhoneNumber = $("[name='userPhoneNumber']");
	  if(checkUserPhone($userPhoneNumber.val())){
		  var count = 120;//倒计时时长
		  $.ajax({
		      type:"POST",
		      url: "${pageContext.request.contextPath}/user/getchaphcha",
		      data: $userPhoneNumber.serialize(),
		      timeout:2000,
		      success:function(result){
		    	  	if(!result.status){
		    	  		alert(result.info);
		    	  	}
		      },
		      error:function(result){
		    	  	alert(result);
		      }
		    });
			$sendButton.attr("disabled","disabled");
			$sendButton.val("剩余 "+count+"s");
			(function countdown(){
			 if(count==0){
			  $sendButton.removeAttr("disabled");
			  $sendButton.val("发送验证码");
			 }else{
			  setTimeout(function(){
				  count-=1;
				  $sendButton.val("剩余 "+count+"s");
				  countdown();
			  },1000)
			 }
			})();
	  }else{
		$userPhoneNumber.focus();
	  }
  }
  
  $(function () {
	$("#selffade").hide();
	$('#loading').hide(); 
	// 上传文件名称显示
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass   : 'iradio_square-blue',
      increaseArea : '20%' // optional
    })
    
    //validation手机号校验函数
    $.validator.addMethod("isMobile", function(value, element) {
		var length = value.length;
 		var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
		return this.optional(element) || (length == 11 && mobile.test(value));
	}, "请填写正确的手机号码");
	
    //上传文件验证
    $.validator.addMethod("checkPic",function(value,element){
    		var filepath=$("[name='userAvatar']").val();
        //获得上传文件名
        var fileArr=filepath.split("\\");
        var fileTArr=fileArr[fileArr.length-1].toLowerCase().split(".");
        var filetype=fileTArr[fileTArr.length-1];
        //切割出后缀文件名
        if(filetype!="jpg"){
            if(filetype!="png"){
                return false;
            }else{
                return true;
            }
        }else{
	        	return true;
        }
    },"上传图片格式不合适");
    
    //注册验证
    $('#registerForm').validate({
    		rules:{
    			userName:{
    				required:true,
    				rangelength:[1,10]
    			},
    			userPhoneNumber:{
    				required:true,
    				maxlength:11,
    				number:true,
    				isMobile:true
    			},
    			chaphcha:{
    				required:true,
    				number:true,
    				rangelength:[6,6]
    			},
    			userPassword:{
    				required:true,
    				minlength:6,
    				maxlength:20
    			},
    			checkPassword:{
    				required:true,
    				minlength:6,
    				maxlength:20,
    				equalTo:"[name='userPassword']"
    			},
    			userAvatar:{
    				required:true,
    				checkPic:true
    			}
    		},
    		messages:{
    			userName:{
    				required:"请输入用户名",
    				rangelength:"请输入1-10位的用户名"
    			},
    			userPhoneNumber:{
    				required:"请输入手机号",
    				minlength:"请填写正确的手机号码",
    				number:"请输入正确的手机号"
    			},
    			chaphcha:{
    				required:"请输入验证码",
    				number:"请输入正确的验证码",
    				rangelength:"请输入正确的验证码"
    			},
    			userPassword:{
    				required:"请输入密码",
    				minlength:"请输入至少6位密码",
    				maxlength:"您输入的密码过长"
    			},
    			checkPassword:{
    				required:"请重新输入密码",
    				minlength:"请输入至少6位密码",
    				maxlength:"您输入的密码过长",
    				equalTo:"您两次输入的密码不同"
    			},
    			userAvatar:{
    				required:"请选择您的头像",
    				checkPic:"请选择正确的文件"
    			}
    		},
    		//错误信息展示位置设定
    		errorPlacement: function(error, element) { 
    			//如果是用户名，错误提示在元素下方
    			if(element.is("[name='userName']")){
    				error.addClass("errorStyle");
        		    error.appendTo(element.parent()); 
    			}else if(element.is("[name='userPhoneNumber']")){
    				error.addClass("errorStyle");
    				element.after(error);
    			}else if(element.is("[name='chaphcha']")){
    				error.addClass("errorStyle");
    				error.appendTo(element.parent()); 
    			}else if(element.is("[name='userPassword']")){
    				error.addClass("errorStyle");
    				error.appendTo(element.parent()); 
    			}else if(element.is("[name='checkPassword']")){
    				error.addClass("errorStyle");
    				error.appendTo(element.parent()); 
    			}else if(element.is("[name='userAvatar']")){
    				error.addClass("errorStyle");
    				error.appendTo($("#userAvatarParent").parent()); 
    			}
    		}
	  })
  })
  
	//提交方法
	function registerSubmit() {
		if (!$("#registerForm").valid()) {
		   return;
		}
		var formData = new FormData();//必须是new FormData后台才能接收到
		formData.append("userName", cbcAesEncrypt($("input[name='userName']").val()));
		formData.append("userSex", $("input[name='userSex']:checked").val());
		formData.append("userPhoneNumber", $("input[name='userPhoneNumber']").val());
		formData.append("chaphcha", $("input[name='chaphcha']").val());
		formData.append("userPassword", cbcAesEncrypt($("input[name='userPassword']").val()));
		formData.append("userAvatar", $("#userAvatar")[0].files[0]);
	    $.ajax({
	      type:"POST",
	      cache: false,
	      url: "${pageContext.request.contextPath}/user/register",
	      data: formData,
	      contentType: false,//必须false才会自动加上正确的Content-Type
	      processData: false,//必须false才会避开jQuery对 formdata 的默认处理，XMLHttpRequest会对 formdata 进行正确的处理 
	      beforeSend:loading,
	      complete:complete,
	      success:success,
	      error:error
	    });
	}
  
	//加载函数
	function loading(){
	 // 禁用按钮防止重复提交
	    $("#submitRegister").attr({ disabled: "disabled" });
	    $("#selffade").show();
	 	$('#loading').show(); 
	}
	
	//加载完成函数
	function complete(){
	 	$('#loading').hide();
		$("#selffade").hide();
		$("#submitRegister").removeAttr('disabled');
	 }
	
	//加载成功函数
	function success(result){
	  	  	if(result.status){
	  	  		location.href="${pageContext.request.contextPath}/user/toindex"
	  	  	}
	  	  	else{
	  	  		var prompt = result.info;
	  	  		$("#prompt").html(prompt).css("color","red");
	  	  	}
	}
	
	//加载失败函数
	function error(result){
	 	alert(result);
	}
</script>
</body>
</html>
