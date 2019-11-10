package com.example.springboot.service;

import com.example.springboot.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SystemManageService {
    Page<User> findAllSystemUsers(Pageable pageable);

    List<User> findAllSystemUsers();

    Integer countAllSystemUsers();

}
