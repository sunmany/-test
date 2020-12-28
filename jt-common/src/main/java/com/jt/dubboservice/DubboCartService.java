package com.jt.dubboservice;

import java.util.List;

import com.jt.pojo.Cart;

public interface DubboCartService {

	List<Cart> findById(long userid);

	void updataNum(Cart cart);

	void deleteItemCart(Cart cart);

	void addItemCart(Cart cart);

}
