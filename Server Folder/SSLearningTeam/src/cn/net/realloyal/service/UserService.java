package cn.net.realloyal.service;

import org.springframework.stereotype.Service;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.User;

@Service
public interface UserService {

	public User checkLogin(String userPhoneNumber,String userPassword) throws Exception;

	public BackJsonUtil checkRegister(User user) throws Exception;

	public BackJsonUtil getChaphcha(String userPhoneNumber, int randomChaphcha);
	
}
