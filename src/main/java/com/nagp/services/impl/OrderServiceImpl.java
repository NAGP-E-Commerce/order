package com.nagp.services.impl;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nagp.cart.dto.CartDTO;
import com.nagp.cart.dto.CartEntryDTO;
import com.nagp.entity.Order;
import com.nagp.entity.OrderEntry;
import com.nagp.services.OrderService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public Order createOrder(String cartId) {
		final CartDTO cart = null; //getCartById(cartId);
		if (Objects.nonNull(cart)) {
			log.debug("ORDER_SERVICE :: Can not fetch cart for id : " + cartId);
		}
		return convertCartToOrder(cart);
	}

	private Order convertCartToOrder(CartDTO cart) {
		Order order = new Order();
		OrderEntry entry = new OrderEntry();
//		order.set
		return order;
	}
	
	private OrderEntry convertCartEntryToOrderEntry(CartEntryDTO cartEntry) {
		OrderEntry orderEntry = new OrderEntry();
		return orderEntry;
	}

}
