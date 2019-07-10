package com.briup.apps.sms.service;

import java.util.List;

import javax.management.relation.Role;


public interface RoleService {
   
	List<Role> selectAll();
	
	void saveOrUpdate(Role role) throws Exception;
}