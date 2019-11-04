package com.example.springboot.mapper;

import com.example.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User,String> {

    User findUserByUsername(String username);



//    boolean insertUser(User user);

}
