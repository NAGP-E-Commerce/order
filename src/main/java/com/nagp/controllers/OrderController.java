package com.nagp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.entity.Order;
import com.nagp.services.OrderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "OrderController", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/order")
@Validated
public class OrderController {

	private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;

	@GetMapping
	public String test() {
		return "order service";
	}

	@PostMapping
	@ApiOperation("Convert cart to order")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Order.class) })
	public Order createOrder(String cartId) {
		LOG.info("ORDER_SERVICE :: Creating order for the cart id : " + cartId);
		return orderService.createOrder(cartId);
	}
}
