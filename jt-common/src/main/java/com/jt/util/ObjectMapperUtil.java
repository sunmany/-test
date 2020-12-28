package com.jt.util;

import java.io.IOException;

import org.springframework.remoting.RemoteTimeoutException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

	public static final ObjectMapper om = new ObjectMapper();
	//对象转json
	public static String toJson(Object data)  {
		
		String json;
		try {
			json=om.writeValueAsString(data);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException("缓存json的类错误！");
		}
		return json;
	}
	//json转对象
	public static <T>T toObject(String json,Class<T> cls) {
		T obj=null;
		try {
			obj=om.readValue(json, cls);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("json转对象类中错误！");
		} 
		return obj;
	}
	
	
}
