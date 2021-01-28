package com.nagp.services;

import org.springframework.stereotype.Service;

import com.nagp.entity.Order;

@Service
public interface OrderService {

	Order createOrder(String cartId);

}
