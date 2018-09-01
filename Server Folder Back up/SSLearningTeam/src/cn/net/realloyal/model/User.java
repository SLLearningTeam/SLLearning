package cn.net.realloyal.model;

public class User {

	private int userId;

	private String userSex;

	private String userName;

	private String userPassword;

	private String userAvatarUrl;

	private String userPhoneNumber;

	private int userPermission;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAvatarUrl() {
		return userAvatarUrl;
	}

	public void setUserAvatarUrl(String userAvatarUrl) {
		this.userAvatarUrl = userAvatarUrl;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public int getUserPermission() {
		return userPermission;
	}

	public void setUserPermission(int userPermission) {
		this.userPermission = userPermission;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userSex=" + userSex + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userAvatarUrl=" + userAvatarUrl + ", userPhoneNumber=" + userPhoneNumber
				+ ", userPermission=" + userPermission + "]";
	}

	public User() {
		super();
	}

	public User(int userId, String userSex, String userName, String userPassword, String userAvatarUrl,
			String userPhoneNumber, int userPermission) {
		super();
		this.userId = userId;
		this.userSex = userSex;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAvatarUrl = userAvatarUrl;
		this.userPhoneNumber = userPhoneNumber;
		this.userPermission = userPermission;
	}

	
}
