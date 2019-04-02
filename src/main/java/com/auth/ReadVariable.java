package com.auth;

import java.util.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ReadVariable {
	static public Map<String, String> getVariable(String fileName){
		Map <String, String> variables = new HashMap<String, String>();
		String jsonData = Common.readPostmanJson(fileName);
		JSONObject jsonObject = JSONObject.parseObject(jsonData);
		JSONArray valuesArray = jsonObject.getJSONArray("values");
		for (int i=0; i<valuesArray.size(); i++){
			String value = valuesArray.getJSONObject(i).getString("value");
			String key = valuesArray.getJSONObject(i).getString("key");
			variables.put(key, value);
		}
		
		return variables;
	}
}
