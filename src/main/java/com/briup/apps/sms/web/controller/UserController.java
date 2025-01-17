package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<User> selectAll(){
		
		return userService.selectAll();
		// http://localhost:8080/school/deleteById?id=3
		
	
		}
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			userService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(User user) {
		try {
			userService.saveOrUpdate(user);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	
}
