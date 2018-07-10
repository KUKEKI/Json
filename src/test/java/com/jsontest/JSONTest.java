package com.jsontest;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONTest {

	static String JSONSTR = "{\"sites\":[{\"name\":\"蚂蚁课堂\",\"url\":\"www.itmayiedu.com\"},{\"name\":\"每特教育\",\"url\":\"http://meiteedu.com/\"}]}";
	
	public static void main(String[] args) {
		
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
