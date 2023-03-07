package com.canyan7n.spring.service.impl;

import com.canyan7n.spring.dao.UserDao;
import com.canyan7n.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 20:55
 */
@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userSave() {
        userDao.userSave();
    }
}
