package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String login(){
        return "login";
    }


    @GetMapping("/login")
    public String login(String username, String password, Map<String,Object> map, HttpSession session){
        if (loginService.login(username, password)) {
            System.out.println(username+":"+password);
            session.setAttribute("uername", username);
            return "welcome";
        }
        else {
            if(username==null||password==null||username.equals("")||password.equals(""))
                map.put("msg", "用户名或密码不能为空");
            else
                map.put("msg","用户名或密码错误");
            return "login";
        }
    }

}
