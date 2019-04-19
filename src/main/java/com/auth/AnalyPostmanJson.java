package com.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnalyPostmanJson {
	
	static String secretKey = "cOyM1VOd7x2JzQzkjs5R3vtDNmkjutOn";
	
	public  static void main(String args[]) throws IOException{
		String filePath = "C:\\Users\\usrt\\Desktop\\通用接口测试.postman_collection.json";//args[0];
		String envPath = "C:\\Users\\usrt\\Desktop\\thor_web_test_environment.json";
		String api = "E:\\人人视频\\doc\\重构\\api (1).json";
		
		String f="E:\\人人视频\\doc\\重构\\";
		String jsonData = Common.readPostmanJson(api);
		JSONArray jsonArray = JSONObject.parseArray(jsonData);
		for (int i=0; i<jsonArray.size(); i++){
			
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				
				System.out.println(jsonObject.getString("name"));
			
				Common.writePostmanJson("["+jsonObject.toString()+"]", f+jsonObject.getString("name")+".json");
		}
		
		/*if (args.length == 2){
			filePath = args[0];
			envPath = args[1];
		}
		
		
		Map <String , String> variables = ReadVariable.getVariable(envPath);
		
		String jsonData = Common.readPostmanJson(filePath);
		
		jsonData = Common.repalce(jsonData, variables);
		
		JSONObject jsonObject = JSONObject.parseObject(jsonData);
		JSONArray  itemArray = jsonObject.getJSONArray("item");
		
		for (int i=0; i<itemArray.size(); i++){
			JSONArray items = itemArray.getJSONObject(i).getJSONArray("item");
			for (int k=0; k<items.size(); k++){
				JSONObject urlObject = items.getJSONObject(k).getJSONObject("request").getJSONObject("url");
				
			    Map<String, String> paramsMap = new HashMap<>();
			    String sign = "";
				if (urlObject.getJSONArray("query") != null){
					JSONArray queryArray = urlObject.getJSONArray("query");
					
					
					for(int j=0; j<queryArray.size(); j++){
						String key = queryArray.getJSONObject(j).getString("key");
						String value = queryArray.getJSONObject(j).getString("value");
						paramsMap.put(key, value);
					}
					sign = SignatureUtil.createSign(paramsMap, secretKey);
					//System.out.println(sign);
				}
				
				if (!sign.isEmpty()){
					JSONObject requestObject = items.getJSONObject(k).getJSONObject("request");
					JSONArray headerArray =  requestObject.getJSONArray("header");
					for (int j=0; j<headerArray.size(); j++){
						String key = headerArray.getJSONObject(j).getString("key");
						if(key.equals("sign")){
							headerArray.getJSONObject(j).put("value", sign);
							break;
						}
					}
					//System.out.println(jsonObject);
					
				}
				
			}
			
			
			
			
			
		}
		ObjectMapper mapper = new ObjectMapper();
		try {
			Common.writePostmanJson(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject)+"", filePath);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	

	static void paraseItem(JSONArray items){
		
		
	}

	
}
