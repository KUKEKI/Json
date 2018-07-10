package com.jsontest;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class UnitTestJson {

	public static String JSONSTR = "{\"sites\":[{\"name\":\"���Ͽ���\",\"url\":\"www.itmayiedu.com\"},{\"name\":\"ÿ�ؽ���\",\"url\":\"http://meiteedu.com/\"}]}";
	
	@Test
	public void JsonTest(){
		
		JSONObject jsonObject = new JSONObject().parseObject(JSONSTR);
		JSONArray array = jsonObject.getJSONArray("sites");
		for (Object object : array) {
			JSONObject tempJSONObject = (JSONObject)object;
			String name = tempJSONObject.getString("name");
			String url = tempJSONObject.getString("url");
			System.out.println(name +"----------"+url);
	
		}
	}
	
}
