package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public interface RoleDao {
	List<Role> selectAll();
	//查询所有
	void insert(Role role);
	//插入
	void update(Role role);
//更新
}
