package com.example.springboot.service.impl;

import com.example.springboot.bean.DataLoad;
import com.example.springboot.bean.User;
import com.example.springboot.bean.UserRight;
import com.example.springboot.mapper.DataLoadMapper;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.mapper.UserRightMappper;
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
    @Autowired
    private DataLoadMapper dataLoadMapper;
    @Autowired
    private UserRightMappper userRightMappper;
    @Override
    public Page<User> findAllSystemUsers(Pageable pageable) {
        return userMapper.findAll(pageable);
    }

    @Override
    public Page<UserRight> findPageUserRight(Pageable pageable) {
        return userRightMappper.findAll(pageable);
    }

    @Override
    public Page<DataLoad> findPageDataLoad(Pageable pageable) {
        return dataLoadMapper.findAll(pageable);
    }

    @Override
    public List<DataLoad> findAllDataLoad() {
        return dataLoadMapper.findAll();
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
