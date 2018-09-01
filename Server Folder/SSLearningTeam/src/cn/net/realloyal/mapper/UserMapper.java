package cn.net.realloyal.mapper;

import cn.net.realloyal.model.User;
import cn.net.realloyal.vo.SignInRecordingForSQL;

public interface UserMapper {

	public User checkLogin(String userPhoneNumber, String userPassword);

	//检验手机号是否已存在
	public User checkPhoneIsExist(String userPhoneNumber);

	public int registerUser(User user);

	public SignInRecordingForSQL getUserSignInRecording(Integer userId);

	public void addSignInRecording(SignInRecordingForSQL signIn);

	public int updateSignInRecording(int userId, int i, String format, int signInId);

	public int updateSignInRecordingForAdmin(Integer userId, Integer totalTimes);

}
