package cn.net.realloyal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.realloyal.mapper.UserMapper;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userDao;

	@Override
	public User checkLogin(String userPhoneNumber, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.checkLogin(userPhoneNumber,userPassword);
	}


}
