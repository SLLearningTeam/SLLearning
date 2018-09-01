package cn.net.realloyal.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.model.User;

@Service
public interface UserService {

	public User checkLogin(String userPhoneNumber,String userPassword) throws Exception;

	public Boolean checkPhoneIsExist(String userPhoneNumber);
	
	public BackJsonUtil checkRegister(User user, CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception;

	public BackJsonUtil getChaphcha(String userPhoneNumber, int randomChaphcha);

	public User getUser(String userPhoneNumber, String userPassword) throws Exception;

	public BackJsonUtil getUserSignInRecording(Integer userId);

	public BackJsonUtil addSignInRecording(Integer userId) throws ParseException;

	public BackJsonUtil updateSignInRecording(Integer userId, Integer totalTimes);
	
}
