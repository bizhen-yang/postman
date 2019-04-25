package com.auth;

import com.alibaba.fastjson.JSON;

public class TT {
	public static void main(String[] args) {
		Object obj = JSON.parse("{aa:\'sss\'}");
		System.out.println(JSON.toJSONString(obj));
	}
}
