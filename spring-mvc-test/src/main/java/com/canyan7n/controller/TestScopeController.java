package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestScopeController
 * @date ：2023/4/6 19:25
 * @description：TODO
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope","hello,mav");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        System.out.println(model.getClass().getName());
        model.addAttribute("testRequestScope","hello,model");
        return "success";
    }
    @RequestMapping("/test/modelmap")
    public String testmodelmap(ModelMap modelMap){
        System.out.println(modelMap.getClass().getName());
        modelMap.addAttribute("testRequestScope","hello,modelmap");
        return "success";
    }

    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        System.out.println(map.getClass().getName());
        map.put("testRequestScope","hello,map");
        return "success";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }
}
