package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.dao.UserDao;
import com.briup.apps.sms.service.UserService;

/**
 * 用户逻辑逻辑处理的实现类
 * */
@Service
public class UserServiceImpl implements UserService {
	// 依赖注入，实例化UserDao并且赋值给userlDao这个变量
	@Resource
	private UserDao UserDao;

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return UserDao.selectAll();
	}
//
	@Override
	public void saveOrUpdate(User user) throws Exception {
		if(user.getId()==null) {
			UserDao.insert(user);
		} else {
			UserDao.update(user);
		}
		
	}

}