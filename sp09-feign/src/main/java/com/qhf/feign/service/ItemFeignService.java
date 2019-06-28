package com.qhf.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qhf.common.pojo.Item;
import com.qhf.common.util.JsonResult;

/**
 * item-service
 * localhost:8001
 * localhost:8002
 */
@FeignClient(name="item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
	@GetMapping("/{orderId}")
	JsonResult<List<Item>> getItems(@PathVariable String orderId);

	@PostMapping("/decreaseNumber")
	JsonResult decreaseNumber(@RequestBody List<Item> items);
}