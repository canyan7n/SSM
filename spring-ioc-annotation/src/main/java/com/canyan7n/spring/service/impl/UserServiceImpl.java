package com.canyan7n.spring.service.impl;

import com.canyan7n.spring.dao.UserDao;
import com.canyan7n.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/25 19:21
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
//    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
