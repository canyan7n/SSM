package com.canyan7n.controller;

import com.canyan7n.pojo.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestAjaxController
 * @date ：2023/4/9 13:40
 * @description：TODO
 */
@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println(request.getMethod());
        System.out.println("id=" + id);
        response.getWriter().write("hello,ajax");
    }

    @RequestMapping("/test/requestBody/json")
    public void testRequestBody(@RequestBody User user,HttpServletResponse response,HttpServletRequest request) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,json");
    }
}
