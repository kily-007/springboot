package com.example.springboot.service;

import com.example.springboot.bean.User;

public interface RegisterService {
    boolean register(User user);

    int findRoleIdByRole(String role);
}
