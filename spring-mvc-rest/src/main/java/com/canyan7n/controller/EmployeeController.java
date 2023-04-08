package com.canyan7n.controller;

import com.canyan7n.dao.EmployeeDao;
import com.canyan7n.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :EmployeeController
 * @date ：2023/4/8 11:47
 * @description：TODO
 * 查询所有员工信息     /employee       get
 * 跳转到添加页面     /to/add          get
 * 添加员工信息       /employee       post
 * 跳转到修改页面     /employee/1      get
 * 修改员工信息       /employee       put
 * 删除员工信息       /employee/1     delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        //获取所有员工信息
        Collection<Employee> allEmployee = employeeDao.getAll();
        /*Iterator<Employee> iterator = all.iterator();
        while (iterator.hasNext()) {
            Employee next =  iterator.next();
            model.addAttribute("id",next.getId());
            model.addAttribute("lastName",next.getLastName());
            model.addAttribute("email",next.getEmail());
            model.addAttribute("gender",next.getGender());
        }*/
        //向请求域共享数据
        model.addAttribute("allEmployee", allEmployee);
        //跳转页面
        return "employee_list";
    }

    @RequestMapping ("/to/add")
    public String testToAdd(){
        return "employee_add";
    }

    //添加
    @PostMapping("/employee")
    public String testAddEmployee(Employee employee){
        //添加员工
        employeeDao.save(employee);
        //重定向到到列表请求 ，表示列表页面
        return "redirect:/employee";
    }
    //修改
    @PutMapping("/employee")
    public String testInsertEmployee(){
        return "";
    }
}
