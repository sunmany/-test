package com.jt.dubboservice;

import com.jt.pojo.User;

public interface DubboUserService {

	void insartIntoAll(User user);

	String findByUP(User user);

	
	 
}
