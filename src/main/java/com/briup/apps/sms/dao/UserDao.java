package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User;

public interface UserDao {
	
	List<User> selectAll();  //查询所有
	
	void insert(User user);//插入
	
	void update(User user); //更新
	// 通过ID删除
		void deleteById(long id);
	
}
