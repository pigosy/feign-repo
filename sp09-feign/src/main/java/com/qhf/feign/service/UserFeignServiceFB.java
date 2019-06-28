package com.qhf.feign.service;

import org.springframework.stereotype.Component;

import com.qhf.common.pojo.User;
import com.qhf.common.util.JsonResult;

@Component
public class UserFeignServiceFB implements UserFeignService {

	@Override
	public JsonResult<User> getUser(Integer userId) {
		return JsonResult.err("无法获取用户信息");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		return JsonResult.err("无法增加用户积分");
	}

}

