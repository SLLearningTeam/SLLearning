package cn.net.realloyal.service;

import org.springframework.stereotype.Service;

import cn.net.realloyal.model.User;

@Service
public interface UserService {

	public User checkLogin(String userPhoneNumber,String userPassword) throws Exception;
	
}
