package com.canyan7n.spring.dao.impl;

import com.canyan7n.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/25 19:22
 */
//@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存用户成功");
    }
}
