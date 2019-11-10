package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public String login(String username, String password, Map<String,Object> map, HttpServletRequest request){
        if (loginService.login(username, password)) {
            System.out.println(username+":"+password);
            request.getSession().setAttribute("username", username);
            return "redirect:index";
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
