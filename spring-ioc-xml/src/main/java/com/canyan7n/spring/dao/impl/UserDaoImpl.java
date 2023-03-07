package com.canyan7n.spring.dao.impl;

import com.canyan7n.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 20:55
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void userSave() {
        System.out.println("保存用户成功");
    }
}
