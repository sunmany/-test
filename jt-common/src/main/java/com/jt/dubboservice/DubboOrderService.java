package com.jt.dubboservice;

import com.jt.porder.Order;

public interface DubboOrderService {

	String saveOrder(Order order);

	Order findById(String id);
}
