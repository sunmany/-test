package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysResult {
	/**
	 * status：状态码（200正常，201失败）
	 * message：返回信息（服务器传到页面的信息）
	 * data：返回数据
	 */
	private Integer status;
	private String message;
	private Object data;

	/**
	 * 封装请求成功时，响应的参数
	 * @param msg
	 * @return
	 */
	public static SysResult succes(String msg) {
		return new SysResult(200,msg,null);
	}
	
	public static SysResult success() {
		return new SysResult(200,"服务器执行成功！",null);
	}
	
	public static SysResult success(Object data) {
		return new SysResult(200,"服务器执行成功！",data);
	}
	
	public static SysResult success(String msg,Object data) {
		return new SysResult(200,msg,data);
	}
	/**
	 * 服务器在响应失败的时候,传到前端的值
	 */
	public static SysResult fail() {
		return new SysResult(201,"服务器执行失败！",null);
	}
	
	public static SysResult fail(String msg) {
		return new SysResult(201,msg,null);
	}
	
}
