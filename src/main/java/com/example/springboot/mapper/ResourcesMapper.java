package com.example.springboot.mapper;

import com.example.springboot.bean.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourcesMapper extends JpaRepository<Resources,String> {
}
