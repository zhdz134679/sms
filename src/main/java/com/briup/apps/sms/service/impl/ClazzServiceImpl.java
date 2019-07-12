package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.dao.ClazzDao;
import com.briup.apps.sms.service.ClazzService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class ClazzServiceImpl implements ClazzService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private ClazzDao ClazzDao;

	@Override
	public List<Clazz> selectAll() {
		// TODO Auto-generated method stub
		return ClazzDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Clazz clazz) throws Exception {
		if(clazz.getId()==null) {
			ClazzDao.insert(clazz);
		} else {
			ClazzDao.update(clazz);
		}
		
	}
	@Override
	public void deleteById(long id) throws Exception {
		ClazzDao.deleteById(id);
	}

}