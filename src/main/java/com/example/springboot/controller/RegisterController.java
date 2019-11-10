package com.example.springboot.controller;

import com.example.springboot.bean.User;
import com.example.springboot.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(String username, String password, String password2, String sex, String phone, String email,
                           String employer, String remarks, Map<String, Object> map, HttpServletResponse response) throws IOException {
        if (!password.equals(password2)) {
            map.put("ms", "两次密码不一致");
            return "register";
        } else {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setPhone(phone);
            user.setEmail(email);
            user.setEmployer(employer);
            user.setRemarks(remarks);
            PrintWriter out = response.getWriter();
            if (registerService.register(user)) {
                out.print("<script language=\"javascript\";charset=\"utf-8\">alert('register succeed!');window.location.href='/login'</script>");
                System.out.println("注册成功");
                return null;
            } else {
                out.print("<script language=\"javascript\";charset=\"utf-8\">alert('register failure! username existed ');window.location.href='register'</script>");
                System.out.println("注册失败,该用户名已注册。");
                return null;
            }

        }
    }





}

