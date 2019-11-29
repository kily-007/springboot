package com.example.springboot.mapper;

import com.example.springboot.bean.Meter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeterMapper extends JpaRepository<Meter,String> {

}
