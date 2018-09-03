package cn.net.realloyal.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.net.realloyal.core.util.AesEncryptUtil;
import cn.net.realloyal.core.util.BackJsonUtil;
import cn.net.realloyal.core.util.CalculateStartIndex;
import cn.net.realloyal.core.util.CheckUtil;
import cn.net.realloyal.core.util.ShaEncryptUtil;
import cn.net.realloyal.mapper.UserMapper;
import cn.net.realloyal.model.User;
import cn.net.realloyal.service.UserService;
import cn.net.realloyal.vo.DownloadNumAndCount;
import cn.net.realloyal.vo.SignInRecordingForSQL;
import cn.net.realloyal.vo.SignInTimeAndCount;
import cn.net.realloyal.vo.SignInTotalAndUserName;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userDao;

	@Override
	public User checkLogin(String userPhoneNumber, String userPassword) throws Exception {
		//AES解密处理并转交数据访问层
		userPhoneNumber = AesEncryptUtil.desEncrypt(userPhoneNumber).trim();
		userPassword = AesEncryptUtil.desEncrypt(userPassword).trim();
		userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
		System.out.println(userPassword.length());
		System.out.println(userPassword);
		return userDao.checkLogin(userPhoneNumber,userPassword);
	}
	
	@Override
	public User checkLoginByUser(String userPhoneNumber, String userPassword) throws Exception {
		userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
		System.out.println(userPassword.length());
		System.out.println(userPassword);
		return userDao.checkLogin(userPhoneNumber,userPassword);
	}

	@Override
	public BackJsonUtil checkRegister(User user,CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		//对用户名和密码进行aes解码
		String userName = AesEncryptUtil.desEncrypt(user.getUserName()).trim();
		String userPassword = AesEncryptUtil.desEncrypt(user.getUserPassword()).trim();
		BackJsonUtil back = new BackJsonUtil();
		if(user.getUserPermission() == 1) {
			back.setStatus(false);
			back.setInfo("请不要自行修改权限值!");
		}else if(!CheckUtil.checkUserNameInfo(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入包含数字、字母或汉字的用户名");
		}else if(!CheckUtil.checkUserNameLength(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入1-10位用户名");
		}else if(!CheckUtil.checkUserPasswordInfo(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入包含字母、数字或下划线的密码");
		}else if(!CheckUtil.checkUserPasswordLength(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入6-11位密码");
		}else if(!CheckUtil.checkUserPhone(user.getUserPhoneNumber())) {
			back.setStatus(false);
			back.setInfo("用户手机号信息有误，请重新输入");
		}else if(userDao.checkPhoneIsExist(user.getUserPhoneNumber())!=null) {
			back.setStatus(false);
			back.setInfo("用户手机号已存在，请重新输入");
		}else {
			userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
			user.setUserPassword(userPassword);
			user.setUserName(userName);
			// 获得原始文件名  
	        String fileName = userAvatar.getOriginalFilename();  
	        System.out.println("原始文件名:" + fileName);  
	        // 新文件名  
	        String newFileName = UUID.randomUUID() + user.getUserPhoneNumber() + "Avatar.png";  
	        System.out.println("新文件名:" + newFileName); 
	        // 获得项目的路径  
	        ServletContext sc = request.getSession().getServletContext();  
	        // 上传位置  
	        String path = sc.getRealPath("/AvatarImgs") + "/"; // 设定文件保存的目录  
	        File f = new File(path);  
	        if (!f.exists())  
	            f.mkdirs();  
	        if (!userAvatar.isEmpty()) {  
	            try {  
	                FileOutputStream fos = new FileOutputStream(path + newFileName);  
	                InputStream in = userAvatar.getInputStream();  
	                int b = 0;  
	                while ((b = in.read()) != -1) {  
	                    fos.write(b);  
	                }  
	                fos.close();  
	                in.close();  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }
	        user.setUserAvatarUrl(newFileName);
	        System.out.println("头像名称地址为:"+user.getUserAvatarUrl());
	        System.out.println("头像名称地址长度为:"+user.getUserAvatarUrl().length());
			int registerStatus = userDao.registerUser(user);
			if(registerStatus==1) {
				back.setStatus(true);
				back.setInfo("恭喜您，注册成功");
			}else {
				back.setStatus(false);
				back.setInfo("遇到未知错误，请稍后再试!");
			}
		}
		return back;
	}

	@Override
	public BackJsonUtil checkRegisterByUser(User user,CommonsMultipartFile userAvatar,HttpServletRequest request) throws Exception {
		//对用户名和密码进行aes解码
		String userName = user.getUserName();
		String userPassword = user.getUserPassword();
		BackJsonUtil back = new BackJsonUtil();
		if(user.getUserPermission() == 1) {
			back.setStatus(false);
			back.setInfo("请不要自行修改权限值!");
		}else if(!CheckUtil.checkUserNameInfo(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入包含数字、字母或汉字的用户名");
		}else if(!CheckUtil.checkUserNameLength(userName)) {
			back.setStatus(false);
			back.setInfo("用户名输入有误，请输入1-10位用户名");
		}else if(!CheckUtil.checkUserPasswordInfo(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入包含字母、数字或下划线的密码");
		}else if(!CheckUtil.checkUserPasswordLength(userPassword)) {
			back.setStatus(false);
			back.setInfo("用户密码输入有误，请输入6-11位密码");
		}else if(!CheckUtil.checkUserPhone(user.getUserPhoneNumber())) {
			back.setStatus(false);
			back.setInfo("用户手机号信息有误，请重新输入");
		}else if(userDao.checkPhoneIsExist(user.getUserPhoneNumber())!=null) {
			back.setStatus(false);
			back.setInfo("用户手机号已存在，请重新输入");
		}else {
			userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
			user.setUserPassword(userPassword);
			user.setUserName(userName);
			// 获得原始文件名  
	        String fileName = userAvatar.getOriginalFilename();  
	        System.out.println("原始文件名:" + fileName);  
	        // 新文件名  
	        String newFileName = UUID.randomUUID() + user.getUserPhoneNumber() + "Avatar.png";  
	        System.out.println("新文件名:" + newFileName); 
	        // 获得项目的路径  
	        ServletContext sc = request.getSession().getServletContext();  
	        // 上传位置  
	        String path = sc.getRealPath("/AvatarImgs") + "/"; // 设定文件保存的目录  
	        File f = new File(path);  
	        if (!f.exists())  
	            f.mkdirs();  
	        if (!userAvatar.isEmpty()) {  
	            try {  
	                FileOutputStream fos = new FileOutputStream(path + newFileName);  
	                InputStream in = userAvatar.getInputStream();  
	                int b = 0;  
	                while ((b = in.read()) != -1) {  
	                    fos.write(b);  
	                }  
	                fos.close();  
	                in.close();  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }
	        user.setUserAvatarUrl(newFileName);
	        System.out.println("头像名称地址为:"+user.getUserAvatarUrl());
	        System.out.println("头像名称地址长度为:"+user.getUserAvatarUrl().length());
			int registerStatus = userDao.registerUser(user);
			if(registerStatus==1) {
				back.setStatus(true);
				back.setInfo("恭喜您，注册成功");
			}else {
				back.setStatus(false);
				back.setInfo("遇到未知错误，请稍后再试!");
			}
		}
		return back;
	}
	
	@Override
	public BackJsonUtil getChaphcha(String userPhoneNumber, int randomChaphcha) {
		// TODO Auto-generated method stub
		BackJsonUtil back = new BackJsonUtil();
		if(randomChaphcha>0&&randomChaphcha<1000000) {
			back.setStatus(true);
			back.setInfo(randomChaphcha);
		}else {
			back.setStatus(false);
			back.setInfo("遇到未知错误，请重试！");
		}
		return back;
	}

	@Override
	public Boolean checkPhoneIsExist(String userPhoneNumber) {
		User user = userDao.checkPhoneIsExist(userPhoneNumber);
		return user == null;
	}

	@Override
	public User getUser(String userPhoneNumber, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		userPhoneNumber = AesEncryptUtil.encrypt(userPhoneNumber);
		return checkLogin(userPhoneNumber,userPassword);
	}

	@Override
	public BackJsonUtil getUserSignInRecording(Integer userId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		SignInRecordingForSQL signInRecordingForSQL = userDao.getUserSignInRecording(userId);
		if(signInRecordingForSQL == null) {
			SignInRecordingForSQL signIn = new SignInRecordingForSQL(0,userId,0,null);
			userDao.addSignInRecording(signIn);
			signInRecordingForSQL = userDao.getUserSignInRecording(userId);
		}
		backJsonUtil.setStatus(true);
		backJsonUtil.setInfo(signInRecordingForSQL);
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil addSignInRecording(Integer userId) throws ParseException {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		SignInRecordingForSQL signInRecordingForSQL = userDao.getUserSignInRecording(userId);
		if(signInRecordingForSQL == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("发生未知错误，请重试");
		}else {
			DateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			if(signInRecordingForSQL.getRecentMark()==null) {
				int num = userDao.updateSignInRecording(signInRecordingForSQL.getUserId(),signInRecordingForSQL.getTotalTimes()+1,date.format(new Date()),signInRecordingForSQL.getSignInId());
				backJsonUtil.setStatus(true);
				backJsonUtil.setInfo(userDao.getUserSignInRecording(userId));
			}else {
				Date dateRecord = date.parse(signInRecordingForSQL.getRecentMark().substring(0, 19));
				Date now = new Date();
				int dateRecordYear = dateRecord.getYear();
				int dateRecordMonth = dateRecord.getMonth();
				int dateRecordDate = dateRecord.getDate();
				int nowYear = now.getYear();
				int nowMonth = now.getMonth();
				int nowDate = now.getDate();
				System.out.println("year:"+nowYear+"  nowMonth:"+nowMonth+"  nowDate:"+nowDate);
				if(dateRecordYear==nowYear&&dateRecordMonth==nowMonth&&dateRecordDate==nowDate) {
					backJsonUtil.setStatus(false);
					backJsonUtil.setInfo("您今日已经签到，请明日再来");
				}else if(dateRecordYear==nowYear&&dateRecordMonth==nowMonth&&(nowDate-dateRecordDate)==1) {
					int num = userDao.updateSignInRecording(signInRecordingForSQL.getUserId(),signInRecordingForSQL.getTotalTimes()+1,date.format(now),signInRecordingForSQL.getSignInId());
					backJsonUtil.setStatus(true);
					backJsonUtil.setInfo(userDao.getUserSignInRecording(userId));
				}else {
					int num = userDao.updateSignInRecording(signInRecordingForSQL.getUserId(),1,date.format(now),signInRecordingForSQL.getSignInId());
					backJsonUtil.setStatus(true);
					backJsonUtil.setInfo(userDao.getUserSignInRecording(userId));
				}
			}
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil updateSignInRecording(Integer userId, Integer totalTimes) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		int num = userDao.updateSignInRecordingForAdmin(userId,totalTimes);
		if(num == 0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("修改失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("修改成功");
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil getUserInfoById(Integer userId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		User user = userDao.getUserInfoById(userId);
		if(user == null) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("用户不存在");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo(user);
		}
		return backJsonUtil;
	}

	@Override
	public BackJsonUtil deleteUser(Integer userId) {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		if(userDao.deleteUser(userId)==0) {
			backJsonUtil.setStatus(false);
			backJsonUtil.setInfo("删除失败");
		}else {
			backJsonUtil.setStatus(true);
			backJsonUtil.setInfo("删除成功");
		}
		return backJsonUtil;
	}

	@Override
	public User getUserInfo(Integer userId) {
		return userDao.getUserInfoById(userId);
	}

	@Override
	public int getPageNumber() {
		int userCountNum=userDao.getUserCountNum();
		int totalPages = (int)(userCountNum)/10+1;
		return totalPages;
	}

	@Override
	public List<User> getUsersByPageNum(Integer pageNum) {
		int startIndex = CalculateStartIndex.getStartIndex(pageNum, 10);
		return userDao.getUsersByPageNum(startIndex);
	}

	@Override
	public BackJsonUtil updateUserInfo(Integer userId, String userName, String userSex, String userPhoneNumber,
			String userPassword, CommonsMultipartFile userAvatar,HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		BackJsonUtil backJsonUtil = new BackJsonUtil();
		int change=0;
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserPermission(0);
		user.setUserPhoneNumber(userPhoneNumber);
		user.setUserSex(userSex);
		userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
		user.setUserPassword(userPassword);
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/AvatarImgs") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/AvatarImgs/";
        if (!userAvatar.isEmpty()) {  
        		// 源介绍图片资源文件名
	 		String originalInstructionImgName = userAvatar.getOriginalFilename();
	 		// 新介绍图片文件名  
	        String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = userAvatar.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            String userAvatarUrl=sourcePath+newInstructionImgName;
            user.setUserAvatarUrl(userAvatarUrl);
            change = userDao.updateUserInfoByAdminWithAvatar(user);
        
        }else {
        		change = userDao.updateUserInfoByAdminWithoutAvatar(user);
        
        }
        if(change==0) {
        		backJsonUtil.setStatus(false);
        		backJsonUtil.setInfo("修改失败");
        }else {
        		backJsonUtil.setStatus(true);
        		backJsonUtil.setInfo("修改成功");
        }
        return backJsonUtil;
	}

	@Override
	public int updateUserInfoByAdmin(Integer userId, String userName, String userSex, String userPhoneNumber,
			String userPassword, CommonsMultipartFile userAvatar,HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		int change=0;
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserPermission(0);
		user.setUserPhoneNumber(userPhoneNumber);
		user.setUserSex(userSex);
		userPassword = ShaEncryptUtil.shaEncrypt(userPassword);
		user.setUserPassword(userPassword);
        // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/AvatarImgs") + "/"; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
        //资源基本路径
        String sourcePath = sc.getContextPath()+"/AvatarImgs/";
        if (!userAvatar.isEmpty()) {  
        		// 源介绍图片资源文件名
	 		String originalInstructionImgName = userAvatar.getOriginalFilename();
	 		// 新介绍图片文件名  
	        String newInstructionImgName = UUID.randomUUID() + originalInstructionImgName;
            try {  
                FileOutputStream fos = new FileOutputStream(path + newInstructionImgName);  
                InputStream in = userAvatar.getInputStream();  
                int b = 0;  
                while ((b = in.read()) != -1) {  
                    fos.write(b);  
                }  
                fos.close();  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            String userAvatarUrl=sourcePath+newInstructionImgName;
            user.setUserAvatarUrl(userAvatarUrl);
            change = userDao.updateUserInfoByAdminWithAvatar(user);
        }else {
        		change = userDao.updateUserInfoByAdminWithoutAvatar(user);
        }
        return change;
	}

	@Override
	public Map<String,Integer> getSexRate() {
		Map<String,Integer> sexRate = new HashMap<String,Integer>();
		sexRate.put("manNum", userDao.getManNum());
		sexRate.put("womanNum", userDao.getWomanNum());
		return sexRate;
	}

	@Override
	public List<DownloadNumAndCount> getDownloadRate() {
		List<DownloadNumAndCount> downloadNumAndCounts = userDao.getDownloadRate();
		System.out.println("downloadNumAndCounts:"+downloadNumAndCounts);
		return downloadNumAndCounts;
	}

	@Override
	public List<SignInTimeAndCount> getSignInTimeRate() {
		List<SignInTimeAndCount>signInTimeAndCounts=userDao.getSignInTimeRate();
		System.out.println("signInTimeAndCounts:"+signInTimeAndCounts);
		return signInTimeAndCounts;
	}

	@Override
	public List<SignInTotalAndUserName> getSignInTotal() {
		List<SignInTotalAndUserName>signInTotalAndUserName=userDao.getSignInTotal();
		System.out.println("signInTotalAndUserName:"+signInTotalAndUserName);
		return signInTotalAndUserName;
	}


}
