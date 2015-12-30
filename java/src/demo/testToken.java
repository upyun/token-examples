/**
 * @filename testToken.java
 * @author lvtongda
 * @date 2013-09-02
 * @about UPYUN Token 防盗链签名生成 Demo
 */

package demo;

import com.UpYun;

public class testToken {
	//Token 密钥
	private static String KEY = "";
	// 文件 URI，如：/100.jpg
	private static String PATH = "";
	
	private static UpYun upyun = null;
	
	public static void main(String []args) {
		upyun = new UpYun();
		
		// 设置过期时间，默认600s
		//upyun.setTime(1200);
		
		testToToken();
	}
	
	public static void testToToken() {
		String sign = upyun.toToken(KEY, PATH);
		System.out.println(sign);
	}
}
