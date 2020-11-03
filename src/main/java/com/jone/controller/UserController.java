package com.jone.controller;

import com.jone.po.User;
import com.jone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //用户注册
    @RequestMapping("/toCreat")
    public String toCreatUser(){

        return "register";
    }

    //完成用户注册
    @PostMapping("/creat")
    public String creatUser(User user){
        userService.creatUser(user);
        return "logon";
    }

    //用户登录
    @PostMapping("/toLogin")
    public String login(String userName, String password, HttpSession session){

        User user = userService.findUserByUP(userName,password);
        if(user != null){
            session.setAttribute("userName",user.getUserName());
        }
        return "redirect:/index.jsp";
    }

    //用户退出
    @GetMapping("/outLogin")
    public String login(HttpSession session){


        session.removeAttribute("userName");

        return "redirect:/index.jsp";
    }
}
