package com.bjpowernode.crm.setttings.service.impl;

import com.bjpowernode.crm.setttings.dao.UserDao;
import com.bjpowernode.crm.setttings.service.UserService;
import com.bjpowernode.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {

    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

}
