package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.service.UserRoleService;

@RestController
@RequestMapping("/UserRole")

public class UserRoleController {
	@Autowired
	private UserRoleService UserRoleService;
	@PostMapping("savOrUpdate")
	public String saveOrUpdate(UserRole UserRole) {
		try {
			UserRoleService.saveOrUpdate(UserRole);
			return"保存或更新成功";
		
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	@GetMapping("selectAll")
	public List<UserRole> selectAll(){
		
		return UserRoleService.selectAll();
	}
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			UserRoleService.deleteById(id);
			return"删除成功";
		}catch (Exception e) {
			//打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
//
}
