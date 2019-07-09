package com.briup.apps.sms.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("findAll")
	public String findAll() {
		// 1. 从数据库中查询出所有的学生
		// 2. 将所有学生返回
		return "hello springboot";
	}
}
