package com.example.springboot.service;

import com.example.springboot.bean.DataLoad;
import com.example.springboot.bean.User;
import com.example.springboot.bean.UserRight;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SystemManageService {
    Page<User> findAllSystemUsers(Pageable pageable);

    Page<UserRight> findPageUserRight(Pageable pageable);

    Page<DataLoad> findPageDataLoad(Pageable pageable);

    List<DataLoad> findAllDataLoad();

    List<User> findAllSystemUsers();

    Integer countAllSystemUsers();

}
