/**
 * @filename testToken.java
 * @author lvtongda
 * @date 2013-09-02
 * @about UPYUN Token 防盗链签名生成
 */

package com;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class UpYun {
	private static String UTF8 = "UTF-8";
	public int time = 600;
	
	public void setTime(int second) {
		this.time = second;
	}
	/**
	 * 生成 token 签名
	 * @return
	 */
	public String toToken(String key, String path) {
		long eTime = new Date().getTime() / 1000 + time;
		String sign = md5(key+"&"+eTime+"&"+path).substring(12, 20) + eTime;
		return sign;
	}
	
	/**
	 * 对字符串进行 MD5 加密
	 * @param strSrc
	 * @return
	 */
	public static String md5(String strSrc) {
		String result = "";
		byte[] temp = null;
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		try {
			temp = md5.digest(strSrc.getBytes(UTF8));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < temp.length; i++) {
			result += Integer.toHexString((0x000000ff & temp[i]) | 0xffffff00).substring(6);
		}
		return result;
	}
}
