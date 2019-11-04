package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String username,String password) {
        if(username==null||password==null||username.equals("")||password.equals("")) {
            return false;
        }

        User user=userMapper.findUserByUsername(username);
        if(user!=null&&password.equals(user.getPassword()))
            return true;
        else
            return false;
    }

}
