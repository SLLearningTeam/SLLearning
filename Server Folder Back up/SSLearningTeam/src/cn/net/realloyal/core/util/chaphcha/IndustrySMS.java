package cn.net.realloyal.core.util.chaphcha;

import java.net.URLEncoder;
import java.util.Random;

/**
 * 验证码通知短信接口
 * 
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS
{
	private static String operation = "/industrySMS/sendSMS";
	private static String accountSid = Config.ACCOUNT_SID;
	//private static String to = "18041168530";
	//private static int random = (int)((Math.random())*1000000);
	
	/**
	 * 验证码通知短信
	 */
	public static void execute(String to,int random)
	{
		String tmpSmsContent = null;
		//验证信息
		String smsContent = "【听说在线学习平台】尊敬的用户，您好，您的验证码为"+random+"，如非本人操作，请忽略此短信。";
	    try{
	      tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
	    }catch(Exception e){
	      
	    }
	    String url = Config.BASE_URL + operation;
	    String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + tmpSmsContent
	        + HttpUtil.createCommonParam();

	    // 提交请求
	    String result = HttpUtil.post(url, body);
	    System.out.println("result:" + System.lineSeparator() + result);
	}
}
