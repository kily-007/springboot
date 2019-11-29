package com.example.springboot.mapper;

import com.example.springboot.bean.SubwayCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubwayCountMapper  extends JpaRepository<SubwayCount,String> {
}
