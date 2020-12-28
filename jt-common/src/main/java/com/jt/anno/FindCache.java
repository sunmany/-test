package com.jt.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解主要实现查询操作（方法描述）
 * @author Sunmany
 *
 */
@Retention(RetentionPolicy.RUNTIME)//在运行时有效
@Target(ElementType.METHOD)//在方法上有效
public @interface FindCache {

	/**
	 * key:
	 * 1、如果用户没有赋值
	 * 		
	 * 
	 * 
	 * 2、如果用户赋值
	 * @return
	 */
	String key() default "";
	int seconds() default 0;//设置缓存的时间
	
}
