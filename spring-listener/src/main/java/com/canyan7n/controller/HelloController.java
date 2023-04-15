package com.canyan7n.controller;

import com.canyan7n.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :HelloController
 * @date ：2023/4/15 15:31
 * @description：TODO
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
