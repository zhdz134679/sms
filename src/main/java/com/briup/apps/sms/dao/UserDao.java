package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User;

public interface UserDao {
	
	List<User> selectAll();  //查询所有
	
	void insert(User user1);//插入
	
	void update(User user1); //更新
	//
	
}
