package cn.net.realloyal.mapper;

import cn.net.realloyal.model.User;

public interface UserMapper {

	public User checkLogin(String userPhoneNumber, String userPassword);

	//检验手机号是否已存在
	public User checkPhoneIsExist(String userPhoneNumber);

	public int registerUser(User user);

}
