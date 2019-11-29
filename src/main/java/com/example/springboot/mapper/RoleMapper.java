package com.example.springboot.mapper;

import com.example.springboot.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMapper  extends JpaRepository<Role,String> {
    Role findRoleByRole(String role);

}
