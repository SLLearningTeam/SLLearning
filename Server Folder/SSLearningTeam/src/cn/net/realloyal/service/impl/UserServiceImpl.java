package cn.net.realloyal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.realloyal.core.util.AesEncryptUtil;
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
		return userDao.checkLogin(userPhoneNumber,userPassword);
	}


}
