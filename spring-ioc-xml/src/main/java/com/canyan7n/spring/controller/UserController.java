package com.canyan7n.spring.controller;

import com.canyan7n.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 20:52
 */
@Component
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void userSave(){
        userService.userSave();
    }
}
