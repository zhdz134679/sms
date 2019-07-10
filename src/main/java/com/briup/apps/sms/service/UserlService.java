package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.User;

public interface UserlService {
	
	List<User> selectAll();
	
	void saveOrUpdate(User user) throws Exception;
}
