package com.example.springboot.mapper;

import com.example.springboot.bean.UserRight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRightMappper extends JpaRepository<UserRight,String> {
}
