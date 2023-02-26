package com.canyan7n.spring.controller;

import com.canyan7n.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.crypto.interfaces.PBEKey;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/25 19:19
 */
//@Controller("controller")
@Controller
public class UserController {

    @Autowired
//    @Qualifier("userServiceImpl")
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
