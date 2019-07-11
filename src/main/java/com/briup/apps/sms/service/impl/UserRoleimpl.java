package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.dao.UserRoleDao;
import com.briup.apps.sms.service.UserRoleService;

@Service
public class UserRoleimpl implements UserRoleService {
	@Resource
	private UserRoleDao UserRoleDao;
	public List<UserRole> selectAll() {
		
		return UserRoleDao.selectAll();
	}
	public void saveOrUpdate(UserRole UserRole) throws Exception{
    	if(UserRole.getId()==null) {
    		UserRoleDao.insert(UserRole);
    	}else {
    		UserRoleDao.update(UserRole);
    	}
    }
	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		UserRoleDao.deleteById(id);
	}
	@Override
	public void saveorUpdate(UserRole UserRole) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
