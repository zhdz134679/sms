package com.briup.apps.sms.dao;

import java.util.List;
import com.briup.apps.sms.bean.UserRole;

public interface UserRoleDao {
    List<UserRole> selectAll();//查询所有
    void insert(UserRole UserRole);
    void update(UserRole UserRole);
   //

}
