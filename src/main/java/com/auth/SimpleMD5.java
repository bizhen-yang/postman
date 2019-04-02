package com.auth;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密�?易工具类
 * @author donghw
 * */

public class SimpleMD5 {

	// md5加密  
	public static String md5(String inputText) {
		return encrypt(inputText, "md5");
	}

	// sha加密  
	public static String sha(String inputText) {
		return encrypt(inputText, "sha-1");
	}

	/** 
	 * md5或�?�sha-1加密 
	 *  
	 * @param inputText 
	 *            要加密的内容 
	 * @param algorithmName 
	 *            加密算法名称：md5或�?�sha-1，不区分大小�? 
	 * @return 
	 */
	private static String encrypt(String inputText, String algorithmName) {
		if (inputText == null || "".equals(inputText.trim())) {
			throw new IllegalArgumentException("请输入要加密的内�?");
		}
		if (algorithmName == null || "".equals(algorithmName.trim())) {
			algorithmName = "md5";
		}
		String encryptText = null;
		try {
			MessageDigest m = MessageDigest.getInstance(algorithmName);
			m.update(inputText.getBytes("UTF8"));
			byte s[] = m.digest();
			// m.digest(inputText.getBytes("UTF8"));  
			return hex(s);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encryptText;
	}

	// 返回十六进制字符�?  
	private static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();
	}

}
