package com.example.springSecurity.controller;

import com.example.springSecurity.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController1 {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "admin",method = RequestMethod.GET)
    public String adminPage(ModelMap model){
        return "admin";
    }

    @RequestMapping(value = "adminService" ,method = RequestMethod.GET)
    public String adminService(ModelMap model){
        adminService.performsomeService();
        return "admin";
    }

    @RequestMapping(value = "admin/service" ,method = RequestMethod.GET)
    public String adminSubSerivece(ModelMap model){
        adminService.performsomeService();
        return "admin";
    }


}
