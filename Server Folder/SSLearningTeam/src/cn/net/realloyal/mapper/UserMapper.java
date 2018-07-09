package cn.net.realloyal.mapper;

import cn.net.realloyal.model.User;

public interface UserMapper {

	public User checkLogin(String userPhoneNumber, String userPassword);

}
