package com.example.springboot.controller;

import com.example.springboot.bean.User;
import com.example.springboot.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String register(String btn,String userName, String passWord, String passWord2, String sex, String age, String phone, Map<String,Object> map){
        if(btn.equals("注册")) {
            String message;
            if (userName == null || userName.equals("")) {
                message = "用户名不能为空";
                map.put("message", message);
                return "register";
            } else if (passWord == null || passWord.equals("")) {
                message = "密码不能为空";
                map.put("message", message);
                return "register";
            } else if (passWord2 == null || passWord2.equals("")) {
                message = "请确认密码";
                map.put("message", message);
                return "register";
            } else if (age == null || age.equals("")) {
                message = "年龄不能为空不能为空";
                map.put("message", message);
                return "register";
            } else if (phone == null || phone.equals("")) {
                message = "电话不能为空不能为空";
                map.put("message", message);
                return "register";
            } else if (!passWord.equals(passWord2)) {
                map.put("ms", "两次密码不一致");
                return "register";
            } else {
                User user = new User();
                user.setUsername(userName);
                user.setPassword(passWord);
                user.setSex(sex);
                user.setPhone(phone);
                if (registerService.register(user)) {
                    map.put("message", "注册成功,请返回登录");
                    return "register";
                } else {
                    map.put("message", "注册失败");
                    return "register";
                }
            }
        }else if(btn.equals("取消")){
            return "login";
        }
        return null;
    }
}
