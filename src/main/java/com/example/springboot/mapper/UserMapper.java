package com.example.springboot.mapper;

import com.example.springboot.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserMapper extends JpaRepository<User,String> {

    User findUserByUsername(String username);

    Page<User> findAll(Pageable pageable);

    List<User> findAll();

}
