package com.auth;

import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

public class JsonCreateJs {

	public static void main(String[] args) {

		String jsonStr ="E:\\人人视频\\doc\\重构\\body.json";
		String jsonData = Common.readPostmanJson(jsonStr);
		
		
		
        //System.out.println("assert.equal(status, 200)\nassert.deepEqual(body.code, \"0000\")  \n"); 
		
        JSONObject jsonObject = JSONObject.parseObject(jsonData);
        Set<String> bodyKey = jsonObject.keySet();
        boolean n = true;
        String body = "var bodyKey=[\"";
        for (String key : bodyKey) {
        	if (n){
        		body = body + key;
        		n = false;
        	}else{
        		body = body +"\",\""+key;
        	}
        }
        System.out.println(body+"\"]\ncheckValue(body, bodyKey)\n");
        
		JSONObject dataObject = jsonObject.getJSONObject("data");
		Set<String> dataKey= dataObject.keySet();
		body = "var dataKey=[\"";
		n = true;
        for (String key : dataKey) {
        	if (n){
        		body = body + key;
        		n = false;
        	}else{
        		body = body +"\",\""+key;
        	}
        	
           
            if (JSON.parse(dataObject.getString(key)) instanceof JSONObject){
            	System.out.print("var "+key+"=[");
            	JSONObject dataObject1 = dataObject.getJSONObject(key);
            	 Set<String> key1 = dataObject1.keySet();
             
                 
                 boolean flag = true;
                 for (String keyi : key1){
                 	if (flag){
                 		System.out.print("\""+keyi);
                 		flag = false;
                 	}else{
                 		System.out.print("\",\""+keyi);
                 	}
                 	
                 	
                 }
                 System.out.println("\"]\ncheckValue(body.data."+key+", "+key+")\n");
            }
            else if(JSON.parse(dataObject.getString(key)) instanceof JSONArray){
            	JSONArray dataArray = dataObject.getJSONArray(key);
            	Set<String> key1 = dataArray.getJSONObject(0).keySet();
            	System.out.print("var "+key+"=[");
            	 boolean flag = true;
                 for (String keyi : key1){
                 	if (flag){
                 		System.out.print("\""+keyi);
                 		flag = false;
                 	}else{
                 		System.out.print("\",\""+keyi);
                 	}
                 	
                 	
                 }
                 System.out.println("\"]\ncheckValue(body.data."+key+", "+key+")\n");
            }
            
            
        }
        System.out.println(body+"\"]\ncheckValue(body.data, dataKey)");
	}

}
