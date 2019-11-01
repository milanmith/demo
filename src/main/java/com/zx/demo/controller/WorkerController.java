package com.zx.demo.controller;


import com.zx.demo.service.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("worker")
public class WorkerController {
    @Autowired
    private WorkerServiceImpl userService;


    @RequestMapping("register")
    @ResponseBody
    public String register(Integer id, String name, Integer age,String address,Integer salary, Date date){
        userService.register(id,name,age,address,salary,date);
        return "success";
    }

    @RequestMapping("find")
    public String find(Integer id){
        return userService.find(id).toString();
    }

    @RequestMapping("delete")
    public String delete1(Integer id){
        userService.delete(id);
        return "success";
    }

    @RequestMapping("update")
    public String update(Integer id, String name, Integer age, String address, Integer salary, Date date){
        userService.update(id, name, age, address, salary, date);
        return "success";
    }

}
