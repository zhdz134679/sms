package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.College;

public interface CollegeDao {
	List<College> selectAll();
	//查询所有
	void insert(College college);
	//插入
	void update(College college);
//更新
	void deleteById(long id);
	//通过ID删
}