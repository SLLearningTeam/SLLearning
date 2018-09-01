package cn.net.realloyal.core.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;
/*
 * sha加密工具类——sha加密 单向
 * 调用shaEncrypt实现对字符串的加密
 * 返回长度为64的字符串
 */
public class ShaEncryptUtil {
	/**
     * 使用sha加密
     * @param data 要加密的字符串
     * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
     */
    public static String shaEncrypt(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(data.getBytes("UTF-8"));
        return byte2Hex(messageDigest.digest());
    }
    
    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
    
    @Test
    /**
     * 用于测试sha加密结果
     */
    public void test() throws NoSuchAlgorithmException, UnsupportedEncodingException {
    		System.out.println(shaEncrypt("9989898989898989").length());
    }
}
