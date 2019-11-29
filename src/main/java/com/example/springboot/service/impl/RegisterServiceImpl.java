package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.mapper.RoleMapper;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public boolean register(User user) {
        User user1=userMapper.findUserByUsername(user.getUsername());
        if(user1==null){
            userMapper.save(user);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int findRoleIdByRole(String role) {
        return (int)roleMapper.findRoleByRole(role).getId();
    }

}
