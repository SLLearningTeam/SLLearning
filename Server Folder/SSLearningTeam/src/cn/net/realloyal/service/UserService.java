package cn.net.realloyal.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.List;

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

	public BackJsonUtil getUserInfoById(Integer userId);

	public BackJsonUtil deleteUser(Integer userId);

	public User getUserInfo(Integer userId);

	public int getPageNumber();

	public List<User> getUsersByPageNum(Integer pageNum);

	public BackJsonUtil updateUserInfo(Integer userId, String userName, String userSex, String userPhoneNumber,
			String userPassword, CommonsMultipartFile userAvatar,HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException;

	public int updateUserInfoByAdmin(Integer userId, String userName, String userSex, String userPhoneNumber,
			String userPassword, CommonsMultipartFile userAvatar,HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException;

	public Object getSexRate();

	public Object getDownloadRate();

	public Object getSignInTimeRate();

	public Object getSignInTotal();

	User checkLoginByUser(String userPhoneNumber, String userPassword) throws Exception;

	BackJsonUtil checkRegisterByUser(User user, CommonsMultipartFile userAvatar, HttpServletRequest request)
			throws Exception;
	
}
