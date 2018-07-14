package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.AesEncryptUtil;
import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CheckUtil;
import cn.net.realloyal.core.util.ShaEncryptUtil;
import cn.net.realloyal.mapper.UserMapper;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userDao;

	@Override
	public User checkLogin(String userPhoneNumber, String userPassword) throws Exception {
		//AES解密处理并转交数据访问层
		userPhoneNumber = AesEncryptUtil.desEncrypt(userPhoneNumber).trim();
		userPassword = AesEncryptUtil.desEncrypt(userPassword).trim();
		userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
		System.out.println(userPassword.length());
		System.out.println(userPassword);
		return userDao.checkLogin(userPhoneNumber,userPassword);
	}

	@Override
	public BackJsonUtil checkRegister(User user,CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		//对用户名和密码进行aes解码
		String userName = AesEncryptUtil.desEncrypt(user.getUserName()).trim();
		String userPassword = AesEncryptUtil.desEncrypt(user.getUserPassword()).trim();
		BackJsonUtil back = new BackJsonUtil();
		if(user.getUserPermission() == 1) {
			back.setStatus(false);
			back.setInfo("请不要自行修改权限值!");
		}else if(!CheckUtil.checkUserNameInfo(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入包含数字、字母或汉字的用户名");
		}else if(!CheckUtil.checkUserNameLength(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入1-10位用户名");
		}else if(!CheckUtil.checkUserPasswordInfo(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入包含字母、数字或下划线的密码");
		}else if(!CheckUtil.checkUserPasswordLength(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入6-11位密码");
		}else if(!CheckUtil.checkUserPhone(user.getUserPhoneNumber())) {
			back.setStatus(false);
			back.setInfo("用户手机号信息有误，请重新输入");
		}else if(userDao.checkPhoneIsExist(user.getUserPhoneNumber())!=null) {
			back.setStatus(false);
			back.setInfo("用户手机号已存在，请重新输入");
		}else {
			userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
			user.setUserPassword(userPassword);
			user.setUserName(userName);
			// 获得原始文件名  
	        String fileName = userAvatar.getOriginalFilename();  
	        System.out.println("原始文件名:" + fileName);  
	        // 新文件名  
	        String newFileName = UUID.randomUUID() + user.getUserPhoneNumber() + "Avatar.png";  
	        System.out.println("新文件名:" + newFileName); 
	        // 获得项目的路径  
	        ServletContext sc = request.getSession().getServletContext();  
	        // 上传位置  
	        String path = sc.getRealPath("/AvatarImgs") + "/"; // 设定文件保存的目录  
	        File f = new File(path);  
	        if (!f.exists())  
	            f.mkdirs();  
	        if (!userAvatar.isEmpty()) {  
	            try {  
	                FileOutputStream fos = new FileOutputStream(path + newFileName);  
	                InputStream in = userAvatar.getInputStream();  
	                int b = 0;  
	                while ((b = in.read()) != -1) {  
	                    fos.write(b);  
	                }  
	                fos.close();  
	                in.close();  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }
	        user.setUserAvatarUrl(path+newFileName);
	        System.out.println("头像名称地址为:"+user.getUserAvatarUrl());
	        System.out.println("头像名称地址长度为:"+user.getUserAvatarUrl().length());
			int registerStatus = userDao.registerUser(user);
			if(registerStatus==1) {
				back.setStatus(true);
				back.setInfo("恭喜您，注册成功");
			}else {
				back.setStatus(false);
				back.setInfo("遇到未知错误，请稍后再试!");
			}
		}
		return back;
	}

	@Override
	public BackJsonUtil getChaphcha(String userPhoneNumber, int randomChaphcha) {
		// TODO Auto-generated method stub
		BackJsonUtil back = new BackJsonUtil();
		if(randomChaphcha>0&&randomChaphcha<1000000) {
			back.setStatus(true);
			back.setInfo(randomChaphcha);
		}else {
			back.setStatus(false);
			back.setInfo("遇到未知错误，请重试！");
		}
		return back;
	}

	@Override
	public Boolean checkPhoneIsExist(String userPhoneNumber) {
		User user = userDao.checkPhoneIsExist(userPhoneNumber);
		return user == null;
	}

	@Override
	public User getUser(String userPhoneNumber, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		userPhoneNumber = AesEncryptUtil.encrypt(userPhoneNumber);
		return checkLogin(userPhoneNumber,userPassword);
	}


}
