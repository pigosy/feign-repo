package com.qhf.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qhf.common.pojo.Item;
import com.qhf.common.pojo.Order;
import com.qhf.common.pojo.User;
import com.qhf.common.util.JsonResult;
import com.qhf.feign.service.ItemFeignService;
import com.qhf.feign.service.OrderFeignService;
import com.qhf.feign.service.UserFeignService;

@RestController
public class FeignController {
	@Autowired
	private ItemFeignService itemServcie;
	@Autowired
	private UserFeignService userServcie;
	@Autowired
	private OrderFeignService orderServcie;
	
	@GetMapping("/item-service/{orderId}")
	public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
		return itemServcie.getItems(orderId);
	}

	@PostMapping("/item-service/decreaseNumber")
	public JsonResult decreaseNumber(@RequestBody List<Item> items) {
		return itemServcie.decreaseNumber(items);
	}

	/////////////////////////////////////////-----
	
	@GetMapping("/user-service/{userId}")
	public JsonResult<User> getUser(@PathVariable Integer userId) {
		return userServcie.getUser(userId);
	}

	@GetMapping("/user-service/{userId}/score") 
	public JsonResult addScore(@PathVariable Integer userId, Integer score) {
		return userServcie.addScore(userId, score);
	}
	
	/////////////////////////////////////////
	
	@GetMapping("/order-service/{orderId}")
	public JsonResult<Order> getOrder(@PathVariable String orderId) {
		return orderServcie.getOrder(orderId);
	}

	@GetMapping("/order-service")
	public JsonResult addOrder() {
		return orderServcie.addOrder();
	}
}
