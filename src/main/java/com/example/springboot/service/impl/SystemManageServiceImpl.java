package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.SystemManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemManageServiceImpl implements SystemManageService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Page<User> findAllSystemUsers(Pageable pageable) {
        return userMapper.findAll(pageable);
    }

    @Override
    public List<User> findAllSystemUsers() {
        return userMapper.findAll();
    }

    @Override
    public Integer countAllSystemUsers() {
        return (int)userMapper.count();
    }
}
