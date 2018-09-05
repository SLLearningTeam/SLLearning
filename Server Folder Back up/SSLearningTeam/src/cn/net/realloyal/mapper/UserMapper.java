package cn.net.realloyal.mapper;

import java.util.List;

import cn.net.realloyal.model.User;
import cn.net.realloyal.vo.DownloadNumAndCount;
import cn.net.realloyal.vo.SignInRecordingForSQL;
import cn.net.realloyal.vo.SignInTimeAndCount;
import cn.net.realloyal.vo.SignInTotalAndUserName;

public interface UserMapper {

	public User checkLogin(String userPhoneNumber, String userPassword);

	//检验手机号是否已存在
	public User checkPhoneIsExist(String userPhoneNumber);

	public int registerUser(User user);

	public SignInRecordingForSQL getUserSignInRecording(Integer userId);

	public void addSignInRecording(SignInRecordingForSQL signIn);

	public int updateSignInRecording(int userId, int i, String format, int signInId);

	public int updateSignInRecordingForAdmin(Integer userId, Integer totalTimes);

	//通过Id获得用户信息
	public User getUserInfoById(Integer userId);

	//通过Id删除用户信息
	public int deleteUser(Integer userId);

	//获得用户记录的总个数
	public int getUserCountNum();

	//获得用户指定页号的记录信息
	public List<User> getUsersByPageNum(int startIndex);

	//获得用户中sex为男的总人数
	public Integer getManNum();

	//获得用户中sex为女的总人数
	public Integer getWomanNum();

	//获得所有下载时间与总次数
	public List<DownloadNumAndCount> getDownloadRate();

	//获得所有签到时间与总次数
	public List<SignInTimeAndCount> getSignInTimeRate();

	//获得所有用户名和签到总次数
	public List<SignInTotalAndUserName> getSignInTotal();

	//更新用户信息带头像
	public int updateUserInfoByAdminWithAvatar(User user);

	//更新用户信息不带头像
	public int updateUserInfoByAdminWithoutAvatar(User user);
	
}
