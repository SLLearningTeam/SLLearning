package cn.net.realloyal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public BackJsonUtil checkRegister(User user) throws Exception {
		//aes解码用户密码
		String userPassword = AesEncryptUtil.desEncrypt(user.getUserPassword()).trim();
		BackJsonUtil back = new BackJsonUtil();
		if(user.getUserPermission() == 1) {
			back.setStatus(false);
			back.setInfo("请不要自行修改权限值!");
		}else if(!CheckUtil.checkUserNameInfo(user.getUserName())) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入包含数字、字母或汉字的用户名");
		}else if(!CheckUtil.checkUserNameLength(user.getUserName())) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入1-10位用户名");
		}else if(!CheckUtil.checkUserPasswordInfo(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入包含字母、数字或下划线的密码");
		}else if(!CheckUtil.checkUserPasswordLength(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入6-11位密码");
		}else if(user.getUserAvatarUrl()==null) {
			back.setStatus(false);
			back.setInfo("请提交您的头像！");
		}else if(!CheckUtil.checkUserPhone(user.getUserPhoneNumber())) {
			back.setStatus(false);
			back.setInfo("用户手机号信息有误，请重新输入");
		}else if(userDao.checkPhoneIsExist(user.getUserPhoneNumber())!=null) {
			back.setStatus(false);
			back.setInfo("用户手机号已存在，请重新输入");
		}else {
			userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
			user.setUserPassword(userPassword);
			user.setUserPermission(0);
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


}
