package com.jt.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jt.vo.SysResult;

import lombok.extern.slf4j.Slf4j;

/**
 *项目全局异常的抓取
 * @author Sunmany
 *
 */
@RestControllerAdvice//异常通知对controller有效
@Slf4j//记录日志
public class SysException {
	
	//当系统中出现运行时异常时生效
	@ExceptionHandler(RuntimeException.class)
	public SysResult error(RuntimeException e) {
		e.printStackTrace();//打印出错的日志信息
		log.error(e.getMessage());
		return SysResult.fail();//调用失败方法
	}

}
