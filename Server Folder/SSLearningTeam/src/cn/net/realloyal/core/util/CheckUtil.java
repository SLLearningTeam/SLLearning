package cn.net.realloyal.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUtil {

	/**
	 * 判断用户名信息
	 * 【只能是 汉字、数字、小写字母和大写字母】
	 * 汉字：[0x4e00,0x9fa5]（或十进制[19968,40869]）
     * 数字：[0x30,0x39]（或十进制[48, 57]）
     * 小写字母：[0x61,0x7a]（或十进制[97, 122]）
     * 大写字母：[0x41,0x5a]（或十进制[65, 90]）
	 * @param str验证内容
	 * @return 验证结果
	 */
	public static boolean checkUserNameInfo(String str) {
		String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
		return str.matches(regex);
	}
	
	/**
	 * 判断用户名信息长度
	 * @param str 验证内容
	 * @return 验证结果
	 */
	public static boolean checkUserNameLength(String str) {
		return str.length()<10 && str.length()>0;
	}
	
	/**
	 * 判断用户密码信息
	 * 【只能是字母、数字、下划线】
	 * @param str
	 * @return
	 */
	public static boolean checkUserPasswordInfo(String str) {
		String regex = "^[a-z0-9A-Z_]+$";
		return str.matches(regex);
	}
	
	/**
	 * 判断真实密码长度
	 * @param str 密码
	 * @return密码长度是否在6-11之间
	 */
	public static boolean checkUserPasswordLength(String str) {
		return str.length()<=11 && str.length()>=6;
	}
	
	/**
	 * 判断手机号信息
	 * @param phone
	 * @return手机号信息是否正确
	 */
	public static boolean checkUserPhone(String phone) {
	    String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
	    if (phone.length() != 11) {
	        return false;
	    } else {
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(phone);
	        boolean isMatch = m.matches();
	        return isMatch;
	    }
	}
}
