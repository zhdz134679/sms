package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Clazz;

public interface ClazzDao {
	List<Clazz> selectAll();
	//查询所有
	void insert(Clazz clazz);
	//插入
	void update(Clazz clazz);
    //更新
	void deleteById(long id);
	//通过ID删除
}
